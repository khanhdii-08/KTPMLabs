const express = require("express")

const app = express()

app.get("/hello2", (req, res) => {
    res.send("hello 2")
})

app.listen(4000, () => {
    console.log("start port 4000");
})