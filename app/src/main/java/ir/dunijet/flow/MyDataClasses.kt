package ir.dunijet.flow

data class Student(
    val id:Int ,
    val name :String ,
    val familyName:String ,
    val fatherName :String ,
    val university :String ,
    val grade :String ,
    val sitePassword :String ,
    val siteUsername :String
)
data class StudentUi(
    val id:Int ,
    val name :String ,
    val familyName:String ,
    val grade :String
)