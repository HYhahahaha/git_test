package service;
import java.util.List;
import pojo.Type;
import pojo.Income;

import pojo.Summary;
import pojo.Admin;
import pojo.Consume;
public interface AccountService {
	public List<Consume> queryTodayConsume();  //��ѯ��������
	public List<Income> queryTodayIncome();  //��ѯ��������
	public List<Consume> queryMonthConsume(); //��ѯ��������
	public List<Income> queryMonthIncome();  //��ѯ��������
	public List<Admin> queryAllAdmin();  //��ѯ���й���Ա��
	public List<Type> queryConsumeType();  //��ѯ�����������
	public int InsertConsumeItem(Consume consume);  //������Ѽ�¼
	public List<Type> queryTypeForInsert();  //��ȡ����������ʾ��������Ѽ�¼��
	public int InsertIncomeItem(Income income);  //��������¼
	public List<Summary> TodaySummary();  //ÿ��һ��
	public List<Summary> MonthSummary();  //ÿ��һ��
	public List<Summary> DailyConsumeSummary();  //ÿ�������ܽ��
	public List<Summary> DailyIncomeSummary();   //ÿ�������ܽ��
	public List<Summary> MonthConsumeSummary();  //ÿ�������ܽ��
	public List<Summary> MonthIncomeSummary();  //ÿ�������ܽ��
	public int InsertType(Type type);  //����������
	public List<Consume> PreviousQuery(String Year,String Month,String Day);  //�������Ѳ�ѯ
	public List<Consume> PreviousQuery2(String Year,String Month);  //���������ѯ
	public List<Income> PreviousQuery3(String Year,String Month,String Day);  //�������Ѳ�ѯ
	public List<Income> PreviousQuery4(String Year,String Month);  //���������ѯ
}
