package models

class User (
    private val firstName: String,
    private val secondName: String
){
    fun getFullName(): String{
        return "${this.firstName} ${this.secondName}"
    }
}