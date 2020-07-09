function testArray() {
    var fruits;
    fruits = ['Apple', 'Orange', 'Strawberry', "Chikooooo"];
    for (var i in fruits) {
        console.log(fruits[i]);
    }
    var multi = ['hey', 1, 2, 44, 'hellooo'];
    for (var i in multi) {
        console.log(multi[i]);
    }
    fruits.pop();
    fruits.push("Guava");
    fruits.push("Pineapple");
    fruits = fruits.concat(['Mango', 'Watermelon']);
    fruits.sort();
    console.log(fruits);
    console.log(fruits.indexOf('Mango'));
    fruits.forEach(function (n) {
        console.log(n);
    });
    console.log(fruits.slice(1, 3));
    console.log("after slice   " + fruits);
    console.log(fruits.splice(0, 1)); //splice(positon, how many ele from that position)
    console.log("after splice " + fruits);
    fruits.splice(fruits.indexOf("Strawberry"), 1);
    console.log("after splicing Strawberry " + fruits);
}
testArray();
