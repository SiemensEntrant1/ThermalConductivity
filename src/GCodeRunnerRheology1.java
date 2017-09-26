import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class GCodeRunnerRheology1 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\maxporter\\Desktop\\out.txt"));
		
		double originX = 120;
		double originY = 120;
		ArrayList<Double> filLen = new ArrayList<Double>();
		
		filLen.add(6.27375485654325);
		filLen.add(8.8);
		filLen.add(10.6883113727099);
		filLen.add(12.2376468326227);
		filLen.add(13.5646599662505);
		filLen.add(14.7295621116176);
		filLen.add(15.7683226755416);
		filLen.add(16.7044904142569);
		filLen.add(17.5544866059934);
		filLen.add(18.3303027798234);
		filLen.add(19.041008376659);
		filLen.add(19.6936538001459);
		filLen.add(20.2938414303453);
		filLen.add(20.8461027532726);
		filLen.add(21.3541565040626);
		filLen.add(21.8210907151774);
		filLen.add(22.2494943762774);
		filLen.add(22.6415547169359);
		filLen.add(22.9991304183441);
		filLen.add(23.3238075793812);
		filLen.add(23.6169430706008);
		filLen.add(23.8796984905589);
		filLen.add(24.1130669969625);
		filLen.add(24.3178946457131);
		filLen.add(24.4948974278318);
		filLen.add(24.644674881199);
		filLen.add(24.7677209286604);
		filLen.add(24.8644324286721);
		filLen.add(24.9351158008139);
		filLen.add(24.9799919935936);
		filLen.add(24.9991999871996);
		filLen.add(24.9927989629013);
		filLen.add(24.9607692189163);
		filLen.add(24.9030118660374);
		filLen.add(24.8193472919817);
		filLen.add(24.7095123383688);
		filLen.add(24.5731560854523);
		filLen.add(24.4098340838278);
		filLen.add(24.219000805153);
		filLen.add((double) 24);
		filLen.add(23.7520525428856);
		filLen.add(23.4742412017939);
		filLen.add(23.1654915769124);
		filLen.add(22.8245481882994);
		filLen.add(22.4499443206436);
		filLen.add(22.0399637023295);
		filLen.add(21.5925913220252);
		filLen.add(21.1054495332367);
		filLen.add(20.5757138393787);
		filLen.add((double) 20);
		filLen.add(19.3742096612997);
		filLen.add(18.6933143128767);
		filLen.add(17.9510445378535);
		filLen.add(17.1394282285029);
		filLen.add(16.248076809272);
		filLen.add(15.2630272226712);
		filLen.add(14.1647449677007);
		filLen.add(12.9243955371229);
		filLen.add(11.49608629056);
		filLen.add(9.79795897113281);
		filLen.add(7.65245058788374);
		filLen.add(4.45421149026429);

		bw.append("G0 F4320 X" + originX + " Y" + originY + " Z" + .2);
		bw.newLine();
		
		double E = 0;
		double tempX = originX;
		double tempY = originY;
		
		for(double i = .2; i < 1.5; i += .19)
		{
			tempX = originX + (6.27375485654325*.5);
			tempY = originY;
			bw.append("G0 F4320 X" + tempX + " Y" + tempY + " Z" + i);
			bw.newLine();
			for(int j = 0; j < filLen.size(); j++)
			{
				tempX -= filLen.get(j);
				E += (filLen.get(j)*.0945);
				bw.append("G1 F1800 X" + tempX + " Y" + tempY + " E" + E);
				bw.newLine();
				if(j < filLen.size()-1) 
				{
					tempY += .4;
					tempX = originX + (filLen.get(j+1)*.5);
					bw.append("G0 F4320 X" + tempX + " Y" + tempY);
					bw.newLine();
				}
			}
			
		}
		bw.close();

	}

}
