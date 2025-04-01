
function isPrime(n) {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}


function sum(numbers) {
    return numbers.reduce((acc, num) => acc + num, 0);
}


function fibonacci(n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}


function gcd(a, b) {
    return b === 0 ? a : gcd(b, a % b);
}


function quickSort(arr) {
    if (arr.length <= 1) return arr;
    let pivot = arr[arr.length - 1];
    let left = arr.filter(el => el < pivot);
    let right = arr.filter(el => el > pivot);
    let middle = arr.filter(el => el === pivot);
    return [...quickSort(left), ...middle, ...quickSort(right)];
}


function countInRange(data, N) {
    return data.filter(num => num >= data[0] && num <= N).length;
}


console.log("É primo?", isPrime(17));
console.log("Fibonacci(6):", fibonacci(6));
console.log("MDC(24, 36):", gcd(24, 36));
console.log("Ordenação:", quickSort([3, 1, 4, 1, 5, 9, 2, 6, 5, 3]));
console.log("Contagem:", countInRange([3, 1, 4, 1, 5, 9, 2, 6, 5, 3], 5));
