package ouraspectj;//源代码//

import java.io.IOException;
import java.util.Scanner;

public class Ouraspectj {// 国足球员号码信息

	public static void main(String[] args) throws IOException {

		System.out.println();
		System.out.println("中国男足球员号码信息");
		System.out.println("输入1或2或3,1个人查询，2位置查询，3俱乐部查询");
		Scanner on = new Scanner(System.in);
		String sti = null;
		sti = on.nextLine();
		Scanner in = new Scanner(System.in);
		String str = null;
		Ouraspectj test = new Ouraspectj();
		switch (sti) {
		case "1":

			System.out.println("请输入1或2或3,1代表前锋，2代表中场，3代表后卫");

			str = in.nextLine();

			switch (str) {
			case "1":
				int num;
				int huk = 0;
				System.out.print("输入查询前场球衣号码：");
				num = in.nextInt();
				test.a(num, huk);
				break;

			case "2":
				int mum;
				int huk1 = 0;
				System.out.print("输入查询中场球衣号码:");
				mum = in.nextInt();
				test.h(mum, huk1);
				break;

			case "3":
				int dum;
				int huk2 = 0;
				System.out.print("输入查询后场球衣号码:");
				dum = in.nextInt();
				test.r(dum, huk2);
				break;

			default:
				System.out.println("没这号人");
				break;
			}

			in.close();
			break;
		case "2":
			System.out.println("请输入1或2或3,1代表前场，2代表中场，3代表后场");

			str = in.nextLine();
			switch (str) {
			case "1":
				int qinum;
				int b = 0;
				qinum = 100;
				test.a(qinum, b);
				break;
			case "2":
				int qnmgb;
				int gj = 0;
				qnmgb = 200;
				test.h(qnmgb, gj);
				break;
			case "3":
				int wqnmgb;
				int klk = 0;
				wqnmgb = 250;// ---------------------------------------------------------------------------
				test.r(wqnmgb, klk);
				break;
			default:
				System.out.println("没这位置");
				break;
			}
			in.close();
			break;
		case "3":
			System.out.println("输入1查询恒大球员名单及个人信息");
			str = in.nextLine();
			switch (str) {
			case "1":
				int hddsb;
				hddsb = 300;
				int glg = 0;
				test.aje(hddsb, glg);
				break;
			default:
				System.out.println("没做其它队的");
				break;
			}
			in.close();
			break;
		}
	}

	private void a(int a, int b) {
		if (a == 10 || a == 19) {

			aja(a, b);
		}

		else if (a == 100) {
			aja(a, b);
		} else
			b(a, b);

	}

	private void aja(int a, int b) {
		System.out.println("  张  稀  哲      ");
		System.out.println(" 北京国安   ");
		System.out.println(" 1991 1月23 ");
		b = 10;
		if (a == 100) {
			ajb(a, b);

		} else
			g(a, b);
	}

	private void b(int a, int b) {
		if (a == 9) {

			ajb(a, b);
		} else {
			c(a, b);
		}
	}

	private void ajb(int a, int b) {
		System.out.println("  张 玉 宁      ");
		System.out.println(" 荷甲维特斯   ");
		System.out.println(" 1997 1月5 ");
		b = 9;
		if (a == 100) {
			ajc(a, b);

		} else
			g(a, b);
	}

	private void c(int a, int b) {
		if (a == 22) {

			ajc(a, b);
		} else {
			d(a, b);
		}

	}

	private void ajc(int a, int b) {
		System.out.println("  于 大 宝     ");
		System.out.println(" 北京国安   ");
		System.out.println(" 1991 1月23 ");
		b = 22;
		if (a == 100) {
			ajd(a, b);

		} else
			g(a, b);
	}

	private void d(int a, int b) {
		if (a == 7) {

			ajd(a, b);
		} else {

			e(a, b);
		}
	}

	private void ajd(int a, int b) {
		System.out.println("  武   磊      ");
		System.out.println(" 上海上港   ");
		System.out.println(" 1991 11月19 ");
		b = 7;
		if (a == 100) {
			aje(a, b);

		} else
			g(a, b);
	}

	private void e(int a, int b) {
		if (a == 18) {

			aje(a, b);
		} else {
			q(a, b);
		}
	}

	private void aje(int a, int b) {
		System.out.println("  郜  林      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1986 2月14 ");
		b = 18;
		if (a == 300) {
			ajh(a, b);
		} else
			g(a, b);
	}

	private void h(int a, int b) {
		if (a == 16) {

			ajh(a, b);
		} else if (a == 200) {
			ajh(a, b);
		} else {

			hi(a, b);
		}
	}

