// 25  12  6   3   1
// 2       16  32
//
// 11  5   2   1
// 3   6       24

function mystery0(a, b) {
    if (b === 0) {
        return 0
    }

    if (b % 2 === 0) {
        return mystery0(a + a, Math.floor(b / 2));
    }

    return mystery0(a + a, Math.floor(b / 2)) + a;
}

console.log(mystery0(2, 25));
console.log(mystery0(3, 11));


function mystery1(a, b) {
    if (b === 0) {
        return 1
    }

    if (b % 2 === 0) {
        return mystery1(a + a, Math.floor(b / 2));
    }

    return mystery1(a + a, Math.floor(b / 2)) * a;
}

console.log(mystery1(2, 25));
console.log(mystery1(3, 11));