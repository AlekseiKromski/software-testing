package triangle

enum class TriangleTypes{
    IS_EQUILATERAL,
    IS_ISOSCELES,
    IS_SCALENE,
    IS_NOT_A_TRIANGLE
}

class Triangle(
    var a: Int,
    var b: Int,
    var c: Int
) {

    //Get type of triangle by sides
    fun defineTriangle() : TriangleTypes{
        if (!this.checkRanges()) return TriangleTypes.IS_NOT_A_TRIANGLE
        if (a < b + c || b < a + c || c < a + b) {
            return when {
                (a == b &&  a == c && b == c) ->  TriangleTypes.IS_EQUILATERAL
                (a == b || a == c || c == b)  ->  TriangleTypes.IS_ISOSCELES
                (a != b || a != c || b != c ) ->  TriangleTypes.IS_SCALENE
                else -> TriangleTypes.IS_NOT_A_TRIANGLE
            }
        }
        return TriangleTypes.IS_NOT_A_TRIANGLE
    }

    //Check ranges
    private fun checkRanges(): Boolean{
        for (variable in listOf(a, b, c)){
            if (variable >= 200 || variable <= 1){
                return false
            }
        }
        return true
    }

}