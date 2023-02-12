import models.User
import kotlin.test.Test
import kotlin.test.assertEquals

class UserTest {

    @Test
    fun shouldBeSameName(){
        val user = User("Aleksei", "Kromski")
        assertEquals("Aleksei Kromski", user.getFullName())
    }
}