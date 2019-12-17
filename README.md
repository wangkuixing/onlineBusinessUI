# 网上营业厅（Web端）UI自动化测试

* 网厅是给客户通过Web自助办理业务的渠道，例如密码重置解锁、个人信息修改、交易权限办理等
* 后台是java编写的，对外暴露Restful API，这是针对Web页面的UI测试，对应的接口测试见onlineBusiness项目

## 使用工具

* selenium2
* junit5:测试用例执行
* allure2:自动生成测试报告
* jenkins:CI
* gitlab:代码仓库（私有化部署）

## 运行

代码上传至gitlab，通过jenkins作业化执行，执行完成后生成allure report
