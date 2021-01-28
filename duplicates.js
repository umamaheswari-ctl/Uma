function duplicates(arr) {
    for (var i = 0; i < arr.length; i++) {
        for (var j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                return { element: arr[j], index: j };
            }
        }
    }
}
// function duplicatesIndex(arr){
//     for(var i=0;i<arr.length; i++){
//         for(var j=i+1; j<arr.length;j++) {
//             if(arr[i]==arr[j]){
//                 return j;
//             }
//         }
//     }
// }
var arr = [12, 15, 12, 13, 1, 5, 18];
if ((duplicates(arr)).element == '12') {
    console.log("Test is successful");
}
// console.log(duplicatesIndex(arr));
console.log("Duplicate element is: " + duplicates(arr).element);
console.log("Index of duplicate element is: " + duplicates(arr).index);
