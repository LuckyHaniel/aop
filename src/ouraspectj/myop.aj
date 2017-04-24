package ouraspectj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public aspect myop {
	
	int n = 10;
	int num = 0;
	int beb = 0;
	int e=0;
	File f;
	Map<String, Boolean> map = new HashMap<String, Boolean>();

	// 设置切点qiedian
	pointcut xuanzeweier(int a, int b):
	    withincode(* Ouraspectj.*(int,int))&&args(a)&&args(b);

		before(int a, int b) : xuanzeweier(int,int) && !withincode(void Ouraspectj.q(int)) && args(a)&&args(b) {
			if(a==1)
			e=1;
			if(a==0)
		    e=0;	
		}
	pointcut qiedian():execution(* Ouraspectj.*(..));// 执行Ouraspectj1包，以及子孙包下的所有方法

	/*
	 * 借助 pointcut executionPointcut():execution(*
	 * Ouraspectj.*(..))可以在进行切面编程时统一对函数设置切点
	 */

	before(): qiedian() {// before 连接点前通知,添加到切入点
		// num表示当前处于第几层函数调用//

		// 写入函数调用顺序到文件
		if (num == 0) {
			
			MapManager();
		}
		f = new File("result.txt");
		try {
			if (f.exists()) {
				f.createNewFile();
			} else if (num == 0) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String s=thisJoinPoint.getStaticPart().getSignature().getName();
			FileWriter fileWriter = new FileWriter(f, true);
			fileWriter.write(s+ "()→");
			
			fileWriter.close();
			map.put(s,true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		num++;
		for (beb = 0; beb < num; beb++) {
			System.out.print("---");
		}
		System.out.print("----------->第" + num + "层开始调用函数"
				+ thisJoinPoint.getStaticPart().getSignature().getName()
				+ "()<-------------");

		for (beb = 0; beb < num; beb++) {
			if (beb < num - 1)
				System.out.print("---");
			else
				System.out.println();
		}
	}// 持有一个包括所有静态信息的对象，可以通过thisJoinPoint.getStaticPart()方法得到该对象的引用,方法名用signature.getName()拿到//

	after(): qiedian(){
		
		if (num == 1) {
			f = new File("result.txt");
			try {
				if (f.exists()) {
					f.createNewFile();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter fileWriter = new FileWriter(f, true);
				 if(e==1)
	                {
	                	fileWriter.write("true");
	                }
	                if(e==0)
	                {
	                	fileWriter.write("false");
	                }
				fileWriter.write("\r\n");
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			File hashMap=new File("hashMap.txt");
			try {
				if (hashMap.exists()) {
					hashMap.createNewFile();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter fileWriter = new FileWriter(hashMap, true);
				for(Map.Entry<String, Boolean> entry:map.entrySet()){
					if(entry.getValue()){
						fileWriter.write("1");
					}
					else{
						fileWriter.write("0");
					}
				}
                if(e==1)
                {
                	fileWriter.write("1");
                }
                if(e==0)
                {
                	fileWriter.write("0");
                }
                
				fileWriter.write("\r\n");
			
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			File orderName=new File("name.txt");
			try {
				if (orderName.exists()) {
					orderName.createNewFile();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileWriter fileWriter = new FileWriter(orderName);
				for(Map.Entry<String, Boolean> entry:map.entrySet()){
					fileWriter.write(entry.getKey()+"\r\n");
				}
				fileWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		for (beb = num; beb > 0; beb--) {
			System.out.print("---");
		}
		System.out.print("----------->第" + num + "层结束调用函数"
				+ thisJoinPoint.getStaticPart().getSignature().getName()
				+ "()<-------------");

		for (beb = num; beb > 0; beb--) {
			if (beb > 1)
				System.out.print("---");
			else
				System.out.println();
		}
		num--;
	}

	

	void MapManager() {
		map.put("main", false);
		map.put("a", false);
		map.put("aja", false);
		map.put("b", false);
		map.put("ajb", false);
		map.put("c", false);
		map.put("ajc", false);
		map.put("d", false);
		map.put("ajd", false);
		map.put("e", false);
		map.put("aje", false);
		map.put("h", false);
		map.put("ajh", false);
		map.put("hi", false);
		map.put("ajhi", false);
		map.put("i", false);
		map.put("iii", false);
		map.put("ih", false);
		map.put("ihi", false);
		map.put("k", false);
		map.put("ki", false);
		map.put("l", false);
		map.put("li", false);
		map.put("m", false);
		map.put("r", false);
		map.put("ir", false);
		map.put("s", false);
		map.put("is", false);
		map.put("t", false);
		map.put("it", false);
		map.put("u", false);
		map.put("iu", false);
		map.put("v", false);
		map.put("iv", false);
		map.put("g", false);
		map.put("p", false);
		map.put("q",false);
	}
}
