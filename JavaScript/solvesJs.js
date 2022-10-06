// ----------------Exercise 2-------------------

alert(s2. toLowerCase ());

// ----------------Exercise 3-------------------

mostrar = function(param){
    param();
}

mostrar(showString => console.log("Openbravo!!!"));

// ----------------Exercise 4-------------------

/*Example:
[1, 0, 0], [0, 2, 0], [0, 0, 3] ]) = true
[1, 0, 0], [0, 2, 3], [0, 0, 3] ]) = false
*/
var matrix = [[1, 0, 0], [0, 2, 0], [0, 0, 3]]

function isDiagonal (matrixParam){
    let isDiagonalOrNot = true;
    for (auxRow in matrixParam){
        for (auxColumn in matrixParam[auxRow]){
            if ((auxRow!=auxColumn)&&(matrixParam[auxRow][auxColumn]!=0)){
                isDiagonalOrNot = false;
            }            
        }
    }
    return isDiagonalOrNot;
}

console.log(isDiagonal(matrix));
