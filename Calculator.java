public class Calculator{
	//�������� ������
	public float first;
	public float second;
	public double summ;
	//����� ������, ������ ������ ��� ��������
	public void printCalculator();{ 
	System.out.println("������ ��� �������� ��� ��������("+first+";"+second+")");
	}
	//��������� ������ � ������ ��������
	public void sumData(float first, float second){
	summ = first + second;
	}
}
