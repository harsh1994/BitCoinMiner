import akka.actor._
import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem
import akka.routing.Router
import akka.routing.RoundRobinRoutingLogic
import akka.routing.ActorRefRoutee
import java.security.MessageDigest
import akka.event.Logging
import scala.collection.mutable.ArrayBuffer

object Hi{

  def sha256Hash(text: String) : String =
    {
      return java.security.MessageDigest.getInstance("SHA-256").digest(text.getBytes()).map(0xFF & _).map { "%02x".format(_) }.foldLeft(""){_ + _}
    }

}

class Bitcoin_First(argument:Int) extends Actor {
  def receive = {
  case "25000" => 
  {
  var bitcoin_one = ArrayBuffer[String]()
  var bitcoin_two = ArrayBuffer[String]()
  var bitcoin_three = ArrayBuffer[String]()
  var bitcoin_four = ArrayBuffer[String]()
  var bitcoin_five = ArrayBuffer[String]()
  var input_string = ArrayBuffer[String]()
  var x = "amanchanana;"
//  var count = 0

  if (argument==1) 
  {
    for(i <- 0 to 25000)
    { 
      var j : String = Integer.toString(i)
      j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) != '0')
          {
            input_string+=j
            bitcoin_one+=s
//          count+=1
          }
    }
  
    for (i<-0 to bitcoin_one.length-1){
    println(input_string(i) + "\t" + bitcoin_one(i))
    }
  }
  
  if (argument == 2){
    for(i <- 0 to 25000)
    {
      var j : String = Integer.toString(i)
      j = x.concat(j)
          var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) != '0'){
            input_string+=j
            bitcoin_two+=s
//          count+=1
          }
    }
    
    for (i<-0 to bitcoin_two.length-1){
    println(input_string(i) + "\t" + bitcoin_two(i))
    }

  }
  if (argument == 3){
    
    for(i <- 0 to 25000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
          var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) != '0'){
            input_string+=j
            bitcoin_three+=s
//          count+=1
          }
    }
    
    for (i<-0 to bitcoin_three.length-1){
    println(input_string(i) + "\t" + bitcoin_three(i))

    }
  }
  if (argument == 4){
    
    for(i <- 0 to 25000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) != '0'){
            input_string+=j
            bitcoin_four+=s
//            count+=1
          }
    }
    for (i<-0 to bitcoin_four.length-1){
    println(input_string(i) + "\t" + bitcoin_four(i))
    }
  }
  if (argument == 5){
    
    for(i <- 0 to 25000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) == '0' && s.charAt(5) != '0'){
            input_string+=j
            bitcoin_five+=s
//            count+=1
          }
    }
    for (i<-0 to bitcoin_five.length-1){
    println(input_string(i) + "\t" + bitcoin_five(i))
    }
  }
  } 
  }
}

