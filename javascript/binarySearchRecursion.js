function binarySearchRecursion(key, a) {
    return _binarySearchRecursion(key, a, 0, a.length - 1)
}

function _binarySearchRecursion(key, a, lo, hi) {
    if (lo > hi) {
        return -1
    }
    let mid = Math.floor(lo + hi);
    if (key > a[mid]) {
        return _binarySearchRecursion(key, a, mid + 1, hi);
    } else if (key < a[mid]) {
        return _binarySearchRecursion(key, a, lo, mid - 1);
    } else {
        return mid
    }
}

let whiteList = [1, 5, 23, 34, 45, 56, 66, 74, 88, 90, 94, 667];
console.log("66 index is: " + binarySearchRecursion(66, whiteList));
console.log("23 index is: " + binarySearchRecursion(23, whiteList));
console.log("667 index is: " + binarySearchRecursion(667, whiteList));
console.log("3 index is: " + binarySearchRecursion(3, whiteList));