	private void ajh(int a, int b) {
		System.out.println("  黄 博 文      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1987 7月13 ");
		b = 16;
		if (a == 200) {
			ajhi(a, b);
		} else if (a == 300) {
			ajhi(a, b);
		} else
			g(a, b);
	}

	private void hi(int a, int b) {
		if (a == 10) {

			ajhi(a, b);
		} else {

			i(a, b);
		}
	}

	private void ajhi(int a, int b) {
		System.out.println("  郑智      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1980 8月20 ");
		b = 10;
		if (a == 200) {
			iii(a, b);
		} else if (a == 300) {
			ir(a, b);
		} else
			g(a, b);
	}

	private void i(int a, int b) {
		if (a == 8) {

			iii(a, b);
		} else {
			ih(a, b);
		}

	}

	private void iii(int a, int b) {
		System.out.println("  于海     ");
		System.out.println(" 上海上港  ");
		System.out.println(" 1989 10月10 ");
		b = 8;
		if (a == 200) {
			ihi(a, b);
		} else
			g(a, b);
	}

	private void ih(int a, int b) {
		if (a == 11) {

			ihi(a, b);
		} else {
			k(a, b);
		}

	}

	private void ihi(int a, int b) {
		System.out.println("  蒿俊闵      ");
		System.out.println(" 山东鲁能     ");
		System.out.println(" 1987 3月24 ");
		b = 11;
		if (a == 200) {
			ki(a, b);
		} else
			g(a, b);
	}

	private void k(int a, int b) {
		if (a == 14) {

			ki(a, b);
		} else {
			l(a, b);
		}
	}

	private void ki(int a, int b) {
		System.out.println("  孙可      ");
		System.out.println(" 天津权健   ");
		System.out.println(" 1989 8月26 ");
		b = 14;
		if (a == 200) {
			li(a, b);
		} else
			g(a, b);
	}

	private void l(int a, int b) {
		if (a == 15) {

			li(a, b);
		} else {
			m(a, b);
		}
	}

	private void li(int a, int b) {
		System.out.println("  吴曦      ");
		System.out.println(" 江苏苏宁   ");
		System.out.println(" 1989 2月19 ");
		b = 15;
		g(a, b);
	}

	private void m(int a, int b) {
		q(a, b);

	}

	private void r(int a, int b) {
		if (a == 6) {

			is(a, b);// ---------------------------------------------》漏洞二号<------------------------------------------
		} else if (a == 250) {
			ir(a, b);
		} else {
			s(a, b);
		}

	}

	private void ir(int a, int b) {
		System.out.println("  冯潇霆      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1985 10月20 ");
		b = 6;
		if (a == 250) {
			is(a, b);
		} else if (a == 300) {
			is(a, b);
		} else
			g(a, b);
	}

	private void s(int a, int b) {
		if (a == 2) {

			is(a, b);
		} else {
			t(a, b);
		}// --------------------------------------------------------------------------
	}

	private void is(int a, int b) {
		System.out.println("  梅芳      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1989 11月14 ");
		b = 2;
		if (a == 250) {
			it(a, b);
		} else if (a == 300) {
			it(a, b);
		} else
			g(a, b);
	}

	private void t(int a, int b) {
		if (a == 5) {

			it(a, b);
		} else {
			u(a, b);
		}
	}

	private void it(int a, int b) {
		System.out.println("  张琳芃      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1989 5月9 ");
		b = 5;
		if (a == 250) {
			iu(a, b);
		} else if (a == 300) {
			iu(a, b);
		} else
			g(a, b);
	}

	private void u(int a, int b) {
		if (a == 4) {

			iu(a, b);
		} else {
			v(a, b);
		}
	}

	private void iu(int a, int b) {
		System.out.println("  李学鹏      ");
		System.out.println(" 广州恒大   ");
		System.out.println(" 1988 9月18 ");
		b = 4;
		if (a == 250) {
			iv(a, b);
		} else if (a == 300) {
			iv(a, b);
		}// ------------------------------------------->漏洞4《--------------------------------------
		else
			g(a, b);
	}

	private void v(int a, int b) {
		if (a == 3) {

			iv(a, b);
		} else {
			q(a, b);
		}
	}

	private void iv(int a, int b) {
		System.out.println("  姜志鹏      ");
		System.out.println(" 广州富力   ");
		System.out.println(" 1989 3月6 ");
		b = 3;
		g(a, b);

	}

	private void g(int a, int b) {
		if (a != b) {
			a = 0;
		} else {
			a = 1;
		}
		System.out.println(a);
		System.out.println();

	}

	private void q(int a, int b) {
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
