package main.scala.remote
package remote
import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem
import akka.routing.Router
import akka.routing.RoundRobinRoutingLogic
import akka.routing.ActorRefRoutee
import java.security.MessageDigest
import akka.event.Logging
import scala.collection.mutable.ArrayBuffer

object Hi1{

  def sha256Hash1(text: String) : String =
    {
      return java.security.MessageDigest.getInstance("SHA-256").digest(text.getBytes()).map(0xFF & _).map { "%02x".format(_) }.foldLeft(""){_ + _}
    }

}

class Bitcoin_First1(argument:Int) extends Actor {
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
      var s =   Hi1.sha256Hash1(j)       
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
          var s =   Hi1.sha256Hash1(j)       
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
          var s =   Hi1.sha256Hash1(j)       
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
      var s =   Hi1.sha256Hash1(j)       
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
      var s =   Hi1.sha256Hash1(j)       
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

class Bitcoin_Second1 (argument:Int) extends Actor{
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
                var s =   Hi1.sha256Hash1(j)       
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
            var s =   Hi1.sha256Hash1(j)       
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
            var s =   Hi1.sha256Hash1(j)       
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
            var s =   Hi1.sha256Hash1(j)       
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
      var s =   Hi1.sha256Hash1(j)       
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

class Bitcoin_Third1 (argument:Int) extends Actor{
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
                var s =   Hi1.sha256Hash1(j)
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
        var s =   Hi1.sha256Hash1(j)       
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
            var s =   Hi1.sha256Hash1(j)       
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
            var s =   Hi1.sha256Hash1(j)       
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
      var s =   Hi1.sha256Hash1(j)       
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

class Bitcoin_Fourth1 (argument:Int) extends Actor{
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
        var s =   Hi1.sha256Hash1(j)       
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
        var s =   Hi1.sha256Hash1(j)       
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
        var s =   Hi1.sha256Hash1(j)       
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
        var s =   Hi1.sha256Hash1(j)       
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
      var s =   Hi1.sha256Hash1(j)       
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




//object Main1 extends App {
//  val system2 = ActorSystem("HelloSystem")
      // default Actor constructor
//      var argument = args(0)
//      val arg1 = Integer.parseInt(argument)
      
//      val helloActor11 = system2.actorOf(Props(new Bitcoin_First1(arg1)), name = "helloactor11")
//      val helloActor22 = system2.actorOf(Props(new Bitcoin_Second1(arg1)), name = "helloactor22")
//      val helloActor33 = system2.actorOf(Props(new Bitcoin_Third1(arg1)), name = "helloactor33")
//      val helloActor44 = system2.actorOf(Props(new Bitcoin_Fourth1(arg1)), name = "helloactor44")
//      helloActor11 ! "25000" 
//      helloActor22! "50000"
//      helloActor33! "75000"
//      helloActor44! "100000"
//}

object HelloRemote extends App  {
  val system = ActorSystem("HelloRemoteSystem")
  val remoteActor = system.actorOf(Props[RemoteActor], name = "RemoteActor")
  remoteActor ! "The RemoteActor is alive"
}

class RemoteActor extends Actor {
  val system2 = ActorSystem("HelloSystem")
  def receive = {
    case msg: Int =>
//        println(s"RemoteActor received message '$msg'")
      val helloActor11 = system2.actorOf(Props(new Bitcoin_First1(msg)), name = "helloactor11")
      val helloActor22 = system2.actorOf(Props(new Bitcoin_Second1(msg)), name = "helloactor22")
      val helloActor33 = system2.actorOf(Props(new Bitcoin_Third1(msg)), name = "helloactor33")
      val helloActor44 = system2.actorOf(Props(new Bitcoin_Fourth1(msg)), name = "helloactor44")
      helloActor11 ! "25000" 
      helloActor22! "50000"
      helloActor33! "75000"
      helloActor44! "100000"      
        
      sender ! "Hello from the RemoteActor"
  }
}