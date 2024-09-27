var numbers = [5, 2, 4, 6, 1, 3];

console.log(numbers);
var len = numbers.length
for (let i = len - 2; i > -1 ; i--) {
    let key = numbers[i];
    let indexAfter = i + 1;

    while (indexAfter < len && numbers[indexAfter] < key) {
        let auxKey = numbers[indexAfter] 
        numbers[indexAfter] = numbers[indexAfter - 1];
        numbers[indexAfter - 1] = auxKey;
        indexAfter++;
    }

}

console.log(numbers);