import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class GCodeRunnerHalf1HeightExtend {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\maxporter\\Desktop\\out.txt"));
		
		int layerNum = 1;
		double height = .44;
		double originX = 120;
		double originY = 120;
		ArrayList<Integer> filNum = new ArrayList<Integer>();
		
		filNum.add(15);
		filNum.add(21);
		filNum.add(25);
		filNum.add(29);
		filNum.add(32);
		filNum.add(35);
		filNum.add(38);
		filNum.add(41);
		filNum.add(43);
		filNum.add(45);
		filNum.add(47);
		filNum.add(49);
		filNum.add(51);
		filNum.add(53);
		filNum.add(55);
		filNum.add(57);
		filNum.add(58);
		filNum.add(60);
		filNum.add(61);
		filNum.add(63);
		filNum.add(64);
		filNum.add(66);
		filNum.add(67);
		filNum.add(68);
		filNum.add(70);
		filNum.add(71);
		filNum.add(72);
		filNum.add(73);
		filNum.add(75);
		filNum.add(76);
		filNum.add(77);
		filNum.add(78);
		filNum.add(79);
		filNum.add(80);
		filNum.add(81);
		filNum.add(82);
		filNum.add(83);
		filNum.add(84);
		filNum.add(85);
		filNum.add(86);
		filNum.add(87);
		filNum.add(87);
		filNum.add(88);
		filNum.add(89);
		filNum.add(90);
		filNum.add(91);
		filNum.add(92);
		filNum.add(92);
		filNum.add(93);
		filNum.add(94);
		filNum.add(95);
		filNum.add(95);
		filNum.add(96);
		filNum.add(97);
		filNum.add(97);
		filNum.add(98);
		filNum.add(99);
		filNum.add(99);
		filNum.add(100);
		filNum.add(101);
		filNum.add(101);
		filNum.add(102);
		filNum.add(103);
		filNum.add(103);
		filNum.add(104);
		filNum.add(104);
		filNum.add(105);
		filNum.add(105);
		filNum.add(106);
		filNum.add(106);
		filNum.add(107);
		filNum.add(107);
		filNum.add(108);
		filNum.add(108);
		filNum.add(109);
		filNum.add(109);
		filNum.add(110);
		filNum.add(110);
		filNum.add(111);
		filNum.add(111);
		filNum.add(112);
		filNum.add(112);
		filNum.add(113);
		filNum.add(113);
		filNum.add(113);
		filNum.add(114);
		filNum.add(114);
		filNum.add(114);
		filNum.add(115);
		filNum.add(115);
		filNum.add(116);
		filNum.add(116);
		filNum.add(116);
		filNum.add(117);
		filNum.add(117);
		filNum.add(117);
		filNum.add(118);
		filNum.add(118);
		filNum.add(118);
		filNum.add(118);
		filNum.add(119);
		filNum.add(119);
		filNum.add(119);
		filNum.add(120);
		filNum.add(120);
		filNum.add(120);
		filNum.add(120);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(125);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(124);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(123);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(122);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(121);
		filNum.add(120);
		filNum.add(120);
		filNum.add(120);
		filNum.add(120);
		filNum.add(119);
		filNum.add(119);
		filNum.add(119);
		filNum.add(118);
		filNum.add(118);
		filNum.add(118);
		filNum.add(118);
		filNum.add(117);
		filNum.add(117);
		filNum.add(117);
		filNum.add(116);
		filNum.add(116);
		filNum.add(116);
		filNum.add(115);
		filNum.add(115);
		filNum.add(115);
		filNum.add(114);
		filNum.add(114);
		filNum.add(113);
		filNum.add(113);
		filNum.add(113);
		filNum.add(112);
		filNum.add(112);
		filNum.add(111);
		filNum.add(111);
		filNum.add(110);
		filNum.add(110);
		filNum.add(109);
		filNum.add(109);
		filNum.add(109);
		filNum.add(108);
		filNum.add(108);
		filNum.add(107);
		filNum.add(107);
		filNum.add(106);
		filNum.add(105);
		filNum.add(105);
		filNum.add(104);
		filNum.add(104);
		filNum.add(103);
		filNum.add(103);
		filNum.add(102);
		filNum.add(101);
		filNum.add(101);
		filNum.add(100);
		filNum.add(100);
		filNum.add(99);
		filNum.add(98);
		filNum.add(98);
		filNum.add(97);
		filNum.add(96);
		filNum.add(95);
		filNum.add(95);
		filNum.add(94);
		filNum.add(93);
		filNum.add(92);
		filNum.add(92);
		filNum.add(91);
		filNum.add(90);
		filNum.add(89);
		filNum.add(88);
		filNum.add(88);
		filNum.add(87);
		filNum.add(86);
		filNum.add(85);
		filNum.add(84);
		filNum.add(83);
		filNum.add(82);
		filNum.add(81);
		filNum.add(80);
		filNum.add(79);
		filNum.add(78);
		filNum.add(77);
		filNum.add(76);
		filNum.add(75);
		filNum.add(74);
		filNum.add(72);
		filNum.add(71);
		filNum.add(70);
		filNum.add(69);
		filNum.add(67);
		filNum.add(66);
		filNum.add(65);
		filNum.add(63);
		filNum.add(62);
		filNum.add(60);
		filNum.add(59);
		filNum.add(57);
		filNum.add(55);
		filNum.add(53);
		filNum.add(52);
		filNum.add(50);
		filNum.add(48);
		filNum.add(46);
		filNum.add(43);
		filNum.add(41);
		filNum.add(38);
		filNum.add(36);
		filNum.add(33);
		filNum.add(29);
		filNum.add(26);
		filNum.add(21);
		filNum.add(15);
		filNum.add(5);

		
		double E = 0;
		boolean goRight = false;
		bw.append("G0 F320 X80 Y125 Z0.27");
		double tempx = 90;
		double tempy = 125;
		for(int i = 0; i < 80; i++)
		{
			tempy -= 10;
			E += (10 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempx += .4;
			E += (.4 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempy += 10;
			E += (10 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
			tempx += .4;
			E += (.4 * .0945);
			bw.append("G1 F1800 X" + tempx + " Y" + tempy + " E" + E);
			bw.newLine();
		}
		
		for(int i = 147; i < filNum.size(); i++)
		{
			int filNumLay = filNum.get(i);
			double layerHeight = height+((i-147) *.17);
			double startX = (filNumLay)*.2;
			double startY = 1.25;
			double actualX;
			if(goRight)
			{
				actualX = originX-startX;
			}
			else
			{
				actualX = originX+startX;
			}
			double actualY = originY+startY;
			//System.out.println("G0 F4320 X" + actualX + " Y" + actualY + " Z" + layerHeight);
			bw.append("G0 F1800 F4320 X" + actualX + " Y" + actualY + " Z" + layerHeight);
			bw.newLine();
			double tempX = actualX;
			double tempY = actualY;
			for(int j = 0; j < filNumLay/2; j++)
			{
				tempY -= 2.5;
				E += (2.5*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				if(goRight)
				{
					tempX += .4;
				}
				else
				{
					tempX -= .4;
				}
				E += (.4*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempY += 2.5;
				E += (2.5*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				if(goRight)
				{
					tempX += .4;
				}
				else
				{
					tempX -= .4;
				}
				E += (.4*0.0945);
				//System.out.println("G1 X" + tempX + " Y" + tempY + " E" + E);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
			}
			goRight = !goRight;

		}

	}

}
