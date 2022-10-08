package dao;
import java.util.List;

import pojo.Summary;
import pojo.Admin;
import pojo.Consume;
import pojo.Type;
import pojo.Income;
public interface  AccountDAO {
	public List<Consume> queryTodayConsume(); //��ѯ��������
	public List<Income> queryTodayIncome(); //��ѯ��������
	public List<Consume> queryMonthConsume(); //��ѯ��������
	public List<Income> queryMonthIncome(); //��ѯ��������
	public List<Admin> queryAllAdmin(); //��ѯ���й���Ա����
	public int InsertConsumeItem(Consume consume); //�������Ѽ�¼
	public List<Type> queryTypeForInsert(); //�������Ѽ�¼ʱ��ҳ����ʾ��������
	public int InsertIncomeItem(Income income); //���������¼
	public List<Type> queryConsumeType(); //��ѯ�������
	public List<Summary> TodaySummary(); //ÿ��һ��
	public List<Summary> MonthSummary(); //ÿ��һ��
	public List<Summary> DailyConsumeSummary(); //��ѯ������֧��
	public List<Summary> DailyIncomeSummary(); //��ѯ����������
	public List<Summary> MonthConsumeSummary(); //��ѯ������֧��
	public List<Summary> MonthIncomeSummary(); //��ѯ����������
	public int InsertType(Type type1); //�����������
	public List<Consume> PreviousQuery(String Year,String Month,String Day); //�������ڲ�ѯ��������
	public List<Consume> PreviousQuery2(String Year,String Month); //�������ڲ�ѯ��������
	public List<Income> PreviousQuery3(String Year,String Month,String Day); //�������ڲ�ѯ��������
	public List<Income> PreviousQuery4(String Year,String Month); //�������ڲ�ѯ��������
	
}
