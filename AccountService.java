package service;
import java.util.List;
import pojo.Type;
import pojo.Income;

import pojo.Summary;
import pojo.Admin;
import pojo.Consume;
public interface AccountService {
	public List<Consume> queryTodayConsume();  //查询今日消费
	public List<Income> queryTodayIncome();  //查询今日收入
	public List<Consume> queryMonthConsume(); //查询本月消费
	public List<Income> queryMonthIncome();  //查询本月收入
	public List<Admin> queryAllAdmin();  //查询所有管理员表
	public List<Type> queryConsumeType();  //查询所有消费类别
	public int InsertConsumeItem(Consume consume);  //添加消费记录
	public List<Type> queryTypeForInsert();  //获取消费类别表显示于添加消费记录表
	public int InsertIncomeItem(Income income);  //添加收入记录
	public List<Summary> TodaySummary();  //每日一报
	public List<Summary> MonthSummary();  //每月一报
	public List<Summary> DailyConsumeSummary();  //每日消费总金额
	public List<Summary> DailyIncomeSummary();   //每日收入总金额
	public List<Summary> MonthConsumeSummary();  //每月消费总金额
	public List<Summary> MonthIncomeSummary();  //每月收入总金额
	public int InsertType(Type type);  //添加消费类别
	public List<Consume> PreviousQuery(String Year,String Month,String Day);  //往日消费查询
	public List<Consume> PreviousQuery2(String Year,String Month);  //往日收入查询
	public List<Income> PreviousQuery3(String Year,String Month,String Day);  //往月消费查询
	public List<Income> PreviousQuery4(String Year,String Month);  //往月收入查询
}
