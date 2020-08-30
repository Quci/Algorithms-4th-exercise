function binarySearch(key, a) {
    let low = 0;
    let high = a.length - 1;
    while (low <= high) {
        let mid = Math.floor((low + high) / 2);
        if (key < a[mid]) {
            high = mid - 1;
        } else if (key > a[mid]) {
            low = mid + 1;
        } else {
            return mid
        }
    }
    return -1;
}

let arr = [1, 5, 23, 34, 45, 56, 66, 74, 88, 90, 94, 667];
console.log('index of number 34: ', binarySearch(5, arr));
console.log('index of number 667: ', binarySearch(667, arr));
console.log('index of number 1: ', binarySearch(1, arr));
console.log('index of number 94: ', binarySearch(94, arr));
