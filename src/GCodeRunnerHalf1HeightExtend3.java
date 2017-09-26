import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class GCodeRunnerHalf1HeightExtend3 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\maxporter\\Desktop\\out.txt"));
		
		int layerNum = 1;
		double height = .44;
		double originX = 120;
		double originY = 120;
		ArrayList<Integer> filNum = new ArrayList<Integer>();
		ArrayList<Double> filLen = new ArrayList<Double>();
		
		filNum.add(13);
		filNum.add(17);
		filNum.add(20);
		filNum.add(23);
		filNum.add(25);
		filNum.add(27);
		filNum.add(29);
		filNum.add(31);
		filNum.add(32);
		filNum.add(34);
		filNum.add(35);
		filNum.add(37);
		filNum.add(38);
		filNum.add(39);
		filNum.add(40);
		filNum.add(41);
		filNum.add(42);
		filNum.add(43);
		filNum.add(44);
		filNum.add(45);
		filNum.add(46);
		filNum.add(47);
		filNum.add(48);
		filNum.add(49);
		filNum.add(49);
		filNum.add(50);
		filNum.add(51);
		filNum.add(51);
		filNum.add(52);
		filNum.add(53);
		filNum.add(53);
		filNum.add(54);
		filNum.add(54);
		filNum.add(55);
		filNum.add(55);
		filNum.add(56);
		filNum.add(56);
		filNum.add(57);
		filNum.add(57);
		filNum.add(58);
		filNum.add(58);
		filNum.add(58);
		filNum.add(59);
		filNum.add(59);
		filNum.add(59);
		filNum.add(60);
		filNum.add(60);
		filNum.add(60);
		filNum.add(61);
		filNum.add(61);
		filNum.add(61);
		filNum.add(61);
		filNum.add(61);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(62);
		filNum.add(61);
		filNum.add(61);
		filNum.add(61);
		filNum.add(61);
		filNum.add(60);
		filNum.add(60);
		filNum.add(60);
		filNum.add(60);
		filNum.add(59);
		filNum.add(59);
		filNum.add(59);
		filNum.add(58);
		filNum.add(58);
		filNum.add(58);
		filNum.add(57);
		filNum.add(57);
		filNum.add(56);
		filNum.add(56);
		filNum.add(55);
		filNum.add(55);
		filNum.add(54);
		filNum.add(54);
		filNum.add(53);
		filNum.add(53);
		filNum.add(52);
		filNum.add(51);
		filNum.add(51);
		filNum.add(50);
		filNum.add(49);
		filNum.add(48);
		filNum.add(48);
		filNum.add(47);
		filNum.add(46);
		filNum.add(45);
		filNum.add(44);
		filNum.add(43);
		filNum.add(42);
		filNum.add(41);
		filNum.add(40);
		filNum.add(39);
		filNum.add(37);
		filNum.add(36);
		filNum.add(35);
		filNum.add(33);
		filNum.add(32);
		filNum.add(30);
		filNum.add(28);
		filNum.add(26);
		filNum.add(24);
		filNum.add(22);
		filNum.add(19);
		filNum.add(16);
		filNum.add(12);
		filNum.add(4);
		
		for(int i = 0; i < filNum.size(); i++)
		{
			filLen.add(filNum.get(i)*.4);
		}

		bw.append("G0 F4320 X90 Y90");
		bw.newLine();
		double tempx = 90;
		double tempy = 90;
		double E = 0;
		
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
		
		double tempY = 85;
		double tempX = 100;
		boolean Right = false;
		
		for(int i = 0; i < filNum.size(); i++)
		{
			Right = true;
			height = .27+(.19*i);
			tempX = 99;
			tempY = 85;
			bw.append("G0 F4320 X" + tempX + " Y" + tempY + " Z" + height);
			bw.newLine();
			double dist = 0;
			while(dist < (25 - filLen.get(i)/2) && i < filNum.size())
			{
				tempY -= 1.5;
				E += 1.5*.0945;
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempX += .4;
				E += .4*.0945;
				dist += .4;
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempY += 1.5;
				E += 1.5*.0945;
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				tempX += .4;
				E += .4*.0945;
				dist += .4;
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
			}
			tempX += 1;
			bw.append("G0 F4320 X" + tempX + " Y" + tempY);
			bw.newLine();
			for(int j = 0; j < filNum.get(i); j++)
			{
				if(Right)
				{
					tempY -= 1.5;
					E += 1.5*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
					tempX += .4;
					E += .4*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
				}
				else
				{
					tempY += 1.5;
					E += 1.5*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
					tempX += .4;
					E += .4*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
				}
				Right = !Right;
			}
			tempX += 1;
			bw.append("G0 F4320 X" + tempX + " Y" + tempY);
			bw.newLine();
			while(tempX < 150)
			{
				if(Right)
				{
					tempY -= 1.5;
					E += 1.5*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
					tempX += .4;
					E += .4*.0945;
					dist += .4;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
				}
				else
				{
					tempY += 1.5;
					E += 1.5*.0945;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
					tempX += .4;
					E += .4*.0945;
					dist += .4;
					bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
					bw.newLine();
				}
				Right = !Right;
			}
		}
		
		bw.close();

	}

}
