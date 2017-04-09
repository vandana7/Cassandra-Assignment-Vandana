
object DatabaseQueryHandler extends App{

  val obj = new DatabaseHandler

  /**
    *"Query to find user by email"
    */
    println("user by email")
  obj.userByEmail("vandana.yadav@knoldus.in")

  /**
    *  "Query to find video by name"
    */
  println("video by name")
  obj.videoByName("mana ki hum yaar nahin")

  /**
    * "Query to find videos uploaded after 2015"
    */
  println("videos after 2015")
  obj.videoAfterYear(2015)


  /** "Query to find video by user_id and records should be selected in descending order by year"
    *
    */
  println("video by user_id i decending order")
  obj.videoByUserIdAndDescYear(1,2016)


}