class Bitcoin_Second (argument:Int) extends Actor{
  def receive = {
  case "50000" => {
    var i = 0
        var bitcoin_one = ArrayBuffer[String]()
        var bitcoin_two = ArrayBuffer[String]()
        var bitcoin_three = ArrayBuffer[String]()
        var bitcoin_four = ArrayBuffer[String]()
        var bitcoin_five = ArrayBuffer[String]()
        var input_string = ArrayBuffer[String]()
        var x = "amanchanana;"
//        var count = 0

        if (argument == 1){
          for(i <- 25001 to 50000)
          {
            var j : String = Integer.toString(i)
            j=x.concat(j)
                var s =   Hi.sha256Hash(j)       
                if(s.charAt(0) == '0' && s.charAt(1) != '0'){
                  input_string+=j
                  bitcoin_one+=s
//                  count+=1
                }
          }
          for (i<-0 to bitcoin_one.length-1){
          println(input_string(i) + "\t" + bitcoin_one(i))
    }
    }
    if (argument == 2){
      for(i <- 25001 to 50000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
            var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) != '0'){
              input_string+=j
              bitcoin_two+=s
//                  count+=1
            }
      }
      for (i<-0 to bitcoin_two.length-1){
      println(input_string(i) + "\t" + bitcoin_two(i))

    }
    }
    if (argument == 3){
      for(i <- 25001 to 50000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
            var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) != '0'){
              input_string+=j
              bitcoin_three+=s
//                  count+=1
            }
      }
      for (i<-0 to bitcoin_three.length-1){
    println(input_string(i) + "\t" + bitcoin_three(i))
    }
    }
    if (argument == 4){
    
      for(i <- 25001 to 50000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
            var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) != '0'){
              input_string+=j
              bitcoin_four+=s
//                  count+=1
            }
      }
     for (i<-0 to bitcoin_four.length-1){
    println(input_string(i) + "\t" + bitcoin_four(i))
    }
    }
    if (argument == 5){
    
    for(i <-25001 to 50000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) == '0' && s.charAt(5) != '0'){
            input_string+=j
            bitcoin_five+=s
//            count+=1
          }
    }
    for (i<-0 to bitcoin_five.length-1){
    println(input_string(i) + "\t" + bitcoin_five(i))
    }
  }

  }    
  }
}

class Bitcoin_Third (argument:Int) extends Actor{
  def receive = {
  case "75000" =>{
    var i = 0
        var bitcoin_one = ArrayBuffer[String]()
        var bitcoin_two = ArrayBuffer[String]()
        var bitcoin_three = ArrayBuffer[String]()
        var bitcoin_four = ArrayBuffer[String]()
        var bitcoin_five = ArrayBuffer[String]()
        var input_string = ArrayBuffer[String]()
        var x = "amanchanana;"
//        var count = 0

        if (argument == 1){
          for(i <- 50001 to 75000)
          {
            var j : String = Integer.toString(i)
                j=x.concat(j)
                var s =   Hi.sha256Hash(j)
                if(s.charAt(0) == '0' && s.charAt(1) != '0'){
                input_string+=j
                  bitcoin_one+=s
//                      count+=1
                }
          }
          for (i<-0 to bitcoin_one.length-1){
    println(input_string(i) + "\t" + bitcoin_one(i))
    }
    }
    if (argument == 2){
      for(i <- 50001 to 75000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
        var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) != '0'){
              input_string+=j
              bitcoin_two+=s
//                  count+=1
            }
      }
      for (i<-0 to bitcoin_two.length-1){
    println(input_string(i) + "\t" + bitcoin_two(i))
    }
    }
    if (argument == 3){
    
      for(i <- 50001 to 75000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
            var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) != '0'){
              input_string+=j
              bitcoin_three+=s
//              count+=1
            }
      }
     for (i<-0 to bitcoin_three.length-1){
    println(input_string(i) + "\t" + bitcoin_three(i))

    }
    }
    if (argument == 4){
      for(i <- 50001 to 75000)
      {
        var j : String = Integer.toString(i)
        j=x.concat(j)
            var s =   Hi.sha256Hash(j)       
            if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) != '0'){
              input_string+=j
              bitcoin_four+=s
//                  count+=1
            }
      }
     for (i<-0 to bitcoin_four.length-1){
    println(input_string(i) + "\t" + bitcoin_four(i))
    }
    }
        if (argument == 5){
    
    for(i <- 50001 to 75000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) == '0' && s.charAt(5) != '0'){
            input_string+=j
            bitcoin_five+=s
//            count+=1
          }
    }
    for (i<-0 to bitcoin_five.length-1){
    println(input_string(i) + "\t" + bitcoin_five(i))
    }
  }

  }
  }
}

