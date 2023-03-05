package triangle

enum class TriangleTypes{
    IS_EQUILATERAL,
    IS_ISOSCELES,
    IS_SCALENE,
    IS_NOT_A_TRIANGLE
}

class Triangle(
    private var a: Int,
    private var b: Int,
    private var c: Int
) {

    //Get type of triangle by sides
    fun defineTriangle() : TriangleTypes{
        if (!this.checkRanges()) return TriangleTypes.IS_NOT_A_TRIANGLE
        var result: TriangleTypes = TriangleTypes.IS_NOT_A_TRIANGLE
        if (a < b + c || b < a + c || c < a + b) {
            when {
                (a == b && a == c && b == c) -> result = TriangleTypes.IS_EQUILATERAL
                (a == b || a == c || c == b) -> result = TriangleTypes.IS_ISOSCELES
                (a != b || a != c || b != c) -> result = TriangleTypes.IS_SCALENE
            }
        }
        return result
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