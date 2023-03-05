import org.junit.jupiter.api.Test
import triangle.Triangle
import triangle.TriangleTypes
import kotlin.test.assertEquals

class TriangleTest {

    @Test
    fun shouldFailInRangeOfTriangleSides(){
        //Check ranges
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(300, 100, 100).defineTriangle())
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(100, 300, 100).defineTriangle())
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(100, 100, 300).defineTriangle())

        //Check triangles types
        assertEquals(TriangleTypes.IS_EQUILATERAL, Triangle(100, 100, 100).defineTriangle())
        assertEquals(TriangleTypes.IS_SCALENE, Triangle(101, 104, 103).defineTriangle())
        assertEquals(TriangleTypes.IS_SCALENE, Triangle(103, 102, 104).defineTriangle())
        assertEquals(TriangleTypes.IS_SCALENE, Triangle(102, 103, 104).defineTriangle())
        assertEquals(TriangleTypes.IS_ISOSCELES, Triangle(100, 100, 102).defineTriangle())
        assertEquals(TriangleTypes.IS_ISOSCELES, Triangle(102, 100, 100).defineTriangle())
        assertEquals(TriangleTypes.IS_ISOSCELES, Triangle(100, 102, 100).defineTriangle())

        //Check is not a triangle
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(104, 101, -1).defineTriangle())
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(101, -1, 104).defineTriangle())
        assertEquals(TriangleTypes.IS_NOT_A_TRIANGLE, Triangle(-1, 104, 102).defineTriangle())
    }
}