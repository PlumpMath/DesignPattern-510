package com.latewind.pattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;

import com.latewind.inject.Inject;
import com.latewind.inject.InjectTarget;
import com.latewind.pattern.adapter.Coach;
import com.latewind.pattern.adapter.ForeignPlayer;
import com.latewind.pattern.adapter.Forward;
import com.latewind.pattern.adapter.Translater;
import com.latewind.pattern.bridge.HuaWei;
import com.latewind.pattern.bridge.IPhone;
import com.latewind.pattern.bridge.Phone;
import com.latewind.pattern.bridge.WeChatApp;
import com.latewind.pattern.bridge.WeiboApp;
import com.latewind.pattern.builder.Computer;
import com.latewind.pattern.builder.Director;
import com.latewind.pattern.builder.LaptopBuilder;
import com.latewind.pattern.commend.Commend;
import com.latewind.pattern.commend.Invoker;
import com.latewind.pattern.commend.Receiver;
import com.latewind.pattern.commend.RunCommend;
import com.latewind.pattern.commend.StopCommend;
import com.latewind.pattern.decorator.Bungalow;
import com.latewind.pattern.decorator.DoorDecorator;
import com.latewind.pattern.decorator.House;
import com.latewind.pattern.decorator.WindowDecorator;
import com.latewind.pattern.facade.Astock;
import com.latewind.pattern.facade.Facade;
import com.latewind.pattern.facade.Hstock;
import com.latewind.pattern.factory.Operation;
import com.latewind.pattern.factory.PlusFactoryMethod;
import com.latewind.pattern.factory.PlusOperation;
import com.latewind.pattern.factory.SimpleFactory;
import com.latewind.pattern.factory.StrategyContext;
import com.latewind.pattern.factory.abstr.AbstractFactory;
import com.latewind.pattern.factory.abstr.FactoryProducer;
import com.latewind.pattern.mediator.ChatRoom;
import com.latewind.pattern.mediator.Mediator;
import com.latewind.pattern.mediator.Member;
import com.latewind.pattern.mediator.OrdMember;
import com.latewind.pattern.memono.CareTaker;
import com.latewind.pattern.memono.Role;
import com.latewind.pattern.observer.IamReminder;
import com.latewind.pattern.observer.MobileObserver;
import com.latewind.pattern.observer.Observer;
import com.latewind.pattern.observer.Reminder;
import com.latewind.pattern.observer.StockObserver;
import com.latewind.pattern.prototype.Resume;
import com.latewind.pattern.proxy.ProxyPursure;
import com.latewind.pattern.proxy.RealPursure;
import com.latewind.pattern.single.Single;
import com.latewind.pattern.state.EveryDay;
import com.latewind.pattern.template.FootBallGame;
import com.latewind.pattern.template.Game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws CloneNotSupportedException 
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     */
    public void testFactory() throws CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        assertTrue( true );
        System.out.println("============Samile Factory Pattern=============");
       Operation operation =SimpleFactory.getOperation("+").setValue(1, 2);
       System.out.println(operation.gerResult());
       
       
       System.out.println("============Factory Method Pattern=============");
       PlusFactoryMethod plusFactoryMethod=new PlusFactoryMethod();
       Operation addOperation =plusFactoryMethod.getOperation();
       System.out.println(addOperation.setValue(1.0, 2.0).gerResult()); 
       
             
       System.out.println("================Strategy Pattern=====================");
       StrategyContext sc=new StrategyContext(new PlusOperation());
       System.out.println(sc.executeStrategy(1, 2));      
    
	    House house=new Bungalow();
	    WindowDecorator wd=new WindowDecorator();
	    DoorDecorator dd=new DoorDecorator();
	    wd.decorator(house);
	    dd.decorator(wd);
	    dd.display();
	    
	    
	    System.out.println("==================Test Proxy=====================");
	    ProxyPursure proxyPursure=new ProxyPursure("美眉");
	    proxyPursure.giveFlower();
	    proxyPursure.giveMoney();
	    
	    
	    System.out.println("==================Prototype=====================");
	    
	    Resume resume=new Resume();
	    resume.setAge(26);
	    resume.setName("LSQ");
	    Resume other=(Resume) resume.clone();
	    other.setName("LateWind");
	    
	    System.out.println(resume);
	    
	    System.out.println(other);
	    
	    System.out.println("==================Template Pattern=====================");
	    Game game=new FootBallGame();
	    game.runGame();
	    
	    
	    System.out.println("==================Facade Pattern=====================");
	    Facade facade=new Facade(new Astock(), new Hstock());
	    facade.in();
	    facade.out();
	   
	    
	    System.out.println("==================Builder Pattern=====================");
	    Director director=new Director(new LaptopBuilder());
	    director.constructComputer();
	    Computer computer=director.getComputer();
	    System.out.println(computer.toString());
	    
	    
	    System.out.println("==================Observer Pattern=====================");
	    Reminder reminder=new IamReminder();
	    
	    Observer stockObserver=new StockObserver(reminder);
	    
	    Observer mObserver=new MobileObserver(reminder);
	    
	    reminder.attach(stockObserver);
	    reminder.attach(mObserver);
	    reminder.notice();
	    
	    System.out.println("==================Abstract Factory Pattern=====================");
	    AbstractFactory houseFactory=FactoryProducer.getHouseFactory();
	   House bHouse= houseFactory.getHouse("Bungalow");
	   bHouse.display();
	   
	   
	   System.out.println("==================State Pattern=====================");
	   EveryDay everyDay=new EveryDay(LocalDateTime.now());
	   everyDay.done();
	   
	   System.out.println("==================Adapter Pattern=====================");
	   Coach coach=new Coach(new Forward());
	   coach.attackAction();
	   coach.setPlayer(new Translater(new ForeignPlayer()));
	   coach.attackAction();
	   
	   
	   System.out.println("==================Memento Pattern=====================");
	   Random random=new Random();
	   CareTaker careTaker=new CareTaker();
	   Role role=new Role();
	   role.setVit( random.nextInt());
	   careTaker.setMemento(role.saveStatus());
	   System.out.println(role);
	   
	   role.setVit( random.nextInt());
	   careTaker.setMemento(role.saveStatus());
	   System.out.println(role);
	   
	   role.setVit( random.nextInt());
	   careTaker.setMemento(role.saveStatus());
	   System.out.println(role);
	   
	   
	   role.resumeStatus(careTaker.getMemento(2));
	   System.out.println(role);
	   
	   role.resumeStatus(careTaker.getMemento(1));
	   System.out.println(role);
	   
	   
	   role.resumeStatus(careTaker.getMemento(0));
	   System.out.println(role);
	   
	   System.out.println("==================Bridge Pattern=====================");
	  
	   Phone iPhone=new IPhone();
	   iPhone.install(new WeChatApp());
	   iPhone.runApp();
	   
	   iPhone.install(new WeiboApp());
	   iPhone.runApp();
	   
	   

	   Phone huaWei=new HuaWei();
	   huaWei.install(new WeChatApp());
	   huaWei.runApp();
	  
	   
	   System.out.println("==================Mediator Pattern=====================");
	   Mediator chatRoom=new ChatRoom();
	   
	   Member zs=new OrdMember(chatRoom, "张三");
	   
	   Member ls=new OrdMember(chatRoom, "李四");
	   
	   Member ww=new OrdMember(chatRoom, "王五");

	   zs.send("大家好，我是张三，刚来到这个群");
	
	   
	   System.out.println("==================Commend Pattern=====================");
		
	   Receiver receiver=new Receiver();
	   Commend runCommend=new RunCommend(receiver);   
	   Commend stopCommend=new StopCommend(receiver);
	   
	   Invoker invoker=new Invoker();
	   invoker.executeCmd(runCommend);
	   
	   invoker.executeCmd(stopCommend);
	  
	   System.out.println("==================Single Pattern=====================");
		Single single=Single.getInstance();
		single.show();
	   
	   
		java.lang.reflect.Field [] fields=	Member.class.getFields();
//		for(java.lang.reflect.Field field:fields){
//			
//			field.set
//			
//		}
//		InjectTarget member;
//	try {
//		java.lang.reflect.Field field=InjectTarget.class.getDeclaredField("name");
//		
//		String name =field.getAnnotation(Inject.class).name();
//		member = InjectTarget.class.newInstance();
//		
//		field.setAccessible(true);
//		field.set(member, name);
//		System.out.println(member);
//	} catch (InstantiationException e) {
//		//  Auto-generated catch block
//		e.printStackTrace();
//	} catch (NoSuchFieldException e) {
//		//  Auto-generated catch block
//		e.printStackTrace();
//	}
//	
		
////	   Class<String> iClass;
//	Method method=Member.class.getMethod("send", new Class[]{String.class});
//	
//	method.invoke(zs, "Test Method");
//	
//	System.out.println(App.func(20));
//	HashMap<Integer, BigInteger> map=new HashMap<>();
//	
//	App.newBol(100, map);
//	System.out.println(map);
//	System.out.println(map.get(99));
    }
}
