const axios = require("axios");

const instance = axios.create({
    baseURL: 'http://localhost:8080',
});

instance.get('/calculate', {
    params: {
        a: 5,
        b: 6,
        operator: '+'
    }
}).then((res) => {
    console.log(res.data);
}).catch((err) => {
    console.log(err);
});