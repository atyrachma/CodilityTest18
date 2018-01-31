// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A, K) {
    // write your code in JavaScript (Node.js 8.9.4)
    var len = A.length;
    K = K > len ? K % len : K;
    return A.slice(len - K).concat(A.slice(0, len - K));
}