class Bitcoin_Fourth (argument:Int) extends Actor{
  def receive = {
    case "100000" =>{
      var i = 0
      var bitcoin_one = ArrayBuffer[String]()
      var bitcoin_two = ArrayBuffer[String]()
      var bitcoin_three = ArrayBuffer[String]()
      var bitcoin_four = ArrayBuffer[String]()
        var bitcoin_five = ArrayBuffer[String]()
      var input_string = ArrayBuffer[String]()
      var x = "amanchanana;"
//      var count = 0

      if (argument == 1){
      for(i <- 75001 to 100000)
        {
        var j : String = Integer.toString(i)
        j=x.concat(j)
        var s =   Hi.sha256Hash(j)       
         if(s.charAt(0) == '0' && s.charAt(1) != '0'){
          input_string+=j
          bitcoin_one+=s
//          count+=1
    }
    }
     for (i<-0 to bitcoin_one.length-1){
    println(input_string(i) + "\t" + bitcoin_one(i))
    }
    }
        if (argument == 2){
         for(i <- 75001 to 100000)
        {
        var j : String = Integer.toString(i)
        j=x.concat(j)
        var s =   Hi.sha256Hash(j)       
         if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) != '0'){
          input_string+=j
          bitcoin_two+=s
//          count+=1
    }
    }
     for (i<-0 to bitcoin_two.length-1){
    println(input_string(i) + "\t" + bitcoin_two(i))
    }
    }
        if (argument == 3){
    
        for(i <- 75001 to 100000)
        {
        var j : String = Integer.toString(i)
        j=x.concat(j)
        var s =   Hi.sha256Hash(j)       
      if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) != '0'){
         input_string+=j
         bitcoin_three+=s
//          count+=1
    }
    }
     for (i<-0 to bitcoin_three.length-1){
    println(input_string(i) + "\t" + bitcoin_three(i))
    }
    }
             if (argument == 4){
     for(i <- 75001 to 100000)
        {
        var j : String = Integer.toString(i)
        j=x.concat(j)
        var s =   Hi.sha256Hash(j)       
         if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) != '0'){
         input_string+=j
         bitcoin_four+=s
//         count+=1
    }
    }
     for (i<-0 to bitcoin_four.length-1){
    println(input_string(i) + "\t" + bitcoin_four(i))
    }
    }

    if (argument == 5){
    for(i <- 75001 to 100000)
    {
      var j : String = Integer.toString(i)
            j = x.concat(j)
      var s =   Hi.sha256Hash(j)       
          if(s.charAt(0) == '0' && s.charAt(1) == '0' && s.charAt(2) == '0' && s.charAt(3) == '0' && s.charAt(4) == '0' && s.charAt(5) != '0'){
            input_string+=j
            bitcoin_five+=s
//            count+=1
          }
    }
    for (i<-0 to bitcoin_five.length-1){
    println(input_string(i) + "\t" + bitcoin_five(i))
    }
  }

   }

  }
}

class LocalActor extends Actor {

val remoteActor = context.actorSelection("akka.tcp://HelloRemoteSystem@127.0.0.1:5150/user/RemoteActor")

  def receive = {
    case "START" =>
        remoteActor ! Main.arg1
    case msg: String =>
        println(s"LocalActor received message: '$msg'")

}
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  implicit val system1 = ActorSystem("LocalSystem")
  val localActor = system1.actorOf(Props[LocalActor], name = "LocalActor")  // the local actor
      localActor ! "START"                                                     // start the action
  // default Actor constructor
      var argument = args(0)
      val arg1 = Integer.parseInt(argument)
  
      val helloActor1 = system.actorOf(Props(new Bitcoin_First(arg1)), name = "helloactor1")
      val helloActor2 = system.actorOf(Props(new Bitcoin_Second(arg1)), name = "helloactor2")
      val helloActor3 = system.actorOf(Props(new Bitcoin_Third(arg1)), name = "helloactor3")
      val helloActor4 = system.actorOf(Props(new Bitcoin_Fourth(arg1)), name = "helloactor4")

      helloActor1! "25000" 
      helloActor2! "50000"
      helloActor3! "75000"
      helloActor4! "100000"

}