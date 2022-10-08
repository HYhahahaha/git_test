package dao;
import java.util.List;

import pojo.Summary;
import pojo.Admin;
import pojo.Consume;
import pojo.Type;
import pojo.Income;
public interface  AccountDAO {
	public List<Consume> queryTodayConsume(); //查询今日消费
	public List<Income> queryTodayIncome(); //查询今日收入
	public List<Consume> queryMonthConsume(); //查询本月消费
	public List<Income> queryMonthIncome(); //查询本月收入
	public List<Admin> queryAllAdmin(); //查询所有管理员名单
	public int InsertConsumeItem(Consume consume); //插入消费记录
	public List<Type> queryTypeForInsert(); //插入消费记录时在页面显示消费类别表
	public int InsertIncomeItem(Income income); //插入收入记录
	public List<Type> queryConsumeType(); //查询消费类别
	public List<Summary> TodaySummary(); //每日一报
	public List<Summary> MonthSummary(); //每月一报
	public List<Summary> DailyConsumeSummary(); //查询今日总支出
	public List<Summary> DailyIncomeSummary(); //查询今日总收入
	public List<Summary> MonthConsumeSummary(); //查询本月总支出
	public List<Summary> MonthIncomeSummary(); //查询本月总收入
	public int InsertType(Type type1); //增加消费类别
	public List<Consume> PreviousQuery(String Year,String Month,String Day); //根据日期查询往日消费
	public List<Consume> PreviousQuery2(String Year,String Month); //根据日期查询往月消费
	public List<Income> PreviousQuery3(String Year,String Month,String Day); //根据日期查询往日收入
	public List<Income> PreviousQuery4(String Year,String Month); //根据日期查询往月收入
	
}
