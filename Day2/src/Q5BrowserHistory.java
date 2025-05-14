import java.util.Stack;

class BrowserHistory {
    private Stack<String> history = new Stack<>();
    private String currentPage;

    public void visit(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
        }
        return currentPage;
    }

    public String viewCurrent() {
        return currentPage;
    }

    public void viewHistory() {
        System.out.println("Current: " + currentPage);
        System.out.println("History:");
        for (String url : history) {
            System.out.println(url);
        }
    }

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visit("google.com");
        bh.visit("github.com");
        bh.visit("stackoverflow.com");
        bh.viewHistory();
        System.out.println("Going back to: " + bh.goBack());
        bh.viewHistory();
    }
}
