const apikey = "";
const apiurl = "";

async function checkWeather() {
    const response = await fetch(apiurl + `&appid=${apikey}`);
    var data = await response.json();

    
}