import com.datastax.driver.core.Cluster

class DatabaseHandler {
  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()

  val session = cluster.connect("user_video")

  def userByEmail(email: String) = {

    val result = session.execute(s"SELECT * FROM user where email='$email'")
    result.forEach(i => println(i.toString))


  }

  def videoByName(name: String) = {

    val result = session.execute(s"SELECT * FROM video where video_name='$name'")
    result.forEach(i => println(i.toString))


  }

  def videoAfterYear(year: Int) = {
    val result = session.execute(s"SELECT * FROM video where year>$year ALLOW FILTERING")
    result.forEach(i => println(i.toString))


  }

  def videoByUserIdAndDescYear(id: Int, year: Int) = {

    val result = session.execute(s"SELECT * FROM videoByUserIdAndYear WHERE user_id =$id AND year >=$year ORDER BY year DESC ;")
    result.forEach(i => println(i.toString))


    cluster.close()
  }
}
