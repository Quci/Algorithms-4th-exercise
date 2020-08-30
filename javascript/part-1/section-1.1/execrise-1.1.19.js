function fibonacci_0(n) {
    if (n === 0) {
        return 0
    }

    if (n === 1) {
        return 1
    }

    return fibonacci_0(n - 1) + fibonacci_0(n - 2)
}

// for (let i = 0; i < 100; ++i) {
//     console.log(i, '----', fibonacci_0(i))
// }

function fibonacci_1(n) {
    let arr = [0, 1];
    for (let i = 0; i < n; ++i) {
        arr.push(arr[0] + arr[1]);
        arr.shift();
    }
    return arr[0]
}

for (let i = 0; i < 10; ++i) {
    console.log(i, fibonacci_1(i));
}

// console.time()
// for (let i = 0; i < 1000; ++i) {
//     fibonacci_1(i);
// }
// console.timeEnd()


function fibonacci_2(n) {
    function _fibonacci_2(a, b, next) {
        if (next < n) {
            return _fibonacci_2(b, a + b, next + 1)
        } else {
            return a + b;
        }
    }

    if (n <= 1) {
        return n
    }

    return _fibonacci_2(0, 1, 2)
}

for (let i = 0; i < 10; ++i) {
    console.log(i, fibonacci_2(i));
}

// console.time()
// for (let i = 0; i < 1000; ++i) {
//     fibonacci_2(i);
// }
// console.timeEnd()

