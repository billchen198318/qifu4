# Qifu4 Backend Core Module Java / Resource Analysis

Scope: `C:\home\qifu4\backend\core\**`.

## Summary

| Type | Count |
| --- | ---: |
| Java | 184 |
| Properties | 12 |
| JSON | 3 |

## Java Index

| File | Role | Type | Endpoints | Methods | Local Dependencies |
| --- | --- | --- | ---: | ---: | ---: |
| `backend/core/src/main/java/org/qifu/base/aspect/AspectConstants.java` | Java class | class AspectConstants | 0 | 3 | 0 |
| `backend/core/src/main/java/org/qifu/base/aspect/EnableAspectForLogicServiceMethod.java` | Java class |  | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/base/aspect/EnableAspectForSimpleOrBaseServiceMethod.java` | Java class |  | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/base/aspect/IBaseAspectService.java` | Java class | interface IBaseAspectService | 0 | 2 | 2 |
| `backend/core/src/main/java/org/qifu/base/aspect/ServiceAuthorityCheckAspect.java` | Spring component, AOP aspect | class ServiceAuthorityCheckAspect | 0 | 7 | 13 |
| `backend/core/src/main/java/org/qifu/base/aspect/ServiceScriptExpressionProcessAspect.java` | Spring component, AOP aspect | class ServiceScriptExpressionProcessAspect | 0 | 4 | 4 |
| `backend/core/src/main/java/org/qifu/base/CoreAppConstants.java` | Java class | class CoreAppConstants | 0 | 4 | 1 |
| `backend/core/src/main/java/org/qifu/base/service/impl/BaseUserDetailsService.java` | Service or business logic, Spring component | class BaseUserDetailsService | 0 | 3 | 8 |
| `backend/core/src/main/java/org/qifu/core/entity/TbAccount.java` | Persistence entity or model | class TbAccount | 0 | 12 | 4 |
| `backend/core/src/main/java/org/qifu/core/entity/TbAccountKey.java` | Persistence entity or model | class TbAccountKey | 0 | 4 | 2 |
| `backend/core/src/main/java/org/qifu/core/entity/TbRole.java` | Persistence entity or model | class TbRole | 0 | 16 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbRolePermission.java` | Persistence entity or model | class TbRolePermission | 0 | 18 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSys.java` | Persistence entity or model | class TbSys | 0 | 22 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelp.java` | Persistence entity or model | class TbSysBeanHelp | 0 | 20 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelpExpr.java` | Persistence entity or model | class TbSysBeanHelpExpr | 0 | 18 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelpExprMap.java` | Persistence entity or model | class TbSysBeanHelpExprMap | 0 | 20 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysCode.java` | Persistence entity or model | class TbSysCode | 0 | 26 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysEventLog.java` | Persistence entity or model | class TbSysEventLog | 0 | 19 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysExpression.java` | Persistence entity or model | class TbSysExpression | 0 | 20 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysExprJob.java` | Persistence entity or model | class TbSysExprJob | 0 | 37 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysExprJobLog.java` | Persistence entity or model | class TbSysExprJobLog | 0 | 22 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysIcon.java` | Persistence entity or model | class TbSysIcon | 0 | 14 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysJreport.java` | Persistence entity or model | class TbSysJreport | 0 | 22 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysJreportParam.java` | Persistence entity or model | class TbSysJreportParam | 0 | 16 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysLoginLog.java` | Persistence entity or model | class TbSysLoginLog | 0 | 15 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysMailHelper.java` | Persistence entity or model | class TbSysMailHelper | 0 | 30 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysMenu.java` | Persistence entity or model | class TbSysMenu | 0 | 16 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysMenuRole.java` | Persistence entity or model | class TbSysMenuRole | 0 | 14 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysProg.java` | Persistence entity or model | class TbSysProg | 0 | 32 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysQfieldLog.java` | Persistence entity or model | class TbSysQfieldLog | 0 | 22 | 5 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysTemplate.java` | Persistence entity or model | class TbSysTemplate | 0 | 18 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysTemplateParam.java` | Persistence entity or model | class TbSysTemplateParam | 0 | 18 | 6 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysToken.java` | Persistence entity or model | class TbSysToken | 0 | 16 | 3 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysUpload.java` | Persistence entity or model | class TbSysUpload | 0 | 24 | 5 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysUsess.java` | Persistence entity or model | class TbSysUsess | 0 | 12 | 5 |
| `backend/core/src/main/java/org/qifu/core/entity/TbSysUsessKey.java` | Persistence entity or model | class TbSysUsessKey | 0 | 4 | 1 |
| `backend/core/src/main/java/org/qifu/core/entity/TbUserRole.java` | Persistence entity or model | class TbUserRole | 0 | 18 | 6 |
| `backend/core/src/main/java/org/qifu/core/event/ClearTempUploadEvent.java` | Spring component | class ClearTempUploadEvent | 0 | 2 | 2 |
| `backend/core/src/main/java/org/qifu/core/event/EndpointPublishApplicationListener.java` | Spring component | class EndpointPublishApplicationListener | 0 | 5 | 2 |
| `backend/core/src/main/java/org/qifu/core/event/JReportDeployEvent.java` | Spring component | class JReportDeployEvent | 0 | 2 | 2 |
| `backend/core/src/main/java/org/qifu/core/interceptor/ControllerAuthorityCheckInterceptor.java` | Java class | class ControllerAuthorityCheckInterceptor | 0 | 6 | 9 |
| `backend/core/src/main/java/org/qifu/core/interceptor/MDC4UserBuildInterceptor.java` | Java class | class MDC4UserBuildInterceptor | 0 | 2 | 2 |
| `backend/core/src/main/java/org/qifu/core/interceptor/MqttMonitoringInterceptor.java` | Java class | class MqttMonitoringInterceptor | 0 | 11 | 2 |
| `backend/core/src/main/java/org/qifu/core/interceptor/UserBuilderInterceptor.java` | Java class | class UserBuilderInterceptor | 0 | 15 | 14 |
| `backend/core/src/main/java/org/qifu/core/logic/IApplicationSystemLogicService.java` | Java class | interface IApplicationSystemLogicService | 0 | 3 | 3 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/ApplicationSystemLogicServiceImpl.java` | Service or business logic | class ApplicationSystemLogicServiceImpl | 0 | 3 | 12 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/RoleLogicServiceImpl.java` | Service or business logic | class RoleLogicServiceImpl | 0 | 16 | 23 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemBeanHelpLogicServiceImpl.java` | Service or business logic | class SystemBeanHelpLogicServiceImpl | 0 | 7 | 18 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemExpressionLogicServiceImpl.java` | Service or business logic | class SystemExpressionLogicServiceImpl | 0 | 6 | 17 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemJreportLogicServiceImpl.java` | Service or business logic | class SystemJreportLogicServiceImpl | 0 | 5 | 13 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemMenuLogicServiceImpl.java` | Service or business logic | class SystemMenuLogicServiceImpl | 0 | 4 | 15 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemProgramLogicServiceImpl.java` | Service or business logic | class SystemProgramLogicServiceImpl | 0 | 3 | 18 |
| `backend/core/src/main/java/org/qifu/core/logic/impl/SystemTemplateLogicServiceImpl.java` | Service or business logic | class SystemTemplateLogicServiceImpl | 0 | 5 | 13 |
| `backend/core/src/main/java/org/qifu/core/logic/IRoleLogicService.java` | Java class | interface IRoleLogicService | 0 | 12 | 4 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemBeanHelpLogicService.java` | Java class | interface ISystemBeanHelpLogicService | 0 | 0 | 5 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemExpressionLogicService.java` | Java class | interface ISystemExpressionLogicService | 0 | 6 | 4 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemJreportLogicService.java` | Java class | interface ISystemJreportLogicService | 0 | 5 | 4 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemMenuLogicService.java` | Java class | interface ISystemMenuLogicService | 0 | 2 | 3 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemProgramLogicService.java` | Java class | interface ISystemProgramLogicService | 0 | 3 | 3 |
| `backend/core/src/main/java/org/qifu/core/logic/ISystemTemplateLogicService.java` | Java class | interface ISystemTemplateLogicService | 0 | 5 | 4 |
| `backend/core/src/main/java/org/qifu/core/mapper/DB1Config.java` | MyBatis mapper | interface DB1Config | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbAccountMapper.java` | MyBatis mapper | interface TbAccountMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbRoleMapper.java` | MyBatis mapper | interface TbRoleMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbRolePermissionMapper.java` | MyBatis mapper | interface TbRolePermissionMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpExprMapMapper.java` | MyBatis mapper | interface TbSysBeanHelpExprMapMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpExprMapper.java` | MyBatis mapper | interface TbSysBeanHelpExprMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpMapper.java` | MyBatis mapper | interface TbSysBeanHelpMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysCodeMapper.java` | MyBatis mapper | interface TbSysCodeMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysEventLogMapper.java` | MyBatis mapper | interface TbSysEventLogMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysExpressionMapper.java` | MyBatis mapper | interface TbSysExpressionMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysExprJobLogMapper.java` | MyBatis mapper | interface TbSysExprJobLogMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysExprJobMapper.java` | MyBatis mapper | interface TbSysExprJobMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysIconMapper.java` | MyBatis mapper | interface TbSysIconMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysJreportMapper.java` | MyBatis mapper | interface TbSysJreportMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysJreportParamMapper.java` | MyBatis mapper | interface TbSysJreportParamMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysLoginLogMapper.java` | MyBatis mapper | interface TbSysLoginLogMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysMailHelperMapper.java` | MyBatis mapper | interface TbSysMailHelperMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysMapper.java` | MyBatis mapper | interface TbSysMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysMenuMapper.java` | MyBatis mapper | interface TbSysMenuMapper | 0 | 0 | 3 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysMenuRoleMapper.java` | MyBatis mapper | interface TbSysMenuRoleMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysProgMapper.java` | MyBatis mapper | interface TbSysProgMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysQfieldLogMapper.java` | MyBatis mapper | interface TbSysQfieldLogMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysTemplateMapper.java` | MyBatis mapper | interface TbSysTemplateMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysTemplateParamMapper.java` | MyBatis mapper | interface TbSysTemplateParamMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysTokenMapper.java` | MyBatis mapper | interface TbSysTokenMapper | 0 | 0 | 3 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysUploadMapper.java` | MyBatis mapper | interface TbSysUploadMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbSysUsessMapper.java` | MyBatis mapper | interface TbSysUsessMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/mapper/TbUserRoleMapper.java` | MyBatis mapper | interface TbUserRoleMapper | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/model/ExpressionJobConstants.java` | DTO/VO/model | class ExpressionJobConstants | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/core/model/ExpressionJobObj.java` | DTO/VO/model | class ExpressionJobObj | 0 | 6 | 3 |
| `backend/core/src/main/java/org/qifu/core/model/LocaleMessageTemplateMethodModel.java` | DTO/VO/model | class LocaleMessageTemplateMethodModel | 0 | 1 | 1 |
| `backend/core/src/main/java/org/qifu/core/model/MailContent.java` | DTO/VO/model | class MailContent | 0 | 4 | 0 |
| `backend/core/src/main/java/org/qifu/core/model/MenuItemType.java` | DTO/VO/model | class MenuItemType | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/core/model/PermissionType.java` | DTO/VO/model | enum PermissionType | 0 | 0 | 0 |
| `backend/core/src/main/java/org/qifu/core/model/ScriptExpressionRunType.java` | DTO/VO/model | class ScriptExpressionRunType | 0 | 2 | 1 |
| `backend/core/src/main/java/org/qifu/core/model/TemplateCode.java` | DTO/VO/model | class TemplateCode | 0 | 1 | 1 |
| `backend/core/src/main/java/org/qifu/core/model/TemplateResultObj.java` | DTO/VO/model | class TemplateResultObj | 0 | 4 | 0 |
| `backend/core/src/main/java/org/qifu/core/model/UploadTypes.java` | DTO/VO/model | class UploadTypes | 0 | 2 | 1 |
| `backend/core/src/main/java/org/qifu/core/model/User.java` | DTO/VO/model | class User | 0 | 14 | 6 |
| `backend/core/src/main/java/org/qifu/core/scheduled/ClearSystemLogJob.java` | Spring component, Scheduled job | class ClearSystemLogJob | 0 | 1 | 6 |
| `backend/core/src/main/java/org/qifu/core/scheduled/ClearTempUploadJob.java` | Spring component, Scheduled job | class ClearTempUploadJob | 0 | 1 | 2 |
| `backend/core/src/main/java/org/qifu/core/scheduled/SendMailHelperJob.java` | Spring component, Scheduled job | class SendMailHelperJob, class ProcessWorker | 0 | 7 | 11 |
| `backend/core/src/main/java/org/qifu/core/scheduled/SysExpressionJob.java` | Spring component, Scheduled job | class SysExpressionJob | 0 | 2 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/IAccountService.java` | Service interface | interface IAccountService | 0 | 1 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/impl/AccountServiceImpl.java` | Service or business logic, Spring component | class AccountServiceImpl | 0 | 2 | 8 |
| `backend/core/src/main/java/org/qifu/core/service/impl/RolePermissionServiceImpl.java` | Service or business logic, Spring component | class RolePermissionServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/RoleServiceImpl.java` | Service or business logic, Spring component | class RoleServiceImpl | 0 | 3 | 7 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpExprMapServiceImpl.java` | Service or business logic, Spring component | class SysBeanHelpExprMapServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpExprServiceImpl.java` | Service or business logic, Spring component | class SysBeanHelpExprServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpServiceImpl.java` | Service or business logic, Spring component | class SysBeanHelpServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysCodeServiceImpl.java` | Service or business logic, Spring component | class SysCodeServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysEventLogServiceImpl.java` | Service or business logic, Spring component | class SysEventLogServiceImpl | 0 | 3 | 6 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysExpressionServiceImpl.java` | Service or business logic, Spring component | class SysExpressionServiceImpl | 0 | 2 | 7 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysExprJobLogServiceImpl.java` | Service or business logic, Spring component | class SysExprJobLogServiceImpl | 0 | 2 | 6 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysExprJobServiceImpl.java` | Service or business logic, Spring component | class SysExprJobServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysIconServiceImpl.java` | Service or business logic, Spring component | class SysIconServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysJreportParamServiceImpl.java` | Service or business logic, Spring component | class SysJreportParamServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysJreportServiceImpl.java` | Service or business logic, Spring component | class SysJreportServiceImpl | 0 | 3 | 8 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysLoginLogServiceImpl.java` | Service or business logic, Spring component | class SysLoginLogServiceImpl | 0 | 4 | 8 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysMailHelperServiceImpl.java` | Service or business logic, Spring component | class SysMailHelperServiceImpl | 0 | 4 | 9 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysMenuRoleServiceImpl.java` | Service or business logic, Spring component | class SysMenuRoleServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysMenuServiceImpl.java` | Service or business logic, Spring component | class SysMenuServiceImpl | 0 | 5 | 12 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysProgServiceImpl.java` | Service or business logic, Spring component | class SysProgServiceImpl | 0 | 5 | 11 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysQfieldLogServiceImpl.java` | Service or business logic, Spring component | class SysQfieldLogServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysServiceImpl.java` | Service or business logic, Spring component | class SysServiceImpl | 0 | 2 | 8 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysTemplateParamServiceImpl.java` | Service or business logic, Spring component | class SysTemplateParamServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysTemplateServiceImpl.java` | Service or business logic, Spring component | class SysTemplateServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysTokenServiceImpl.java` | Service or business logic, Spring component | class SysTokenServiceImpl | 0 | 3 | 8 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysUploadServiceImpl.java` | Service or business logic, Spring component | class SysUploadServiceImpl | 0 | 3 | 10 |
| `backend/core/src/main/java/org/qifu/core/service/impl/SysUsessServiceImpl.java` | Service or business logic, Spring component | class SysUsessServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/impl/UserRoleServiceImpl.java` | Service or business logic, Spring component | class UserRoleServiceImpl | 0 | 1 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/IRolePermissionService.java` | Service interface | interface IRolePermissionService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/IRoleService.java` | Service interface | interface IRoleService | 0 | 2 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpExprMapService.java` | Service interface | interface ISysBeanHelpExprMapService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpExprService.java` | Service interface | interface ISysBeanHelpExprService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpService.java` | Service interface | interface ISysBeanHelpService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysCodeService.java` | Service interface | interface ISysCodeService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysEventLogService.java` | Service interface | interface ISysEventLogService | 0 | 2 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysExpressionService.java` | Service interface | interface ISysExpressionService | 0 | 1 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysExprJobLogService.java` | Service interface | interface ISysExprJobLogService | 0 | 1 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysExprJobService.java` | Service interface | interface ISysExprJobService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysIconService.java` | Service interface | interface ISysIconService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysJreportParamService.java` | Service interface | interface ISysJreportParamService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysJreportService.java` | Service interface | interface ISysJreportService | 0 | 2 | 4 |
| `backend/core/src/main/java/org/qifu/core/service/ISysLoginLogService.java` | Service interface | interface ISysLoginLogService | 0 | 3 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysMailHelperService.java` | Service interface | interface ISysMailHelperService | 0 | 3 | 4 |
| `backend/core/src/main/java/org/qifu/core/service/ISysMenuRoleService.java` | Service interface | interface ISysMenuRoleService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysMenuService.java` | Service interface | interface ISysMenuService | 0 | 2 | 5 |
| `backend/core/src/main/java/org/qifu/core/service/ISysProgService.java` | Service interface | interface ISysProgService | 0 | 4 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysQfieldLogService.java` | Service interface | interface ISysQfieldLogService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysService.java` | Service interface | interface ISysService | 0 | 1 | 3 |
| `backend/core/src/main/java/org/qifu/core/service/ISysTemplateParamService.java` | Service interface | interface ISysTemplateParamService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysTemplateService.java` | Service interface | interface ISysTemplateService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/ISysTokenService.java` | Service interface | interface ISysTokenService | 0 | 2 | 4 |
| `backend/core/src/main/java/org/qifu/core/service/ISysUploadService.java` | Service interface | interface ISysUploadService | 0 | 2 | 4 |
| `backend/core/src/main/java/org/qifu/core/service/ISysUsessService.java` | Service interface | interface ISysUsessService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/service/IUserRoleService.java` | Service interface | interface IUserRoleService | 0 | 0 | 2 |
| `backend/core/src/main/java/org/qifu/core/support/BaseAuthenticationSuccessHandler.java` | Spring component | class BaseAuthenticationSuccessHandler | 0 | 5 | 15 |
| `backend/core/src/main/java/org/qifu/core/support/BaseLoginUrlAuthenticationEntryPoint.java` | Java class | class BaseLoginUrlAuthenticationEntryPoint | 0 | 1 | 3 |
| `backend/core/src/main/java/org/qifu/core/support/ExpressionJobExecuteCallable.java` | Java class | class ExpressionJobExecuteCallable | 0 | 4 | 17 |
| `backend/core/src/main/java/org/qifu/core/support/JwtAuthEntryPoint.java` | Spring component | class JwtAuthEntryPoint | 0 | 1 | 1 |
| `backend/core/src/main/java/org/qifu/core/support/JwtAuthLoginedUserRoleService.java` | Spring component | class JwtAuthLoginedUserRoleService | 0 | 11 | 16 |
| `backend/core/src/main/java/org/qifu/core/support/SysEventLogSupport.java` | Java class | class SysEventLogSupport | 0 | 1 | 4 |
| `backend/core/src/main/java/org/qifu/core/util/CookieUtils.java` | Utility | class CookieUtils | 0 | 2 | 1 |
| `backend/core/src/main/java/org/qifu/core/util/CoreApiSupport.java` | Utility | class CoreApiSupport | 0 | 9 | 10 |
| `backend/core/src/main/java/org/qifu/core/util/IconUtils.java` | Utility | class IconUtils | 0 | 5 | 5 |
| `backend/core/src/main/java/org/qifu/core/util/JReportUtils.java` | Utility | class JReportUtils | 0 | 10 | 12 |
| `backend/core/src/main/java/org/qifu/core/util/LocaleMessageSourceUtils.java` | Utility | class LocaleMessageSourceUtils | 0 | 3 | 1 |
| `backend/core/src/main/java/org/qifu/core/util/MailClientUtils.java` | Utility | class MailClientUtils | 0 | 0 | 4 |
| `backend/core/src/main/java/org/qifu/core/util/PdfConvertUtils.java` | Utility | class PdfConvertUtils | 0 | 1 | 2 |
| `backend/core/src/main/java/org/qifu/core/util/PdfCopyPageBuilder.java` | Utility | class PdfCopyPageBuilder | 0 | 15 | 3 |
| `backend/core/src/main/java/org/qifu/core/util/ServiceScriptExpressionUtils.java` | Utility | class ServiceScriptExpressionUtils | 0 | 8 | 14 |
| `backend/core/src/main/java/org/qifu/core/util/SystemExpressionJobUtils.java` | Utility | class SystemExpressionJobUtils | 0 | 7 | 15 |
| `backend/core/src/main/java/org/qifu/core/util/SystemSettingConfigureUtils.java` | Utility | class SystemSettingConfigureUtils | 0 | 10 | 5 |
| `backend/core/src/main/java/org/qifu/core/util/TemplateUtils.java` | Utility | class TemplateUtils | 0 | 7 | 10 |
| `backend/core/src/main/java/org/qifu/core/util/UploadSupportUtils.java` | Utility | class UploadSupportUtils | 0 | 22 | 11 |
| `backend/core/src/main/java/org/qifu/core/util/UserUtils.java` | Utility | class UserUtils | 0 | 12 | 9 |
| `backend/core/src/main/java/org/qifu/core/vo/BoardDemo.java` | DTO/VO/model | class BoardDemo | 0 | 6 | 0 |
| `backend/core/src/main/java/org/qifu/core/vo/MqttBrokerVO.java` | DTO/VO/model | class MqttBrokerVO, class MqttClientVO | 0 | 16 | 0 |
| `backend/core/src/main/java/org/qifu/core/vo/MqttMessageVO.java` | DTO/VO/model | class MqttMessageVO | 0 | 6 | 0 |
| `backend/core/src/main/java/org/qifu/core/vo/MqttTopicVO.java` | DTO/VO/model | class MqttTopicVO | 0 | 7 | 0 |
| `backend/core/src/main/java/org/qifu/core/vo/ProgramAndMenuResult.java` | DTO/VO/model | class ProgramAndMenuResult | 0 | 4 | 1 |
| `backend/core/src/main/java/org/qifu/core/vo/SysMenuVO.java` | DTO/VO/model | class SysMenuVO | 0 | 20 | 1 |
| `backend/core/src/main/java/org/qifu/core/webservice/interceptor/SoapForceDoclitBareInInterceptor.java` | Java class | class SoapForceDoclitBareInInterceptor | 0 | 1 | 0 |

## Java Files Detailed Analysis

### `backend/core/src/main/java/org/qifu/base/aspect/AspectConstants.java`

- Purpose: Java class; declares class AspectConstants; has 3 detected methods
- Package: `org.qifu.base.aspect`
- Role: Java class
- Main types: `class AspectConstants`
- Spring dependencies: `org.springframework.stereotype.Repository`, `org.springframework.stereotype.Service`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L47 `public boolean isLogicService(String serviceId)`
  - L51 `public String getServiceId(Annotation[] annotations)`
  - L64 `public String getRepositoryId(Annotation[] annotations)`
- Main fields:
  - L36 `String BASE_SERVICE_PACKAGE`
  - L41 `String LOGIC_SERVICE_PACKAGE`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\AspectConstants.java`
- Size: 2694 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.base.aspect;

import java.lang.annotation.Annotation;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class AspectConstants {
	
	/**
	 * 注意 service.*.*   不是 service..*.* , 如果兩個點..*.* 就會包含 service.logic.
	 * 注意 base.service.*.* 不是 base.service..*.*
	 */
	public static final String BASE_SERVICE_PACKAGE = " @annotation(org.qifu.base.aspect.EnableAspectForSimpleOrBaseServiceMethod) || execution(* org.qifu.core.service.*.*(..) ) || execution(* org.qifu.base.service.*.*(..) ) ";
	
	/**
	 * 注意 base.service.logic.*.* 不是 base.service.logic..*.*
	 */
	public static final String LOGIC_SERVICE_PACKAGE = " @annotation(org.qifu.base.aspect.EnableAspectForLogicServiceMethod) || execution(* org.qifu.core.logic.*.*(..) ) || execution(* org.qifu.base.logic..*.*(..) ) ";
	
	protected AspectConstants() {
		throw new IllegalStateException("Constants class: AspectConstants");
	}
	
	public static boolean isLogicService(String serviceId) {
		return (StringUtils.defaultString(serviceId).indexOf(".logic.") >= 0) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static String getServiceId(Annotation[] annotations) {
		String serviceId = "";
		if (annotations == null) {
			return serviceId;
		}
		for (Annotation anno : annotations) {
			if (anno instanceof @SuppressWarnings("unused") Service s) {
				serviceId = ((Service)anno).value();
			}
		}
		return serviceId;
	}
	
	public static String getRepositoryId(Annotation[] annotations) {
		String repoId = "";
		if (annotations == null) {
			return repoId;
		}
		for (Annotation anno : annotations) {
			if (anno instanceof @SuppressWarnings("unused") Repository r) {
				repoId = ((Repository)anno).value();
			}
		}
		return repoId;
	}	
	
}
````

### `backend/core/src/main/java/org/qifu/base/aspect/EnableAspectForLogicServiceMethod.java`

- Purpose: Java class
- Package: `org.qifu.base.aspect`
- Role: Java class
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\EnableAspectForLogicServiceMethod.java`
- Size: 327 bytes

#### Source

````java
package org.qifu.base.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnableAspectForLogicServiceMethod {
	
}
````

### `backend/core/src/main/java/org/qifu/base/aspect/EnableAspectForSimpleOrBaseServiceMethod.java`

- Purpose: Java class
- Package: `org.qifu.base.aspect`
- Role: Java class
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\EnableAspectForSimpleOrBaseServiceMethod.java`
- Size: 334 bytes

#### Source

````java
package org.qifu.base.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnableAspectForSimpleOrBaseServiceMethod {
	
}
````

### `backend/core/src/main/java/org/qifu/base/aspect/IBaseAspectService.java`

- Purpose: Java class; declares interface IBaseAspectService; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.base.aspect`
- Role: Java class
- Main types: `interface IBaseAspectService`
- Local dependencies: `org.qifu.base.exception.AuthorityException`, `org.qifu.base.exception.ServiceException`
- Third-party dependencies: `org.aspectj.lang.ProceedingJoinPoint`
- Main methods:
  - L30 `public Object logicServiceProcess(ProceedingJoinPoint pjp)`
  - L32 `public Object baseServiceProcess(ProceedingJoinPoint pjp)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\IBaseAspectService.java`
- Size: 1262 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.base.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.qifu.base.exception.AuthorityException;
import org.qifu.base.exception.ServiceException;

public interface IBaseAspectService {
	
	public Object logicServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable;
	
	public Object baseServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable;
	
}
````

### `backend/core/src/main/java/org/qifu/base/aspect/ServiceAuthorityCheckAspect.java`

- Purpose: Spring component, AOP aspect; declares class ServiceAuthorityCheckAspect; has 7 detected methods; depends on 13 org.qifu local types
- Package: `org.qifu.base.aspect`
- Role: Spring component, AOP aspect
- Main types: `class ServiceAuthorityCheckAspect implements IBaseAspectService`
- Key annotations: `Order`, `Aspect`, `Component`, `Resource`, `Override`, `Around`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.AuthorityException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`, `org.qifu.core.support.SysEventLogSupport`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.core.annotation.Order`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.text.WordUtils`, `org.aspectj.lang.ProceedingJoinPoint`, `org.aspectj.lang.annotation.Around`, `org.aspectj.lang.annotation.Aspect`, `org.aspectj.lang.reflect.MethodSignature`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Injection/config points:
  - L65 `@Resource` -> `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {`
- Main methods:
  - L61 `public BaseInfoConfigProperties getBaseInfoConfigProperties()`
  - L66 `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties)`
  - L75 `public Object baseServiceProcess(ProceedingJoinPoint pjp)`
  - L83 `public Object logicServiceProcess(ProceedingJoinPoint pjp)`
  - L123 `private void log(String username, String systemId, String eventId, boolean permit)`
  - L143 `private boolean isServiceMethodAuthority(String serviceId, Annotation[] annotations)`
  - L169 `private String getEventId(String serviceId, String methodName)`
- Main fields:
  - L57 `Logger logger`
  - L59 `BaseInfoConfigProperties baseInfoConfigProperties`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\ServiceAuthorityCheckAspect.java`
- Size: 6690 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.base.aspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.qifu.base.Constants;
import org.qifu.base.exception.AuthorityException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.qifu.core.support.SysEventLogSupport;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Order(0)
@Aspect
@Component
public class ServiceAuthorityCheckAspect implements IBaseAspectService {
	protected static Logger logger = LoggerFactory.getLogger(ServiceAuthorityCheckAspect.class);
	
	private BaseInfoConfigProperties baseInfoConfigProperties;	
	
	public BaseInfoConfigProperties getBaseInfoConfigProperties() {
		return baseInfoConfigProperties;
	}
	
	@Resource
	public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {
		this.baseInfoConfigProperties = baseInfoConfigProperties;
	}

	/**
	 * no enable for scan Base service package
	 */
	//@Around( AspectConstants.BASE_SERVICE_PACKAGE )
	@Override
	public Object baseServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable {
		/**
		 * do something...
		 */
		return pjp.proceed();
	}
	
	@Around( AspectConstants.LOGIC_SERVICE_PACKAGE )
	public Object logicServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable {
		MethodSignature signature=(MethodSignature)pjp.getSignature();
		Annotation[] annotations=pjp.getTarget().getClass().getAnnotations();
		String serviceId = AspectConstants.getServiceId(annotations);
		if (StringUtils.isBlank(serviceId)) {
			serviceId = WordUtils.uncapitalize(pjp.getTarget().getClass().getSimpleName());
		}
		Method method = signature.getMethod();
		String username = "";
		User user = UserUtils.getCurrentUser();
		if (user != null) {
			username = user.getUsername();
		}
		String systemId = baseInfoConfigProperties.getSystem();
		if (UserUtils.hasRole(Constants.SUPER_ROLE_ALL) || UserUtils.hasRole(Constants.SUPER_ROLE_ADMIN)) {
			log(username, systemId, this.getEventId(serviceId, method.getName()), true );
			return pjp.proceed();
		}
		if (StringUtils.isBlank(serviceId)) { // 沒有 service id 無法判斷檢查 
			log(username, systemId, this.getEventId(serviceId, method.getName()), true );
			return pjp.proceed();
		}
		if (!this.isServiceAuthorityCheck(annotations)) { // 沒有 ServiceAuthority 或 check=false 就不用檢查了 
			log(username, systemId, this.getEventId(serviceId, method.getName()), true );
			return pjp.proceed();
		}		
		Annotation[] methodAnnotations = method.getAnnotations();
		if (this.isServiceMethodAuthority(serviceId, methodAnnotations)) {
			log(username, systemId, this.getEventId(serviceId, method.getName()), true );
			return pjp.proceed();
		}
		logger.warn(
				"[decline] user[{}] {} - {}" 
				, UserUtils.getCurrentUser().getUsername()
				, pjp.getTarget().getClass().getName()
				, signature.getMethod().getName());		
		log(username, systemId, this.getEventId(serviceId, method.getName()), false );
		throw new AuthorityException(BaseSystemMessage.noPermission());
	}
	
	private void log(String username, String systemId, String eventId, boolean permit) {
		if (!YesNoKeyProvide.YES.equals(baseInfoConfigProperties.getEnableServiceAuthChecLog())) {
			return;
		}
		SysEventLogSupport.log(username, systemId, eventId, permit);
	}
	
	private boolean isServiceAuthorityCheck(Annotation[] annotations) { // 沒有 ServiceAuthority 或 check=false 就不用檢查了 
		if (null==annotations || annotations.length<1) {
			return false;
		}
		boolean check = false;
		for (Annotation anno : annotations) {
			if (anno instanceof @SuppressWarnings("unused") ServiceAuthority sa) {
				check = ((ServiceAuthority)anno).check();
			}
		}
		return check;
	}
	
	private boolean isServiceMethodAuthority(String serviceId, Annotation[] annotations) {
		if (annotations==null || annotations.length<1) { // 沒有 @ServiceMethodAuthority 不要檢查權限
			return true;
		}
		boolean status = false;
		boolean foundServiceMethodAuthority = false;
		for (Annotation anno : annotations) {
			if (anno instanceof @SuppressWarnings("unused") ServiceMethodAuthority sma) {
				foundServiceMethodAuthority = true;
				ServiceMethodType[] types = ((ServiceMethodAuthority)anno).type();
				for (int i=0; types!=null && !status && i<types.length; i++) {
					ServiceMethodType type = types[i];
					// 如 core.service.logic.ApplicationSystemLogicService#INSERT
					String methodPerm = serviceId + Constants.SERVICE_ID_TYPE_DISTINGUISH_SYMBOL + type.toString();
					if (UserUtils.isPermitted(methodPerm, PermissionType.SERVICE.name())) {
						status = true;
					}
				}
			}
		}
		if (!foundServiceMethodAuthority) { // 沒有 @ServiceMethodAuthority 不要檢查權限 
			return true;
		}
		return status;
	}
	
	private String getEventId(String serviceId, String methodName) {
		return serviceId + "@" + methodName;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/base/aspect/ServiceScriptExpressionProcessAspect.java`

- Purpose: Spring component, AOP aspect; declares class ServiceScriptExpressionProcessAspect; has 4 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.base.aspect`
- Role: Spring component, AOP aspect
- Main types: `class ServiceScriptExpressionProcessAspect implements IBaseAspectService`
- Key annotations: `Order`, `Aspect`, `Component`, `Resource`, `Override`, `Around`
- Local dependencies: `org.qifu.base.exception.AuthorityException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.core.util.ServiceScriptExpressionUtils`
- Spring dependencies: `org.springframework.core.annotation.Order`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.text.WordUtils`, `org.aspectj.lang.ProceedingJoinPoint`, `org.aspectj.lang.annotation.Around`, `org.aspectj.lang.annotation.Aspect`, `org.aspectj.lang.reflect.MethodSignature`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Injection/config points:
  - L56 `@Resource` -> `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {`
- Main methods:
  - L52 `public BaseInfoConfigProperties getBaseInfoConfigProperties()`
  - L57 `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties)`
  - L66 `public Object baseServiceProcess(ProceedingJoinPoint pjp)`
  - L74 `public Object logicServiceProcess(ProceedingJoinPoint pjp)`
- Main fields:
  - L48 `Logger logger`
  - L50 `BaseInfoConfigProperties baseInfoConfigProperties`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\aspect\ServiceScriptExpressionProcessAspect.java`
- Size: 3635 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.base.aspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.qifu.base.exception.AuthorityException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.core.util.ServiceScriptExpressionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Order(10)
@Aspect
@Component
public class ServiceScriptExpressionProcessAspect implements IBaseAspectService {
	protected static Logger logger = LoggerFactory.getLogger(ServiceScriptExpressionProcessAspect.class);
	
	private BaseInfoConfigProperties baseInfoConfigProperties;	
	
	public BaseInfoConfigProperties getBaseInfoConfigProperties() {
		return baseInfoConfigProperties;
	}
	
	@Resource
	public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {
		this.baseInfoConfigProperties = baseInfoConfigProperties;
	}
	
	/**
	 * no enable for scan Base service package
	 */
	//@Around( AspectConstants.BASE_SERVICE_PACKAGE )
	@Override
	public Object baseServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable {
		/**
		 * do something...
		 */
		return pjp.proceed();
	}
	
	@Around( AspectConstants.LOGIC_SERVICE_PACKAGE )
	public Object logicServiceProcess(ProceedingJoinPoint pjp) throws AuthorityException, ServiceException, Throwable {
		Annotation[] annotations=pjp.getTarget().getClass().getAnnotations();
		MethodSignature signature=(MethodSignature)pjp.getSignature();
		if (annotations==null || annotations.length<1) { 
			return pjp.proceed();
		}		
		String beanId = AspectConstants.getServiceId(annotations);	
		if (StringUtils.isBlank(beanId)) {
			beanId = WordUtils.uncapitalize(pjp.getTarget().getClass().getSimpleName());
		}
		if (StringUtils.isBlank(beanId)) {
			return pjp.proceed();
		}
		if ( !ServiceScriptExpressionUtils.needProcess(beanId, signature.getMethod().getName(), baseInfoConfigProperties.getSystem()) ) {
			return pjp.proceed();
		}
		Method method = signature.getMethod();
		ServiceScriptExpressionUtils.processBefore(beanId, signature.getMethod(), baseInfoConfigProperties.getSystem(), pjp);
		Object obj = pjp.proceed();
		ServiceScriptExpressionUtils.processAfter(beanId, method, baseInfoConfigProperties.getSystem(), obj, pjp);
		return obj;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/base/CoreAppConstants.java`

- Purpose: Java class; declares class CoreAppConstants; has 4 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base`
- Role: Java class
- Main types: `class CoreAppConstants`
- Key annotations: `SuppressWarnings`
- Local dependencies: `org.qifu.util.LoadResources`
- Main methods:
  - L142 `public String[] getWebconfigresource()`
  - L146 `public String[] getWebconfigresourcelocations()`
  - L150 `public String[] getWebconfiginterceptorexcludepathpatternsVariable()`
  - L154 `public String[] getWebConfiginterceptorExcludePathPatterns()`
- Main fields:
  - L35 `String SYS_PAGE_LOGIN`
  - L36 `String SYS_PAGE_TAB_LOGIN_AGAIN`
  - L37 `String SYS_PAGE_NO_AUTH`
  - L38 `String SYS_BLANK_ROLE`
  - L39 `String WEBSERVICE_PATH`
  - L41 `String X_CSRF_TOKEN_HEADER`
  - L43 `String API_AUTH_VALID_LOGINED`
  - L44 `String API_AUTH_SIGNIN`
  - L45 `String API_AUTH_LOGOUT`
  - L46 `String API_AUTH_REFRESH_TOKEN`
  - L61 `Map<String, Object> excludePathPatternsMap`
  - L63 `String[] excludePathPatternsArray`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\CoreAppConstants.java`
- Size: 5170 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.qifu.util.LoadResources;

public class CoreAppConstants {
	
	public static final String SYS_PAGE_LOGIN = "/loginPage";
	public static final String SYS_PAGE_TAB_LOGIN_AGAIN = "/loginAgainPage";
	public static final String SYS_PAGE_NO_AUTH = "/noAuthPage";
	public static final String SYS_BLANK_ROLE = "QIFU_BLANK_USERROLE";
	public static final String WEBSERVICE_PATH = "/services/**";
	
	public static final String X_CSRF_TOKEN_HEADER = "X-CSRF-TOKEN";
	
	public static final String API_AUTH_VALID_LOGINED = "/api/auth/validLogined";
	public static final String API_AUTH_SIGNIN = "/api/auth/signin";
	public static final String API_AUTH_LOGOUT = "/api/auth/logout";	
	public static final String API_AUTH_REFRESH_TOKEN = "/api/auth/refreshNewToken";		
	public static final String[] AUTH_PATH = new String[] {
			API_AUTH_VALID_LOGINED,
			API_AUTH_SIGNIN,
			API_AUTH_LOGOUT,
			API_AUTH_REFRESH_TOKEN
	};
	public static final String[] AUTH_PATH_NO_REFRESH_TOKEN = new String[] {
			API_AUTH_VALID_LOGINED,
			API_AUTH_SIGNIN,
			API_AUTH_LOGOUT
	};	
	
	// ======================================================================================
	
	private static Map<String, Object> excludePathPatternsMap = null;
	
	private static String[] excludePathPatternsArray = null;
	
	protected CoreAppConstants() {
		throw new IllegalStateException("Constants class: CoreAppConstants");
	}
	
	static {
		try {
			excludePathPatternsMap = LoadResources.objectMapperReadValue("excludePathPatterns.json", HashMap.class, CoreAppConstants.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null==excludePathPatternsMap) {
				excludePathPatternsMap = new HashMap<>();
			}
		}
	}
	
	protected static final String [] WebConfigResource = {
			"/webjars/**",
			"swagger-ui.html",
            "/**" // frontend static html/js resource
	};
	
	protected static final String[] WebConfigResourceLocations = {
            "classpath:/META-INF/resources/webjars/",
            "classpath:/META-INF/resources/",
            "classpath:/static/" // frontend static html/js/image resource
	};
	
	protected static final String[] WebConfigInterceptorExcludePathPatterns = {
		    "/ui5/**",
		    "/webjars/**",
		    "/bootbox/**",
		    "/bootstrap-vali/**",
		    "/css/**",
		    "/font-awesome/**",
		    "/icons/**",
		    "/images/**",
		    "/jquery/**",
		    "/js/**",
		    "/codemirror/**",
		    "/popper-js/**",
		    "/tether/**",
		    "/toastr/**",
		    
		    /*
		     * Error
		     */
		    "/error",
		    "/error/**",

		    /*
		     * Swagger / OpenAPI
		     */
		    "/swagger-resources/**",
		    "/swagger-ui",
		    "/swagger-ui/**",
		    "/swagger-ui.html",
		    "/v3/api-docs",
		    "/v3/api-docs/**",

		    /*
		     * CSRF
		     */
		    "/csrf",
		    "/csrf/**",
		    "/configJs.js",

		    /*
		     * Login / auth
		     */
		    SYS_PAGE_TAB_LOGIN_AGAIN,
		    "/login",
		    SYS_PAGE_LOGIN,
		    "/logout",
		    SYS_PAGE_NO_AUTH
	};
	
	public static String[] getWebconfigresource() {
		return WebConfigResource;
	}

	public static String[] getWebconfigresourcelocations() {
		return WebConfigResourceLocations;
	}

	public static String[] getWebconfiginterceptorexcludepathpatternsVariable() {
		return WebConfigInterceptorExcludePathPatterns;
	}

	public static String[] getWebConfiginterceptorExcludePathPatterns() {
		if (excludePathPatternsArray != null) {
			return excludePathPatternsArray;
		}
		@SuppressWarnings("unchecked")
		List<String> excludePathPatterns = (List<String>) excludePathPatternsMap.get("excludePathPatterns");
		if ( null == excludePathPatterns ) {
			excludePathPatterns = new ArrayList<>();
		}
		Object[] arr = Stream.concat( Arrays.stream(WebConfigInterceptorExcludePathPatterns), Arrays.stream( excludePathPatterns.toArray()) ).toArray();
		excludePathPatternsArray = Arrays.copyOf(arr, arr.length, String[].class);
		return excludePathPatternsArray;
	}	
	
	// ======================================================================================
	
}
````

### `backend/core/src/main/java/org/qifu/base/service/impl/BaseUserDetailsService.java`

- Purpose: Service or business logic, Spring component; declares class BaseUserDetailsService; has 3 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.base.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class BaseUserDetailsService implements UserDetailsService`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.LdapLoginConfigProperties`, `org.qifu.core.entity.TbAccount`, `org.qifu.core.model.User`, `org.qifu.core.service.IAccountService`
- Spring dependencies: `org.springframework.ldap.core.LdapTemplate`, `org.springframework.ldap.filter.AndFilter`, `org.springframework.ldap.filter.EqualsFilter`, `org.springframework.security.core.userdetails.UserDetails`, `org.springframework.security.core.userdetails.UserDetailsService`, `org.springframework.security.core.userdetails.UsernameNotFoundException`, `org.springframework.security.crypto.password.PasswordEncoder`, `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L78 `public UserDetails loadUserByUsername(String username)`
  - L90 `private UserDetails loadFromLDAP(String username)`
  - L113 `private UserDetails loadFromDB(String username)`
- Main fields:
  - L54 `Logger logger`
  - L56 `IAccountService<TbAccount, String> accountService`
  - L58 `LdapLoginConfigProperties ldapLoginConfigProperties`
  - L60 `LdapTemplate ldapTemplate`
  - L62 `PasswordEncoder passwordEncoder`
  - L64 `HttpServletRequest request`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\base\service\impl\BaseUserDetailsService.java`
- Size: 5722 bytes

#### Source

````java
/*
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * -----------------------------------------------------------------------
 *
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 *
 */
package org.qifu.base.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.LdapLoginConfigProperties;
import org.qifu.core.entity.TbAccount;
import org.qifu.core.model.User;
import org.qifu.core.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpServletRequest;

@Component
@Service
@Transactional(propagation= Propagation.REQUIRED, timeout=300, readOnly=true)
public class BaseUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    
    private final IAccountService<TbAccount, String> accountService;
    
    private final LdapLoginConfigProperties ldapLoginConfigProperties;
    
    private final LdapTemplate ldapTemplate;
    
    private final PasswordEncoder passwordEncoder;
    
    private final HttpServletRequest request;
    
    public BaseUserDetailsService(IAccountService<TbAccount, String> accountService,
			LdapLoginConfigProperties ldapLoginConfigProperties, LdapTemplate ldapTemplate,
			PasswordEncoder passwordEncoder, HttpServletRequest request) {
		super();
		this.accountService = accountService;
		this.ldapLoginConfigProperties = ldapLoginConfigProperties;
		this.ldapTemplate = ldapTemplate;
		this.passwordEncoder = passwordEncoder;
		this.request = request;
	}

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("login account: {}", username);
        if (StringUtils.isBlank(username)) {
        	logger.warn("account value blank.");
        	throw new UsernameNotFoundException( BaseSystemMessage.parameterBlank() );
        }
        if (!YesNoKeyProvide.YES.equals(ldapLoginConfigProperties.getLoginEnable())) {
        	return this.loadFromDB(username);
        }
        return this.loadFromLDAP(username);
    }
    
    private UserDetails loadFromLDAP(String username) throws UsernameNotFoundException {
    	String userPassword = (String) this.request.getAttribute(Constants.HTTP_REQUEST_PASSWORD_AUTH);
    	if (StringUtils.isBlank(userPassword)) {
    		throw new UsernameNotFoundException( "password " + BaseSystemMessage.parameterBlank() );
    	}
    	Boolean auth = false;
		AndFilter filter = new AndFilter();
		filter.and(new EqualsFilter(ldapLoginConfigProperties.getSearchFilter(), username));
		String[] ouArr = StringUtils.defaultString(ldapLoginConfigProperties.getAuthSearchBase()).split(Constants.DEFAULT_SPLIT_DELIMITER);
		if (null == ouArr || ouArr.length < 1) {
			auth = ldapTemplate.authenticate("", filter.encode(), userPassword);
		}
		for (int i = 0; Boolean.TRUE.equals(!auth && ouArr != null) && i < ouArr.length; i++) {
			auth = ldapTemplate.authenticate(StringUtils.deleteWhitespace(ouArr[i]), filter.encode(), userPassword);
		}
		if (Boolean.FALSE.equals(auth)) {
			throw new UsernameNotFoundException("LDAP auth fail!");
		}
		User user = new User(username, passwordEncoder.encode(userPassword), YesNoKeyProvide.YES);
		user.setByLdap(YesNoKeyProvide.YES);
    	return user;
    }
    
    private UserDetails loadFromDB(String username) throws UsernameNotFoundException {
        TbAccount accObj = new TbAccount();
        accObj.setAccount(username);
        DefaultResult<TbAccount> result = null;
        try {
            result = this.accountService.selectByUniqueKey(accObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == result) {
        	throw new UsernameNotFoundException("loadFromDB operation failed");
        }
        if (result.getValue() == null) {
        	throw new UsernameNotFoundException( result.getMessage() );
        }
        accObj = result.getValue();
        if (!YesNoKeyProvide.YES.equals(accObj.getOnJob())) {
        	throw new UsernameNotFoundException("auth fail!");
        }  	
        return new User(accObj.getAccount(), accObj.getPassword(), accObj.getOnJob());
    }
    
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbAccount.java`

- Purpose: Persistence entity or model; declares class TbAccount; has 12 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbAccount extends TbAccountKey`
- Key annotations: `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L20 `public String getPassword()`
  - L24 `public void setPassword(String password)`
  - L28 `public String getOnJob()`
  - L32 `public void setOnJob(String onJob)`
  - L37 `public String getCuserid()`
  - L41 `public void setCuserid(String cuserid)`
  - L46 `public Date getCdate()`
  - L50 `public void setCdate(Date cdate)`
  - L55 `public String getUuserid()`
  - L59 `public void setUuserid(String uuserid)`
  - L64 `public Date getUdate()`
  - L68 `public void setUdate(Date udate)`
- Main fields:
  - L11 `long serialVersionUID`
  - L13 `String password`
  - L14 `String onJob`
  - L15 `String cuserid`
  - L16 `Date cdate`
  - L17 `String uuserid`
  - L18 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbAccount.java`
- Size: 1422 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbAccount extends TbAccountKey {
	private static final long serialVersionUID = -6111024743015139968L;
	
	private String password;
	private String onJob;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getOnJob() {
		return onJob;
	}
	
	public void setOnJob(String onJob) {
		this.onJob = onJob;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbAccountKey.java`

- Purpose: Persistence entity or model; declares class TbAccountKey; has 4 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbAccountKey implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`
- Local dependencies: `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`
- Main methods:
  - L13 `public String getOid()`
  - L17 `public void setOid(String oid)`
  - L22 `public String getAccount()`
  - L26 `public void setAccount(String account)`
- Main fields:
  - L7 `long serialVersionUID`
  - L9 `String oid`
  - L10 `String account`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbAccountKey.java`
- Size: 610 bytes

#### Source

````java
package org.qifu.core.entity;

import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;

public class TbAccountKey implements java.io.Serializable {
	private static final long serialVersionUID = 5943857183417718509L;
	
	private String oid;
	private String account;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "account")
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbRole.java`

- Purpose: Persistence entity or model; declares class TbRole; has 16 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbRole implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L26 `public String getOid()`
  - L30 `public void setOid(String oid)`
  - L35 `public String getRole()`
  - L39 `public void setRole(String role)`
  - L43 `public String getDescription()`
  - L47 `public void setDescription(String description)`
  - L52 `public String getCuserid()`
  - L56 `public void setCuserid(String cuserid)`
  - L61 `public Date getCdate()`
  - L65 `public void setCdate(Date cdate)`
  - L70 `public String getUuserid()`
  - L74 `public void setUuserid(String uuserid)`
  - L79 `public Date getUdate()`
  - L83 `public void setUdate(Date udate)`
  - L87 `public String getFromRoleOid()`
  - L91 `public void setFromRoleOid(String fromRoleOid)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String role`
  - L17 `String description`
  - L18 `String cuserid`
  - L19 `Date cdate`
  - L20 `String uuserid`
  - L21 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbRole.java`
- Size: 1951 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbRole implements java.io.Serializable {
	private static final long serialVersionUID = -7550308927111896713L;
	
	private String oid;
	private String role;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	private String fromRoleOid; // copy role 功能, 當傳參數值用
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "role")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}

	public String getFromRoleOid() {
		return fromRoleOid;
	}

	public void setFromRoleOid(String fromRoleOid) {
		this.fromRoleOid = fromRoleOid;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbRolePermission.java`

- Purpose: Persistence entity or model; declares class TbRolePermission; has 18 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbRolePermission implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L26 `public String getOid()`
  - L30 `public void setOid(String oid)`
  - L35 `public String getRole()`
  - L39 `public void setRole(String role)`
  - L44 `public String getPermission()`
  - L48 `public void setPermission(String permission)`
  - L52 `public String getPermType()`
  - L56 `public void setPermType(String permType)`
  - L60 `public String getDescription()`
  - L64 `public void setDescription(String description)`
  - L69 `public String getCuserid()`
  - L73 `public void setCuserid(String cuserid)`
  - L78 `public Date getCdate()`
  - L82 `public void setCdate(Date cdate)`
  - L87 `public String getUuserid()`
  - L91 `public void setUuserid(String uuserid)`
  - L96 `public Date getUdate()`
  - L100 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String role`
  - L17 `String permission`
  - L18 `String permType`
  - L19 `String description`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbRolePermission.java`
- Size: 2112 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbRolePermission implements java.io.Serializable {
	private static final long serialVersionUID = 1812183578931128351L;
	
	private String oid;
	private String role;
	private String permission;
	private String permType;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "role")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@EntityUK(name = "permission")
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public String getPermType() {
		return permType;
	}
	
	public void setPermType(String permType) {
		this.permType = permType;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSys.java`

- Purpose: Persistence entity or model; declares class TbSys; has 22 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSys implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L28 `public String getOid()`
  - L32 `public void setOid(String oid)`
  - L37 `public String getSysId()`
  - L41 `public void setSysId(String sysId)`
  - L45 `public String getName()`
  - L49 `public void setName(String name)`
  - L53 `public String getHost()`
  - L57 `public void setHost(String host)`
  - L61 `public String getContextPath()`
  - L65 `public void setContextPath(String contextPath)`
  - L69 `public String getIsLocal()`
  - L73 `public void setIsLocal(String isLocal)`
  - L77 `public String getIcon()`
  - L81 `public void setIcon(String icon)`
  - L86 `public String getCuserid()`
  - L90 `public void setCuserid(String cuserid)`
  - L95 `public Date getCdate()`
  - L99 `public void setCdate(Date cdate)`
  - L104 `public String getUuserid()`
  - L108 `public void setUuserid(String uuserid)`
  - L113 `public Date getUdate()`
  - L117 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String sysId`
  - L17 `String name`
  - L18 `String host`
  - L19 `String contextPath`
  - L20 `String isLocal`
  - L21 `String icon`
  - L22 `String cuserid`
  - L23 `Date cdate`
  - L24 `String uuserid`
  - L25 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSys.java`
- Size: 2306 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSys implements java.io.Serializable {
	private static final long serialVersionUID = -2582579499622971172L;
	
	private String oid;
	private String sysId;
	private String name;
	private String host;
	private String contextPath;
	private String isLocal;
	private String icon;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "sysId")
	public String getSysId() {
		return sysId;
	}
	
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getContextPath() {
		return contextPath;
	}
	
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	
	public String getIsLocal() {
		return isLocal;
	}
	
	public void setIsLocal(String isLocal) {
		this.isLocal = isLocal;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelp.java`

- Purpose: Persistence entity or model; declares class TbSysBeanHelp; has 20 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysBeanHelp implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L27 `public String getOid()`
  - L31 `public void setOid(String oid)`
  - L36 `public String getBeanId()`
  - L40 `public void setBeanId(String beanId)`
  - L45 `public String getMethod()`
  - L49 `public void setMethod(String method)`
  - L54 `public String getSystem()`
  - L58 `public void setSystem(String system)`
  - L62 `public String getEnableFlag()`
  - L66 `public void setEnableFlag(String enableFlag)`
  - L70 `public String getDescription()`
  - L74 `public void setDescription(String description)`
  - L79 `public String getCuserid()`
  - L83 `public void setCuserid(String cuserid)`
  - L88 `public Date getCdate()`
  - L92 `public void setCdate(Date cdate)`
  - L97 `public String getUuserid()`
  - L101 `public void setUuserid(String uuserid)`
  - L106 `public Date getUdate()`
  - L110 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String beanId`
  - L17 `String method`
  - L18 `String system`
  - L19 `String enableFlag`
  - L20 `String description`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysBeanHelp.java`
- Size: 2290 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysBeanHelp implements java.io.Serializable {
	private static final long serialVersionUID = -1286694972801269610L;
	
	private String oid;
	private String beanId;
	private String method;
	private String system;
	private String enableFlag;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "beanId")
	public String getBeanId() {
		return beanId;
	}
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	@EntityUK(name = "method")
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	@EntityUK(name = "system")
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String getEnableFlag() {
		return enableFlag;
	}
	
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelpExpr.java`

- Purpose: Persistence entity or model; declares class TbSysBeanHelpExpr; has 18 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysBeanHelpExpr implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L26 `public String getOid()`
  - L30 `public void setOid(String oid)`
  - L35 `public String getHelpOid()`
  - L39 `public void setHelpOid(String helpOid)`
  - L44 `public String getExprId()`
  - L48 `public void setExprId(String exprId)`
  - L52 `public String getExprSeq()`
  - L56 `public void setExprSeq(String exprSeq)`
  - L61 `public String getRunType()`
  - L65 `public void setRunType(String runType)`
  - L70 `public String getCuserid()`
  - L74 `public void setCuserid(String cuserid)`
  - L79 `public Date getCdate()`
  - L83 `public void setCdate(Date cdate)`
  - L88 `public String getUuserid()`
  - L92 `public void setUuserid(String uuserid)`
  - L97 `public Date getUdate()`
  - L101 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String helpOid`
  - L17 `String exprId`
  - L18 `String exprSeq`
  - L19 `String runType`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysBeanHelpExpr.java`
- Size: 2101 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysBeanHelpExpr implements java.io.Serializable {
	private static final long serialVersionUID = -4857192361640044013L;
	
	private String oid;
	private String helpOid;
	private String exprId;
	private String exprSeq;
	private String runType;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "helpOid")
	public String getHelpOid() {
		return helpOid;
	}
	
	public void setHelpOid(String helpOid) {
		this.helpOid = helpOid;
	}
	
	@EntityUK(name = "exprId")
	public String getExprId() {
		return exprId;
	}
	
	public void setExprId(String exprId) {
		this.exprId = exprId;
	}
	
	public String getExprSeq() {
		return exprSeq;
	}
	
	public void setExprSeq(String exprSeq) {
		this.exprSeq = exprSeq;
	}
	
	@EntityUK(name = "runType")
	public String getRunType() {
		return runType;
	}
	
	public void setRunType(String runType) {
		this.runType = runType;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysBeanHelpExprMap.java`

- Purpose: Persistence entity or model; declares class TbSysBeanHelpExprMap; has 20 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysBeanHelpExprMap implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L27 `public String getOid()`
  - L31 `public void setOid(String oid)`
  - L36 `public String getHelpExprOid()`
  - L40 `public void setHelpExprOid(String helpExprOid)`
  - L44 `public String getMethodResultFlag()`
  - L48 `public void setMethodResultFlag(String methodResultFlag)`
  - L52 `public String getMethodParamClass()`
  - L56 `public void setMethodParamClass(String methodParamClass)`
  - L60 `public Integer getMethodParamIndex()`
  - L64 `public void setMethodParamIndex(Integer methodParamIndex)`
  - L69 `public String getVarName()`
  - L73 `public void setVarName(String varName)`
  - L78 `public String getCuserid()`
  - L82 `public void setCuserid(String cuserid)`
  - L87 `public Date getCdate()`
  - L91 `public void setCdate(Date cdate)`
  - L96 `public String getUuserid()`
  - L100 `public void setUuserid(String uuserid)`
  - L105 `public Date getUdate()`
  - L109 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String helpExprOid`
  - L17 `String methodResultFlag`
  - L18 `String methodParamClass`
  - L19 `Integer methodParamIndex`
  - L20 `String varName`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysBeanHelpExprMap.java`
- Size: 2466 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysBeanHelpExprMap implements java.io.Serializable {
	private static final long serialVersionUID = -6097063690459430189L;
	
	private String oid;
	private String helpExprOid;
	private String methodResultFlag;
	private String methodParamClass;
	private Integer methodParamIndex;
	private String varName;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "helpExprOid")
	public String getHelpExprOid() {
		return helpExprOid;
	}
	
	public void setHelpExprOid(String helpExprOid) {
		this.helpExprOid = helpExprOid;
	}
	
	public String getMethodResultFlag() {
		return methodResultFlag;
	}
	
	public void setMethodResultFlag(String methodResultFlag) {
		this.methodResultFlag = methodResultFlag;
	}
	
	public String getMethodParamClass() {
		return methodParamClass;
	}
	
	public void setMethodParamClass(String methodParamClass) {
		this.methodParamClass = methodParamClass;
	}
	
	public Integer getMethodParamIndex() {
		return methodParamIndex;
	}
	
	public void setMethodParamIndex(Integer methodParamIndex) {
		this.methodParamIndex = methodParamIndex;
	}
	
	@EntityUK(name = "varName")
	public String getVarName() {
		return varName;
	}
	
	public void setVarName(String varName) {
		this.varName = varName;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysCode.java`

- Purpose: Persistence entity or model; declares class TbSysCode; has 26 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysCode implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L30 `public String getOid()`
  - L34 `public void setOid(String oid)`
  - L39 `public String getCode()`
  - L43 `public void setCode(String code)`
  - L47 `public String getType()`
  - L51 `public void setType(String type)`
  - L55 `public String getName()`
  - L59 `public void setName(String name)`
  - L63 `public String getParam1()`
  - L67 `public void setParam1(String param1)`
  - L71 `public String getParam2()`
  - L75 `public void setParam2(String param2)`
  - L79 `public String getParam3()`
  - L83 `public void setParam3(String param3)`
  - L87 `public String getParam4()`
  - L91 `public void setParam4(String param4)`
  - L95 `public String getParam5()`
  - L99 `public void setParam5(String param5)`
  - L104 `public String getCuserid()`
  - L108 `public void setCuserid(String cuserid)`
  - L113 `public Date getCdate()`
  - L117 `public void setCdate(Date cdate)`
  - L122 `public String getUuserid()`
  - L126 `public void setUuserid(String uuserid)`
  - L131 `public Date getUdate()`
  - L135 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String code`
  - L17 `String type`
  - L18 `String name`
  - L19 `String param1`
  - L20 `String param2`
  - L21 `String param3`
  - L22 `String param4`
  - L23 `String param5`
  - L24 `String cuserid`
  - L25 `Date cdate`
  - L26 `String uuserid`
  - L27 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysCode.java`
- Size: 2579 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysCode implements java.io.Serializable {
	private static final long serialVersionUID = 3286831622624752995L;
	
	private String oid;
	private String code;
	private String type;
	private String name;
	private String param1;
	private String param2;
	private String param3;
	private String param4;
	private String param5;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "code")
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParam1() {
		return param1;
	}
	
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	
	public String getParam2() {
		return param2;
	}
	
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	
	public String getParam3() {
		return param3;
	}
	
	public void setParam3(String param3) {
		this.param3 = param3;
	}
	
	public String getParam4() {
		return param4;
	}
	
	public void setParam4(String param4) {
		this.param4 = param4;
	}
	
	public String getParam5() {
		return param5;
	}
	
	public void setParam5(String param5) {
		this.param5 = param5;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysEventLog.java`

- Purpose: Persistence entity or model; declares class TbSysEventLog; has 19 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysEventLog implements java.io.Serializable`
- Key annotations: `EntityPK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`, `org.qifu.util.SimpleUtils`
- Main methods:
  - L26 `public String getCdateString()`
  - L31 `public String getOid()`
  - L35 `public void setOid(String oid)`
  - L39 `public String getUser()`
  - L43 `public void setUser(String user)`
  - L47 `public String getSysId()`
  - L51 `public void setSysId(String sysId)`
  - L55 `public String getExecuteEvent()`
  - L59 `public void setExecuteEvent(String executeEvent)`
  - L63 `public String getIsPermit()`
  - L67 `public void setIsPermit(String isPermit)`
  - L72 `public String getCuserid()`
  - L76 `public void setCuserid(String cuserid)`
  - L81 `public Date getCdate()`
  - L85 `public void setCdate(Date cdate)`
  - L90 `public String getUuserid()`
  - L94 `public void setUuserid(String uuserid)`
  - L99 `public Date getUdate()`
  - L103 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String user`
  - L17 `String sysId`
  - L18 `String executeEvent`
  - L19 `String isPermit`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysEventLog.java`
- Size: 2154 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;
import org.qifu.util.SimpleUtils;

public class TbSysEventLog implements java.io.Serializable {
	private static final long serialVersionUID = 3155402228651343287L;
	
	private String oid;
	private String user;
	private String sysId;
	private String executeEvent;
	private String isPermit;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	/* for query grid show */
	public String getCdateString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.cdate);
	}	
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getSysId() {
		return sysId;
	}
	
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	
	public String getExecuteEvent() {
		return executeEvent;
	}
	
	public void setExecuteEvent(String executeEvent) {
		this.executeEvent = executeEvent;
	}
	
	public String getIsPermit() {
		return isPermit;
	}
	
	public void setIsPermit(String isPermit) {
		this.isPermit = isPermit;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysExpression.java`

- Purpose: Persistence entity or model; declares class TbSysExpression; has 20 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysExpression implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L27 `public String getOid()`
  - L31 `public void setOid(String oid)`
  - L36 `public String getExprId()`
  - L40 `public void setExprId(String exprId)`
  - L44 `public String getType()`
  - L48 `public void setType(String type)`
  - L52 `public String getName()`
  - L56 `public void setName(String name)`
  - L60 `public String getContent()`
  - L64 `public void setContent(String content)`
  - L68 `public String getDescription()`
  - L72 `public void setDescription(String description)`
  - L77 `public String getCuserid()`
  - L81 `public void setCuserid(String cuserid)`
  - L86 `public Date getCdate()`
  - L90 `public void setCdate(Date cdate)`
  - L95 `public String getUuserid()`
  - L99 `public void setUuserid(String uuserid)`
  - L104 `public Date getUdate()`
  - L108 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String exprId`
  - L17 `String type`
  - L18 `String name`
  - L19 `String content`
  - L20 `String description`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysExpression.java`
- Size: 2184 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysExpression implements java.io.Serializable {
	private static final long serialVersionUID = 4688539226430461746L;
	
	private String oid;
	private String exprId;
	private String type;
	private String name;
	private String content;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "exprId")
	public String getExprId() {
		return exprId;
	}
	
	public void setExprId(String exprId) {
		this.exprId = exprId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysExprJob.java`

- Purpose: Persistence entity or model; declares class TbSysExprJob; has 37 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysExprJob implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L36 `public String getRunDatetime()`
  - L45 `public String getOid()`
  - L49 `public void setOid(String oid)`
  - L53 `public String getSystem()`
  - L57 `public void setSystem(String system)`
  - L62 `public String getId()`
  - L66 `public void setId(String id)`
  - L70 `public String getName()`
  - L74 `public void setName(String name)`
  - L78 `public String getActive()`
  - L82 `public void setActive(String active)`
  - L86 `public String getDescription()`
  - L90 `public void setDescription(String description)`
  - L94 `public String getRunStatus()`
  - L98 `public void setRunStatus(String runStatus)`
  - L102 `public String getCheckFault()`
  - L106 `public void setCheckFault(String checkFault)`
  - L110 `public String getExprId()`
  - L114 `public void setExprId(String exprId)`
  - L118 `public String getRunDayOfWeek()`
  - L122 `public void setRunDayOfWeek(String runDayOfWeek)`
  - L126 `public String getRunHour()`
  - L130 `public void setRunHour(String runHour)`
  - L134 `public String getRunMinute()`
  - L138 `public void setRunMinute(String runMinute)`
  - L142 `public String getContactMode()`
  - L146 `public void setContactMode(String contactMode)`
  - L150 `public String getContact()`
  - L154 `public void setContact(String contact)`
  - L159 `public String getCuserid()`
  - L163 `public void setCuserid(String cuserid)`
  - L168 `public Date getCdate()`
  - L172 `public void setCdate(Date cdate)`
  - L177 `public String getUuserid()`
  - L181 `public void setUuserid(String uuserid)`
  - L186 `public Date getUdate()`
  - L190 `public void setUdate(Date udate)`
- Main fields:
  - L14 `long serialVersionUID`
  - L16 `String oid`
  - L17 `String system`
  - L18 `String id`
  - L19 `String name`
  - L20 `String active`
  - L21 `String description`
  - L22 `String runStatus`
  - L23 `String checkFault`
  - L24 `String exprId`
  - L25 `String runDayOfWeek`
  - L26 `String runHour`
  - L27 `String runMinute`
  - L28 `String contactMode`
  - L29 `String contact`
  - L30 `String cuserid`
  - L31 `Date cdate`
  - L32 `String uuserid`
  - L33 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysExprJob.java`
- Size: 4013 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysExprJob implements java.io.Serializable {
	private static final long serialVersionUID = -3250939070255018399L;
	
	private String oid;
	private String system;
	private String id;
	private String name;
	private String active;
	private String description;
	private String runStatus;
	private String checkFault;
	private String exprId;
	private String runDayOfWeek;
	private String runHour;
	private String runMinute;
	private String contactMode;
	private String contact;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	// 查詢Grid 顯示用
	public String getRunDatetime() {
		return StringUtils.defaultString(this.runDayOfWeek) 
				+ ( (!StringUtils.isBlank(this.runDayOfWeek) && !StringUtils.isBlank(this.runHour)) ? "/" : "" ) 
				+ StringUtils.defaultString(this.runHour) 
				+ ( (!StringUtils.isBlank(this.runHour) && !StringUtils.isBlank(this.runMinute)) ? "/" : "" )
				+ StringUtils.defaultString(this.runMinute);
	}	
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	@EntityUK(name = "id")
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getActive() {
		return active;
	}
	
	public void setActive(String active) {
		this.active = active;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getRunStatus() {
		return runStatus;
	}
	
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}
	
	public String getCheckFault() {
		return checkFault;
	}
	
	public void setCheckFault(String checkFault) {
		this.checkFault = checkFault;
	}
	
	public String getExprId() {
		return exprId;
	}
	
	public void setExprId(String exprId) {
		this.exprId = exprId;
	}
	
	public String getRunDayOfWeek() {
		return runDayOfWeek;
	}
	
	public void setRunDayOfWeek(String runDayOfWeek) {
		this.runDayOfWeek = runDayOfWeek;
	}
	
	public String getRunHour() {
		return runHour;
	}
	
	public void setRunHour(String runHour) {
		this.runHour = runHour;
	}
	
	public String getRunMinute() {
		return runMinute;
	}
	
	public void setRunMinute(String runMinute) {
		this.runMinute = runMinute;
	}
	
	public String getContactMode() {
		return contactMode;
	}
	
	public void setContactMode(String contactMode) {
		this.contactMode = contactMode;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysExprJobLog.java`

- Purpose: Persistence entity or model; declares class TbSysExprJobLog; has 22 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysExprJobLog implements java.io.Serializable`
- Key annotations: `EntityPK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`, `org.qifu.util.SimpleUtils`
- Main methods:
  - L27 `public String getBeginDatetimeString()`
  - L32 `public String getEndDatetimeString()`
  - L37 `public String getOid()`
  - L41 `public void setOid(String oid)`
  - L45 `public String getId()`
  - L49 `public void setId(String id)`
  - L53 `public String getLogStatus()`
  - L57 `public void setLogStatus(String logStatus)`
  - L61 `public Date getBeginDatetime()`
  - L65 `public void setBeginDatetime(Date beginDatetime)`
  - L69 `public Date getEndDatetime()`
  - L73 `public void setEndDatetime(Date endDatetime)`
  - L77 `public String getFaultMsg()`
  - L81 `public void setFaultMsg(String faultMsg)`
  - L86 `public String getCuserid()`
  - L90 `public void setCuserid(String cuserid)`
  - L95 `public Date getCdate()`
  - L99 `public void setCdate(Date cdate)`
  - L104 `public String getUuserid()`
  - L108 `public void setUuserid(String uuserid)`
  - L113 `public Date getUdate()`
  - L117 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String id`
  - L17 `String logStatus`
  - L18 `Date beginDatetime`
  - L19 `Date endDatetime`
  - L20 `String faultMsg`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysExprJobLog.java`
- Size: 2518 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;
import org.qifu.util.SimpleUtils;

public class TbSysExprJobLog implements java.io.Serializable {
	private static final long serialVersionUID = -8972374676604198929L;
	
	private String oid;
	private String id;
	private String logStatus;
	private Date beginDatetime;
	private Date endDatetime;
	private String faultMsg;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	/* for query Grid show */
	public String getBeginDatetimeString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.beginDatetime);
	}	
	
	/* for query Grid show */
	public String getEndDatetimeString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.endDatetime);
	}	
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLogStatus() {
		return logStatus;
	}
	
	public void setLogStatus(String logStatus) {
		this.logStatus = logStatus;
	}
	
	public Date getBeginDatetime() {
		return beginDatetime;
	}
	
	public void setBeginDatetime(Date beginDatetime) {
		this.beginDatetime = beginDatetime;
	}
	
	public Date getEndDatetime() {
		return endDatetime;
	}
	
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}
	
	public String getFaultMsg() {
		return faultMsg;
	}
	
	public void setFaultMsg(String faultMsg) {
		this.faultMsg = faultMsg;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysIcon.java`

- Purpose: Persistence entity or model; declares class TbSysIcon; has 14 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysIcon implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L24 `public String getOid()`
  - L28 `public void setOid(String oid)`
  - L33 `public String getIconId()`
  - L37 `public void setIconId(String iconId)`
  - L41 `public String getFileName()`
  - L45 `public void setFileName(String fileName)`
  - L50 `public String getCuserid()`
  - L54 `public void setCuserid(String cuserid)`
  - L59 `public Date getCdate()`
  - L63 `public void setCdate(Date cdate)`
  - L68 `public String getUuserid()`
  - L72 `public void setUuserid(String uuserid)`
  - L77 `public Date getUdate()`
  - L81 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String iconId`
  - L17 `String fileName`
  - L18 `String cuserid`
  - L19 `Date cdate`
  - L20 `String uuserid`
  - L21 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysIcon.java`
- Size: 1719 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysIcon implements java.io.Serializable {
	private static final long serialVersionUID = 4851384099525054862L;
	
	private String oid;
	private String iconId;
	private String fileName;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "iconId")
	public String getIconId() {
		return iconId;
	}
	
	public void setIconId(String iconId) {
		this.iconId = iconId;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysJreport.java`

- Purpose: Persistence entity or model; declares class TbSysJreport; has 22 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysJreport implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L29 `public String getOid()`
  - L33 `public void setOid(String oid)`
  - L38 `public String getReportId()`
  - L42 `public void setReportId(String reportId)`
  - L46 `public String getFile()`
  - L50 `public void setFile(String file)`
  - L54 `public String getIsCompile()`
  - L58 `public void setIsCompile(String isCompile)`
  - L62 `public byte[] getContent()`
  - L66 `public void setContent(byte[] content)`
  - L70 `public String getDescription()`
  - L74 `public void setDescription(String description)`
  - L79 `public String getCuserid()`
  - L83 `public void setCuserid(String cuserid)`
  - L88 `public Date getCdate()`
  - L92 `public void setCdate(Date cdate)`
  - L97 `public String getUuserid()`
  - L101 `public void setUuserid(String uuserid)`
  - L106 `public Date getUdate()`
  - L110 `public void setUdate(Date udate)`
  - L114 `public String getUploadBase64()`
  - L118 `public void setUploadBase64(String uploadBase64)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String reportId`
  - L17 `String file`
  - L18 `String isCompile`
  - L19 `byte[] content`
  - L20 `String description`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
  - L26 `String uploadBase64`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysJreport.java`
- Size: 2432 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysJreport implements java.io.Serializable {
	private static final long serialVersionUID = -7017671423905196440L;
	
	private String oid;
	private String reportId;
	private String file;
	private String isCompile;
	private byte[] content;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	private String uploadBase64;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "reportId")
	public String getReportId() {
		return reportId;
	}
	
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
	public String getFile() {
		return file;
	}
	
	public void setFile(String file) {
		this.file = file;
	}
	
	public String getIsCompile() {
		return isCompile;
	}
	
	public void setIsCompile(String isCompile) {
		this.isCompile = isCompile;
	}
	
	public byte[] getContent() {
		return content;
	}
	
	public void setContent(byte[] content) {
		this.content = content;
	}		
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}

	public String getUploadBase64() {
		return uploadBase64;
	}

	public void setUploadBase64(String uploadBase64) {
		this.uploadBase64 = uploadBase64;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysJreportParam.java`

- Purpose: Persistence entity or model; declares class TbSysJreportParam; has 16 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysJreportParam implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L25 `public String getOid()`
  - L29 `public void setOid(String oid)`
  - L34 `public String getReportId()`
  - L38 `public void setReportId(String reportId)`
  - L42 `public String getUrlParam()`
  - L46 `public void setUrlParam(String urlParam)`
  - L51 `public String getRptParam()`
  - L55 `public void setRptParam(String rptParam)`
  - L60 `public String getCuserid()`
  - L64 `public void setCuserid(String cuserid)`
  - L69 `public Date getCdate()`
  - L73 `public void setCdate(Date cdate)`
  - L78 `public String getUuserid()`
  - L82 `public void setUuserid(String uuserid)`
  - L87 `public Date getUdate()`
  - L91 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String reportId`
  - L17 `String urlParam`
  - L18 `String rptParam`
  - L19 `String cuserid`
  - L20 `Date cdate`
  - L21 `String uuserid`
  - L22 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysJreportParam.java`
- Size: 1943 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysJreportParam implements java.io.Serializable {
	private static final long serialVersionUID = 3958361031577724660L;
	
	private String oid;
	private String reportId;
	private String urlParam;
	private String rptParam;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "reportId")
	public String getReportId() {
		return reportId;
	}
	
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
	public String getUrlParam() {
		return urlParam;
	}
	
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}
	
	@EntityUK(name = "rptParam")
	public String getRptParam() {
		return rptParam;
	}
	
	public void setRptParam(String rptParam) {
		this.rptParam = rptParam;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysLoginLog.java`

- Purpose: Persistence entity or model; declares class TbSysLoginLog; has 15 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysLoginLog implements java.io.Serializable`
- Key annotations: `EntityPK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`, `org.qifu.util.SimpleUtils`
- Main methods:
  - L24 `public String getCdateString()`
  - L29 `public String getOid()`
  - L33 `public void setOid(String oid)`
  - L37 `public String getUser()`
  - L41 `public void setUser(String user)`
  - L46 `public String getCuserid()`
  - L50 `public void setCuserid(String cuserid)`
  - L55 `public Date getCdate()`
  - L59 `public void setCdate(Date cdate)`
  - L63 `public String getFailFlag()`
  - L67 `public void setFailFlag(String failFlag)`
  - L72 `public String getUuserid()`
  - L76 `public void setUuserid(String uuserid)`
  - L81 `public Date getUdate()`
  - L85 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String user`
  - L17 `String cuserid`
  - L18 `Date cdate`
  - L19 `String uuserid`
  - L20 `Date udate`
  - L21 `String failFlag`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysLoginLog.java`
- Size: 1812 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;
import org.qifu.util.SimpleUtils;

public class TbSysLoginLog implements java.io.Serializable {
	private static final long serialVersionUID = -4553084549906639411L;
	
	private String oid;
	private String user;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	private String failFlag;
	
	/* for query grid show */
	public String getCdateString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.cdate);
	}	
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	public String getFailFlag() {
		return failFlag;
	}

	public void setFailFlag(String failFlag) {
		this.failFlag = failFlag;
	}

	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysMailHelper.java`

- Purpose: Persistence entity or model; declares class TbSysMailHelper; has 30 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysMailHelper implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L32 `public String getOid()`
  - L36 `public void setOid(String oid)`
  - L41 `public String getMailId()`
  - L45 `public void setMailId(String mailId)`
  - L49 `public String getSubject()`
  - L53 `public void setSubject(String subject)`
  - L57 `public byte[] getText()`
  - L61 `public void setText(byte[] text)`
  - L65 `public String getMailFrom()`
  - L69 `public void setMailFrom(String mailFrom)`
  - L73 `public String getMailTo()`
  - L77 `public void setMailTo(String mailTo)`
  - L81 `public String getMailCc()`
  - L85 `public void setMailCc(String mailCc)`
  - L89 `public String getMailBcc()`
  - L93 `public void setMailBcc(String mailBcc)`
  - L97 `public String getSuccessFlag()`
  - L101 `public void setSuccessFlag(String successFlag)`
  - L105 `public Date getSuccessTime()`
  - L109 `public void setSuccessTime(Date successTime)`
  - L113 `public String getRetainFlag()`
  - L117 `public void setRetainFlag(String retainFlag)`
  - L122 `public String getCuserid()`
  - L126 `public void setCuserid(String cuserid)`
  - L131 `public Date getCdate()`
  - L135 `public void setCdate(Date cdate)`
  - L140 `public String getUuserid()`
  - L144 `public void setUuserid(String uuserid)`
  - L149 `public Date getUdate()`
  - L153 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String mailId`
  - L17 `String subject`
  - L18 `byte[] text`
  - L19 `String mailFrom`
  - L20 `String mailTo`
  - L21 `String mailCc`
  - L22 `String mailBcc`
  - L23 `String successFlag`
  - L24 `Date successTime`
  - L25 `String retainFlag`
  - L26 `String cuserid`
  - L27 `Date cdate`
  - L28 `String uuserid`
  - L29 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysMailHelper.java`
- Size: 3041 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysMailHelper implements java.io.Serializable {
	private static final long serialVersionUID = 830954774590698208L;
	
	private String oid;
	private String mailId;
	private String subject;
	private byte[] text;
	private String mailFrom;
	private String mailTo;
	private String mailCc;
	private String mailBcc;
	private String successFlag;
	private Date successTime;
	private String retainFlag;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "mailId")
	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public byte[] getText() {
		return text;
	}
	
	public void setText(byte[] text) {
		this.text = text;
	}	
	
	public String getMailFrom() {
		return mailFrom;
	}
	
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	
	public String getMailTo() {
		return mailTo;
	}
	
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	
	public String getMailCc() {
		return mailCc;
	}
	
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}
	
	public String getMailBcc() {
		return mailBcc;
	}
	
	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}
	
	public String getSuccessFlag() {
		return successFlag;
	}
	
	public void setSuccessFlag(String successFlag) {
		this.successFlag = successFlag;
	}
	
	public Date getSuccessTime() {
		return successTime;
	}
	
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}
	
	public String getRetainFlag() {
		return retainFlag;
	}
	
	public void setRetainFlag(String retainFlag) {
		this.retainFlag = retainFlag;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysMenu.java`

- Purpose: Persistence entity or model; declares class TbSysMenu; has 16 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysMenu implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L25 `public String getOid()`
  - L29 `public void setOid(String oid)`
  - L34 `public String getProgId()`
  - L38 `public void setProgId(String progId)`
  - L43 `public String getParentOid()`
  - L47 `public void setParentOid(String parentOid)`
  - L51 `public String getEnableFlag()`
  - L55 `public void setEnableFlag(String enableFlag)`
  - L60 `public String getCuserid()`
  - L64 `public void setCuserid(String cuserid)`
  - L69 `public Date getCdate()`
  - L73 `public void setCdate(Date cdate)`
  - L78 `public String getUuserid()`
  - L82 `public void setUuserid(String uuserid)`
  - L87 `public Date getUdate()`
  - L91 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String progId`
  - L17 `String parentOid`
  - L18 `String enableFlag`
  - L19 `String cuserid`
  - L20 `Date cdate`
  - L21 `String uuserid`
  - L22 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysMenu.java`
- Size: 1940 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysMenu implements java.io.Serializable {
	private static final long serialVersionUID = -7256453969483284068L;
	
	private String oid;
	private String progId;
	private String parentOid;
	private String enableFlag;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "progId")
	public String getProgId() {
		return progId;
	}
	
	public void setProgId(String progId) {
		this.progId = progId;
	}
	
	@EntityUK(name = "parentOid")
	public String getParentOid() {
		return parentOid;
	}
	
	public void setParentOid(String parentOid) {
		this.parentOid = parentOid;
	}
	
	public String getEnableFlag() {
		return enableFlag;
	}
	
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysMenuRole.java`

- Purpose: Persistence entity or model; declares class TbSysMenuRole; has 14 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysMenuRole implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L24 `public String getOid()`
  - L28 `public void setOid(String oid)`
  - L33 `public String getProgId()`
  - L37 `public void setProgId(String progId)`
  - L42 `public String getRole()`
  - L46 `public void setRole(String role)`
  - L51 `public String getCuserid()`
  - L55 `public void setCuserid(String cuserid)`
  - L60 `public Date getCdate()`
  - L64 `public void setCdate(Date cdate)`
  - L69 `public String getUuserid()`
  - L73 `public void setUuserid(String uuserid)`
  - L78 `public Date getUdate()`
  - L82 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String progId`
  - L17 `String role`
  - L18 `String cuserid`
  - L19 `Date cdate`
  - L20 `String uuserid`
  - L21 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysMenuRole.java`
- Size: 1721 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysMenuRole implements java.io.Serializable {
	private static final long serialVersionUID = 864326251043399135L;
	
	private String oid;
	private String progId;
	private String role;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "progId")
	public String getProgId() {
		return progId;
	}
	
	public void setProgId(String progId) {
		this.progId = progId;
	}
	
	@EntityUK(name = "role")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysProg.java`

- Purpose: Persistence entity or model; declares class TbSysProg; has 32 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysProg implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L33 `public String getOid()`
  - L37 `public void setOid(String oid)`
  - L42 `public String getProgId()`
  - L46 `public void setProgId(String progId)`
  - L50 `public String getName()`
  - L54 `public void setName(String name)`
  - L58 `public String getUrl()`
  - L62 `public void setUrl(String url)`
  - L66 `public String getEditMode()`
  - L70 `public void setEditMode(String editMode)`
  - L74 `public String getIsDialog()`
  - L78 `public void setIsDialog(String isDialog)`
  - L82 `public Integer getDialogW()`
  - L86 `public void setDialogW(Integer dialogW)`
  - L90 `public Integer getDialogH()`
  - L94 `public void setDialogH(Integer dialogH)`
  - L98 `public String getProgSystem()`
  - L102 `public void setProgSystem(String progSystem)`
  - L106 `public String getItemType()`
  - L110 `public void setItemType(String itemType)`
  - L114 `public String getIcon()`
  - L118 `public void setIcon(String icon)`
  - L122 `public String getFontIconClassId()`
  - L126 `public void setFontIconClassId(String fontIconClassId)`
  - L131 `public String getCuserid()`
  - L135 `public void setCuserid(String cuserid)`
  - L140 `public Date getCdate()`
  - L144 `public void setCdate(Date cdate)`
  - L149 `public String getUuserid()`
  - L153 `public void setUuserid(String uuserid)`
  - L158 `public Date getUdate()`
  - L162 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String progId`
  - L17 `String name`
  - L18 `String url`
  - L19 `String editMode`
  - L20 `String isDialog`
  - L21 `Integer dialogW`
  - L22 `Integer dialogH`
  - L23 `String progSystem`
  - L24 `String itemType`
  - L25 `String icon`
  - L26 `String fontIconClassId`
  - L27 `String cuserid`
  - L28 `Date cdate`
  - L29 `String uuserid`
  - L30 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysProg.java`
- Size: 3184 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysProg implements java.io.Serializable {
	private static final long serialVersionUID = 8801640884943547614L;
	
	private String oid;
	private String progId;
	private String name;
	private String url;
	private String editMode;
	private String isDialog;
	private Integer dialogW;
	private Integer dialogH;
	private String progSystem;
	private String itemType;
	private String icon;
	private String fontIconClassId;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "progId")
	public String getProgId() {
		return progId;
	}
	
	public void setProgId(String progId) {
		this.progId = progId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getEditMode() {
		return editMode;
	}
	
	public void setEditMode(String editMode) {
		this.editMode = editMode;
	}
	
	public String getIsDialog() {
		return isDialog;
	}
	
	public void setIsDialog(String isDialog) {
		this.isDialog = isDialog;
	}
	
	public Integer getDialogW() {
		return dialogW;
	}
	
	public void setDialogW(Integer dialogW) {
		this.dialogW = dialogW;
	}
	
	public Integer getDialogH() {
		return dialogH;
	}
	
	public void setDialogH(Integer dialogH) {
		this.dialogH = dialogH;
	}
	
	public String getProgSystem() {
		return progSystem;
	}
	
	public void setProgSystem(String progSystem) {
		this.progSystem = progSystem;
	}
	
	public String getItemType() {
		return itemType;
	}
	
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getFontIconClassId() {
		return fontIconClassId;
	}

	public void setFontIconClassId(String fontIconClassId) {
		this.fontIconClassId = fontIconClassId;
	}

	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysQfieldLog.java`

- Purpose: Persistence entity or model; declares class TbSysQfieldLog; has 22 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysQfieldLog implements java.io.Serializable`
- Key annotations: `EntityPK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L27 `public String getOid()`
  - L31 `public void setOid(String oid)`
  - L35 `public String getSystem()`
  - L39 `public void setSystem(String system)`
  - L43 `public String getProgId()`
  - L47 `public void setProgId(String progId)`
  - L51 `public String getMethodName()`
  - L55 `public void setMethodName(String methodName)`
  - L59 `public String getFieldName()`
  - L63 `public void setFieldName(String fieldName)`
  - L67 `public String getFieldValue()`
  - L71 `public void setFieldValue(String fieldValue)`
  - L75 `public String getQueryUserId()`
  - L79 `public void setQueryUserId(String queryUserId)`
  - L84 `public String getCuserid()`
  - L88 `public void setCuserid(String cuserid)`
  - L93 `public Date getCdate()`
  - L97 `public void setCdate(Date cdate)`
  - L102 `public String getUuserid()`
  - L106 `public void setUuserid(String uuserid)`
  - L111 `public Date getUdate()`
  - L115 `public void setUdate(Date udate)`
- Main fields:
  - L12 `long serialVersionUID`
  - L14 `String oid`
  - L15 `String system`
  - L16 `String progId`
  - L17 `String methodName`
  - L18 `String fieldName`
  - L19 `String fieldValue`
  - L20 `String queryUserId`
  - L21 `String cuserid`
  - L22 `Date cdate`
  - L23 `String uuserid`
  - L24 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysQfieldLog.java`
- Size: 2367 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysQfieldLog implements java.io.Serializable {
	private static final long serialVersionUID = 1838340064076796001L;
	
	private String oid;
	private String system;
	private String progId;
	private String methodName;
	private String fieldName;
	private String fieldValue;
	private String queryUserId;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String getProgId() {
		return progId;
	}
	
	public void setProgId(String progId) {
		this.progId = progId;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getFieldValue() {
		return fieldValue;
	}
	
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	public String getQueryUserId() {
		return queryUserId;
	}
	
	public void setQueryUserId(String queryUserId) {
		this.queryUserId = queryUserId;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysTemplate.java`

- Purpose: Persistence entity or model; declares class TbSysTemplate; has 18 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysTemplate implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L26 `public String getOid()`
  - L30 `public void setOid(String oid)`
  - L35 `public String getTemplateId()`
  - L39 `public void setTemplateId(String templateId)`
  - L43 `public String getTitle()`
  - L47 `public void setTitle(String title)`
  - L51 `public String getMessage()`
  - L55 `public void setMessage(String message)`
  - L59 `public String getDescription()`
  - L63 `public void setDescription(String description)`
  - L68 `public String getCuserid()`
  - L72 `public void setCuserid(String cuserid)`
  - L77 `public Date getCdate()`
  - L81 `public void setCdate(Date cdate)`
  - L86 `public String getUuserid()`
  - L90 `public void setUuserid(String uuserid)`
  - L95 `public Date getUdate()`
  - L99 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String templateId`
  - L17 `String title`
  - L18 `String message`
  - L19 `String description`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysTemplate.java`
- Size: 2082 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysTemplate implements java.io.Serializable {
	private static final long serialVersionUID = 5160068468504927877L;
	
	private String oid;
	private String templateId;
	private String title;
	private String message;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "templateId")
	public String getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysTemplateParam.java`

- Purpose: Persistence entity or model; declares class TbSysTemplateParam; has 18 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysTemplateParam implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L26 `public String getOid()`
  - L30 `public void setOid(String oid)`
  - L35 `public String getTemplateId()`
  - L39 `public void setTemplateId(String templateId)`
  - L44 `public String getIsTitle()`
  - L48 `public void setIsTitle(String isTitle)`
  - L53 `public String getTemplateVar()`
  - L57 `public void setTemplateVar(String templateVar)`
  - L61 `public String getObjectVar()`
  - L65 `public void setObjectVar(String objectVar)`
  - L70 `public String getCuserid()`
  - L74 `public void setCuserid(String cuserid)`
  - L79 `public Date getCdate()`
  - L83 `public void setCdate(Date cdate)`
  - L88 `public String getUuserid()`
  - L92 `public void setUuserid(String uuserid)`
  - L97 `public Date getUdate()`
  - L101 `public void setUdate(Date udate)`
- Main fields:
  - L13 `long serialVersionUID`
  - L15 `String oid`
  - L16 `String templateId`
  - L17 `String isTitle`
  - L18 `String templateVar`
  - L19 `String objectVar`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysTemplateParam.java`
- Size: 2182 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysTemplateParam implements java.io.Serializable {
	private static final long serialVersionUID = -8665399628955892299L;
	
	private String oid;
	private String templateId;
	private String isTitle;
	private String templateVar;
	private String objectVar;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "templateId")
	public String getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	@EntityUK(name = "isTitle")
	public String getIsTitle() {
		return isTitle;
	}
	
	public void setIsTitle(String isTitle) {
		this.isTitle = isTitle;
	}
	
	@EntityUK(name = "templateVar")
	public String getTemplateVar() {
		return templateVar;
	}
	
	public void setTemplateVar(String templateVar) {
		this.templateVar = templateVar;
	}
	
	public String getObjectVar() {
		return objectVar;
	}
	
	public void setObjectVar(String objectVar) {
		this.objectVar = objectVar;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysToken.java`

- Purpose: Persistence entity or model; declares class TbSysToken; has 16 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysToken implements java.io.Serializable`
- Key annotations: `JsonIgnore`, `Parameter`, `EntityPK`, `CreateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.EntityPK`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `com.fasterxml.jackson.annotation.JsonIgnore`, `io.swagger.v3.oas.annotations.Parameter`
- Main methods:
  - L26 `public String getExpiresDateString()`
  - L29 `public String getRfExpiresDateString()`
  - L32 `public String getCdateString()`
  - L35 `public String getTokenShort()`
  - L43 `public String getOid()`
  - L47 `public void setOid(String oid)`
  - L51 `public String getUserId()`
  - L55 `public void setUserId(String userId)`
  - L60 `public String getToken()`
  - L64 `public void setToken(String token)`
  - L68 `public Date getExpiresDate()`
  - L72 `public void setExpiresDate(Date expiresDate)`
  - L76 `public Date getRfExpiresDate()`
  - L80 `public void setRfExpiresDate(Date rfExpiresDate)`
  - L85 `public Date getCdate()`
  - L89 `public void setCdate(Date cdate)`
- Main fields:
  - L15 `long serialVersionUID`
  - L17 `String oid`
  - L18 `String userId`
  - L22 `Date expiresDate`
  - L23 `Date rfExpiresDate`
  - L24 `Date cdate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysToken.java`
- Size: 2370 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.EntityPK;
import org.qifu.util.SimpleUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.Parameter;

public class TbSysToken implements java.io.Serializable {
	private static final long serialVersionUID = 6649078428128443821L;
	
	private String oid;
    private String userId;
    
    @JsonIgnore
    @Parameter(hidden = true) private String token;
    private Date expiresDate;
    private Date rfExpiresDate;
    private Date cdate;

	public String getExpiresDateString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.expiresDate);
	}	
	public String getRfExpiresDateString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.rfExpiresDate);
	}		
	public String getCdateString() {
		return SimpleUtils.getDateFormatOfyyyyMMddHHmmss(this.cdate);
	}	    
	public String getTokenShort() {
		if (StringUtils.defaultString(this.token).length() >= 30) {
			return this.token.substring(0, 20) + "..." + this.token.substring(this.token.length()-5, this.token.length());
		}
		return token;
	}
    
    @EntityPK(name = "oid", autoUUID = true)
    public String getOid() {
        return oid;
    }
    
    public void setOid(String oid) {
        this.oid = oid;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Parameter(hidden = true)
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public Date getExpiresDate() {
        return expiresDate;
    }
    
    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }
    
    public Date getRfExpiresDate() {
        return rfExpiresDate;
    }
    
    public void setRfExpiresDate(Date rfExpiresDate) {
        this.rfExpiresDate = rfExpiresDate;
    }
    
    @CreateDateField(name = "cdate")
    public Date getCdate() {
        return cdate;
    }
    
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }
    
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysUpload.java`

- Purpose: Persistence entity or model; declares class TbSysUpload; has 24 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysUpload implements java.io.Serializable`
- Key annotations: `EntityPK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L28 `public String getOid()`
  - L32 `public void setOid(String oid)`
  - L36 `public String getSystem()`
  - L40 `public void setSystem(String system)`
  - L44 `public String getSubDir()`
  - L48 `public void setSubDir(String subDir)`
  - L52 `public String getType()`
  - L56 `public void setType(String type)`
  - L60 `public String getFileName()`
  - L64 `public void setFileName(String fileName)`
  - L68 `public String getShowName()`
  - L72 `public void setShowName(String showName)`
  - L76 `public String getIsFile()`
  - L80 `public void setIsFile(String isFile)`
  - L84 `public byte[] getContent()`
  - L88 `public void setContent(byte[] content)`
  - L93 `public String getCuserid()`
  - L97 `public void setCuserid(String cuserid)`
  - L102 `public Date getCdate()`
  - L106 `public void setCdate(Date cdate)`
  - L111 `public String getUuserid()`
  - L115 `public void setUuserid(String uuserid)`
  - L120 `public Date getUdate()`
  - L124 `public void setUdate(Date udate)`
- Main fields:
  - L12 `long serialVersionUID`
  - L14 `String oid`
  - L15 `String system`
  - L16 `String subDir`
  - L17 `String type`
  - L18 `String fileName`
  - L19 `String showName`
  - L20 `String isFile`
  - L21 `byte[] content`
  - L22 `String cuserid`
  - L23 `Date cdate`
  - L24 `String uuserid`
  - L25 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysUpload.java`
- Size: 2427 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysUpload implements java.io.Serializable {
	private static final long serialVersionUID = 4559886755738815004L;
	
	private String oid;
	private String system;
	private String subDir;
	private String type;
	private String fileName;
	private String showName;
	private String isFile;
	private byte[] content;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getSystem() {
		return system;
	}
	
	public void setSystem(String system) {
		this.system = system;
	}
	
	public String getSubDir() {
		return subDir;
	}
	
	public void setSubDir(String subDir) {
		this.subDir = subDir;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getShowName() {
		return showName;
	}
	
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public String getIsFile() {
		return isFile;
	}
	
	public void setIsFile(String isFile) {
		this.isFile = isFile;
	}
	
	public byte[] getContent() {
		return content;
	}
	
	public void setContent(byte[] content) {
		this.content = content;
	}	
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysUsess.java`

- Purpose: Persistence entity or model; declares class TbSysUsess; has 12 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysUsess extends TbSysUsessKey`
- Key annotations: `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L21 `public String getAccount()`
  - L25 `public void setAccount(String account)`
  - L30 `public String getCurrentId()`
  - L34 `public void setCurrentId(String currentId)`
  - L39 `public String getCuserid()`
  - L43 `public void setCuserid(String cuserid)`
  - L48 `public Date getCdate()`
  - L52 `public void setCdate(Date cdate)`
  - L57 `public String getUuserid()`
  - L61 `public void setUuserid(String uuserid)`
  - L66 `public Date getUdate()`
  - L70 `public void setUdate(Date udate)`
- Main fields:
  - L12 `long serialVersionUID`
  - L14 `String account`
  - L15 `String currentId`
  - L16 `String cuserid`
  - L17 `Date cdate`
  - L18 `String uuserid`
  - L19 `Date udate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysUsess.java`
- Size: 1514 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbSysUsess extends TbSysUsessKey {
	private static final long serialVersionUID = 4699630657747152165L;
	
	private String account;
	private String currentId;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	@EntityUK(name = "currentId")
	public String getCurrentId() {
		return currentId;
	}
	
	public void setCurrentId(String currentId) {
		this.currentId = currentId;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbSysUsessKey.java`

- Purpose: Persistence entity or model; declares class TbSysUsessKey; has 4 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbSysUsessKey implements java.io.Serializable`
- Key annotations: `EntityPK`
- Local dependencies: `org.qifu.base.model.EntityPK`
- Main methods:
  - L12 `public String getOid()`
  - L16 `public void setOid(String oid)`
  - L20 `public String getSessionId()`
  - L24 `public void setSessionId(String sessionId)`
- Main fields:
  - L6 `long serialVersionUID`
  - L8 `String oid`
  - L9 `String sessionId`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbSysUsessKey.java`
- Size: 561 bytes

#### Source

````java
package org.qifu.core.entity;

import org.qifu.base.model.EntityPK;

public class TbSysUsessKey implements java.io.Serializable {
	private static final long serialVersionUID = -1487899441465689533L;
	
	private String oid;
	private String sessionId;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/entity/TbUserRole.java`

- Purpose: Persistence entity or model; declares class TbUserRole; has 18 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.entity`
- Role: Persistence entity or model
- Main types: `class TbUserRole implements java.io.Serializable`
- Key annotations: `EntityPK`, `EntityUK`, `CreateUserField`, `CreateDateField`, `UpdateUserField`, `UpdateDateField`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L29 `public String getOid()`
  - L33 `public void setOid(String oid)`
  - L38 `public String getRole()`
  - L42 `public void setRole(String role)`
  - L47 `public String getAccount()`
  - L51 `public void setAccount(String account)`
  - L55 `public String getDescription()`
  - L59 `public void setDescription(String description)`
  - L64 `public String getCuserid()`
  - L68 `public void setCuserid(String cuserid)`
  - L73 `public Date getCdate()`
  - L77 `public void setCdate(Date cdate)`
  - L82 `public String getUuserid()`
  - L86 `public void setUuserid(String uuserid)`
  - L91 `public Date getUdate()`
  - L95 `public void setUdate(Date udate)`
  - L99 `public List<TbRolePermission> getRolePermission()`
  - L103 `public void setRolePermission(List<TbRolePermission> rolePermission)`
- Main fields:
  - L14 `long serialVersionUID`
  - L16 `String oid`
  - L17 `String role`
  - L18 `String account`
  - L19 `String description`
  - L20 `String cuserid`
  - L21 `Date cdate`
  - L22 `String uuserid`
  - L23 `Date udate`
  - L26 `List<TbRolePermission> rolePermission`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\entity\TbUserRole.java`
- Size: 2261 bytes

#### Source

````java
package org.qifu.core.entity;

import java.util.Date;
import java.util.List;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateUserField;

public class TbUserRole implements java.io.Serializable {
	private static final long serialVersionUID = -7339988300440734279L;
	
	private String oid;
	private String role;
	private String account;
	private String description;
	private String cuserid;
	private Date cdate;
	private String uuserid;
	private Date udate;
	
	// for 權限檢核時要用, 準備User登入資料.
	private List<TbRolePermission> rolePermission = null;
	
	@EntityPK(name = "oid", autoUUID = true)
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@EntityUK(name = "role")
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@EntityUK(name = "account")
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@CreateUserField(name = "cuserid")
	public String getCuserid() {
		return cuserid;
	}
	
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	
	@CreateDateField(name = "cdate")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@UpdateUserField(name = "uuserid")
	public String getUuserid() {
		return uuserid;
	}
	
	public void setUuserid(String uuserid) {
		this.uuserid = uuserid;
	}
	
	@UpdateDateField(name = "udate")
	public Date getUdate() {
		return udate;
	}
	
	public void setUdate(Date udate) {
		this.udate = udate;
	}

	public List<TbRolePermission> getRolePermission() {
		return rolePermission;
	}

	public void setRolePermission(List<TbRolePermission> rolePermission) {
		this.rolePermission = rolePermission;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/event/ClearTempUploadEvent.java`

- Purpose: Spring component; declares class ClearTempUploadEvent; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.event`
- Role: Spring component
- Main types: `class ClearTempUploadEvent`
- Key annotations: `Component`, `EventListener`, `Override`
- Local dependencies: `org.qifu.core.util.UploadSupportUtils`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.boot.context.event.ApplicationStartedEvent`, `org.springframework.context.event.EventListener`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L40 `public void afterStartup()`
  - L44 `public void run()`
- Main fields:
  - L37 `Logger logger`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\event\ClearTempUploadEvent.java`
- Size: 1882 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.event;

import java.util.Timer;
import java.util.TimerTask;

import org.qifu.core.util.UploadSupportUtils;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ClearTempUploadEvent {
	protected static Logger logger = LoggerFactory.getLogger(ClearTempUploadEvent.class);
	
	@EventListener(ApplicationStartedEvent.class)
	public void afterStartup() {	
		new Timer().schedule(
				new TimerTask() {
					@Override
					public void run() {
						logger.warn("Clear upload type is TMP data.");
						UserUtils.setUserInfoForUserLocalUtilsBackgroundMode();
						try {
							UploadSupportUtils.cleanTempUpload();
						} catch (Exception e) {
							e.printStackTrace();
						}
						UserUtils.removeForUserLocalUtils();
						logger.info("fine.");
			        }
				}, 30000
		);		
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/event/EndpointPublishApplicationListener.java`

- Purpose: Spring component; declares class EndpointPublishApplicationListener; has 5 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.event`
- Role: Spring component
- Main types: `class EndpointPublishApplicationListener implements ApplicationListener<ContextRefreshedEvent>`
- Key annotations: `Component`, `SuppressWarnings`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.util.LoadResources`
- Spring dependencies: `org.springframework.context.ApplicationListener`, `org.springframework.context.event.ContextRefreshedEvent`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.collections4.CollectionUtils`, `org.apache.commons.collections4.MapUtils`, `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.cxf.Bus`, `org.apache.cxf.jaxrs.JAXRSServerFactoryBean`, `org.apache.cxf.jaxws.EndpointImpl`, `org.apache.cxf.phase.AbstractPhaseInterceptor`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L33 `private Object getBean(ContextRefreshedEvent event, String beanId)`
  - L44 `private Map<String, Object> objectMapperReadValue(String fileRes)`
  - L48 `private String read(String fileRes)`
  - L57 `private void publishCxfEndpoint(ContextRefreshedEvent event)`
  - L127 `public void onApplicationEvent(ContextRefreshedEvent event)`
- Main fields:
  - L28 `Logger log`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\event\EndpointPublishApplicationListener.java`
- Size: 5251 bytes

#### Source

````java
package org.qifu.core.event;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.qifu.base.Constants;
import org.qifu.util.LoadResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/** 載入 endpoint-publish.json 依設定內容部屬 soap 與 jaxrs(rest) */
@Component
public class EndpointPublishApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
	protected Logger log = LoggerFactory.getLogger(getClass()); 
	
	public EndpointPublishApplicationListener() {
	}

	private Object getBean(ContextRefreshedEvent event, String beanId) {
		Object bean = null;
		try {
			bean = event.getApplicationContext().getBean(beanId);
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
		return bean;
	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> objectMapperReadValue(String fileRes) throws IOException {
		return LoadResources.getObjectMapper().readValue(read(fileRes), Map.class);
	}

	private String read(String fileRes) throws IOException {
		String str = "";
		try (InputStream is = EndpointPublishApplicationListener.class.getClassLoader().getResource(fileRes)
				.openStream()) {
			str = IOUtils.toString(is, StandardCharsets.UTF_8);
		}
		return str;
	}

	private void publishCxfEndpoint(ContextRefreshedEvent event) throws IOException {
		Bus bus = event.getApplicationContext().getBean(Bus.class);
		Map<String, Object> configMap = objectMapperReadValue("endpoint-publish.json");

		if (MapUtils.isEmpty(configMap)) {
			return;
		}
		String restAddress = (String) configMap.get("restAddress");
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> endpointsList = (List<Map<String, Object>>) configMap.get("endpoints");
		if (CollectionUtils.isEmpty(endpointsList)) {
			return;
		}
		List<Object> restServiceList = new ArrayList<>();
		for (Map<String, Object> endpointMap : endpointsList) {
			String name = StringUtils.defaultString((String) endpointMap.get("name"));
			String beanId = StringUtils.defaultString((String) endpointMap.get("beanId"));
			String publish = StringUtils.defaultString((String) endpointMap.get("publish"));
			boolean hasRest = (boolean) endpointMap.get("hasRest");
			boolean enable = (boolean) endpointMap.get("enable");
			if (!enable || (StringUtils.isBlank(beanId) || StringUtils.isBlank(name) || StringUtils.isBlank(publish))
					|| (!publish.startsWith(Constants.FORWARD_SLASH) || publish.length() < 2)) {
				continue;
			}
			Object serviceBean = this.getBean(event, beanId);
			if (null != serviceBean) {
				EndpointImpl endpoint = new EndpointImpl(bus, serviceBean);
				@SuppressWarnings("unchecked")
				List<String> inInterceptors = (List<String>) endpointMap.get("inInterceptors");
				@SuppressWarnings("unchecked")
				List<String> outInterceptors = (List<String>) endpointMap.get("outInterceptors");
				this.publishProcess(event, publish, endpoint, inInterceptors, outInterceptors);
				if (hasRest) {
					restServiceList.add(serviceBean);
				}
			}
		}
		if (!CollectionUtils.isEmpty(restServiceList)) {
			JAXRSServerFactoryBean jaxrsBean = new JAXRSServerFactoryBean();
			jaxrsBean.setBus(bus);
			jaxrsBean.setAddress(restAddress);
			jaxrsBean.setServiceBeans(restServiceList);
			jaxrsBean.create();
		}
	}

	private void publishProcess(ContextRefreshedEvent event, String publish, EndpointImpl endpoint,
			List<String> inInterceptors, List<String> outInterceptors) {
		if (!CollectionUtils.isEmpty(inInterceptors)) {
			for (String interceptorBeanId : inInterceptors) {
				Object interceptorBean = this.getBean(event, interceptorBeanId);
				if (interceptorBean != null
						&& interceptorBean instanceof @SuppressWarnings("unused") AbstractPhaseInterceptor<?> pi) {
					endpoint.getInInterceptors().add((AbstractPhaseInterceptor<?>) interceptorBean);
				}
			}
		}
		if (!CollectionUtils.isEmpty(outInterceptors)) {
			for (String interceptorBeanId : outInterceptors) {
				Object interceptorBean = this.getBean(event, interceptorBeanId);
				if (interceptorBean != null
						&& interceptorBean instanceof @SuppressWarnings("unused") AbstractPhaseInterceptor<?> pi) {
					endpoint.getOutInterceptors().add((AbstractPhaseInterceptor<?>) interceptorBean);
				}
			}
		}
		endpoint.publish(publish);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			this.publishCxfEndpoint(event);
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/event/JReportDeployEvent.java`

- Purpose: Spring component; declares class JReportDeployEvent; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.event`
- Role: Spring component
- Main types: `class JReportDeployEvent`
- Key annotations: `Component`, `EventListener`, `Override`
- Local dependencies: `org.qifu.core.util.JReportUtils`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.boot.context.event.ApplicationStartedEvent`, `org.springframework.context.event.EventListener`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L40 `public void afterStartup()`
  - L44 `public void run()`
- Main fields:
  - L37 `Logger logger`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\event\JReportDeployEvent.java`
- Size: 1854 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.event;

import java.util.Timer;
import java.util.TimerTask;

import org.qifu.core.util.JReportUtils;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JReportDeployEvent {
	protected static Logger logger = LoggerFactory.getLogger(JReportDeployEvent.class);
	
	@EventListener(ApplicationStartedEvent.class)
	public void afterStartup() {	
		new Timer().schedule(
				new TimerTask() {
					@Override
					public void run() {
						logger.warn("deploy jreport resource...");
						UserUtils.setUserInfoForUserLocalUtilsBackgroundMode();
						try {
							JReportUtils.deploy();
						} catch (Exception e) {
							e.printStackTrace();
						}
						UserUtils.removeForUserLocalUtils();
						logger.info("fine.");
			        }
				}, 40000
		);		
	}	
	
}
````

### `backend/core/src/main/java/org/qifu/core/interceptor/ControllerAuthorityCheckInterceptor.java`

- Purpose: Java class; declares class ControllerAuthorityCheckInterceptor; has 6 detected methods; depends on 9 org.qifu local types
- Package: `org.qifu.core.interceptor`
- Role: Java class
- Main types: `class ControllerAuthorityCheckInterceptor implements HandlerInterceptor`
- Key annotations: `Resource`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.CoreAppConstants`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`, `org.qifu.core.support.SysEventLogSupport`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.web.method.HandlerMethod`, `org.springframework.web.servlet.HandlerInterceptor`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.Strings`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Injection/config points:
  - L57 `@Resource` -> `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {`
- Main methods:
  - L53 `public BaseInfoConfigProperties getBaseInfoConfigProperties()`
  - L58 `public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties)`
  - L62 `private void log(String userId, String sysId, String url, boolean permit)`
  - L84 `public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)`
  - L142 `private boolean isControllerAuthority(Annotation[] actionMethodAnnotations)`
  - L176 `private boolean isEventLogPage(String url)`
- Main fields:
  - L49 `Logger logger`
  - L51 `BaseInfoConfigProperties baseInfoConfigProperties`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\interceptor\ControllerAuthorityCheckInterceptor.java`
- Size: 7097 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.interceptor;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.qifu.base.Constants;
import org.qifu.base.CoreAppConstants;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.qifu.core.support.SysEventLogSupport;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ControllerAuthorityCheckInterceptor implements HandlerInterceptor {
	protected static Logger logger = LoggerFactory.getLogger(ControllerAuthorityCheckInterceptor.class);
	
	private BaseInfoConfigProperties baseInfoConfigProperties;
	
	public BaseInfoConfigProperties getBaseInfoConfigProperties() {
		return baseInfoConfigProperties;
	}
	
	@Resource
	public void setBaseInfoConfigProperties(BaseInfoConfigProperties baseInfoConfigProperties) {
		this.baseInfoConfigProperties = baseInfoConfigProperties;
	}
	
	private void log(String userId, String sysId, String url, boolean permit) {
		if (!YesNoKeyProvide.YES.equals(baseInfoConfigProperties.getEnableControllerAuthCheckLog())) {
			return;
		}
		if (this.isEventLogPage(url)) {
			return;
		}
		boolean log = true;
		String[] excludeLogUrls = CoreAppConstants.getWebConfiginterceptorExcludePathPatterns();
		for (int i = 0; log && excludeLogUrls != null && i < excludeLogUrls.length; i++) {
			if ( excludeLogUrls[i].indexOf(url) > -1 ) {
				log = false;
			}
		}
		if (!log) {
			logger.info("exclude log url: {}", url);
			return;
		}
		SysEventLogSupport.log(userId, sysId, url, permit);
	}
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		String url = request.getServletPath();
		String qifuPageTab = request.getParameter(Constants.QIFU_PAGE_IN_TAB_IFRAME);
		User user = UserUtils.getCurrentUser();
		if (user == null) {
			if (YesNoKeyProvide.YES.equals(qifuPageTab)) {
				response.sendRedirect( CoreAppConstants.SYS_PAGE_TAB_LOGIN_AGAIN );
				return false;
			}		
			String header = request.getHeader("X-Requested-With"); // qifu3, qifu2... bambooBSC old
			String contentType = request.getContentType().toLowerCase(); // qifu4
			if ("XMLHttpRequest".equalsIgnoreCase(header) || Strings.CS.indexOf(contentType, "json") >-1) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().print(Constants.NO_AUTHZ_JSON_DATA);
				response.getWriter().flush();
				response.getWriter().close();
				return false;
			}
			response.sendRedirect( CoreAppConstants.SYS_PAGE_LOGIN );
			return false;
		}
		if (UserUtils.isAdmin()) {
			this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, true );
			return true;
		}
		if (!(handler instanceof HandlerMethod)) { // 非 HandlerMethod 不檢查
			return true;
		}
		Method method = ((HandlerMethod) handler).getMethod();
		Annotation[] actionMethodAnnotations = method.getAnnotations();
		if (this.isControllerAuthority(actionMethodAnnotations)) {
			this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, true );
			return true;
		}		
		if (UserUtils.isPermitted(url, PermissionType.CONTROLLER.name()) || UserUtils.isPermitted(Constants.FORWARD_SLASH + url, PermissionType.CONTROLLER.name())) {
			this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, true );
			return true;
		}		
		logger.warn("[decline] user={} url={}", user.getUsername(), url);
		if (YesNoKeyProvide.YES.equals(qifuPageTab)) {
			this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, false );
			response.sendRedirect( CoreAppConstants.SYS_PAGE_NO_AUTH );
			return false;
		}		
		String header = request.getHeader("X-Requested-With"); // qifu3, qifu2... bambooBSC old
		String contentType = request.getContentType().toLowerCase(); // qifu4
		if ("XMLHttpRequest".equalsIgnoreCase(header) || Strings.CS.indexOf(contentType, "json") >-1) {
			response.getWriter().print(Constants.NO_AUTHZ_JSON_DATA);
			response.getWriter().flush();
			response.getWriter().close();
			this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, false );
			return false;
		}
		this.log( user.getUsername(), baseInfoConfigProperties.getSystem(), url, false );
		response.sendRedirect( CoreAppConstants.SYS_PAGE_NO_AUTH );
		return false;
	}
	
	private boolean isControllerAuthority(Annotation[] actionMethodAnnotations) {
		if (actionMethodAnnotations==null || actionMethodAnnotations.length == 0) { // 沒有 ControllerMethodAuthority 不需要check
			return true;
		}
		boolean foundControllerMethodAuthority = false;
		for (Annotation anno : actionMethodAnnotations) {
			if (anno instanceof ControllerMethodAuthority) {
				foundControllerMethodAuthority = true;
			}
		}
		if (!foundControllerMethodAuthority) { // 沒有 ControllerMethodAuthority 不需要check
			return true;
		}
		for (Annotation anno : actionMethodAnnotations) {
			if (!(anno instanceof @SuppressWarnings("unused") ControllerMethodAuthority cma)) {
				continue;
			}
			if (!((ControllerMethodAuthority)anno).check()) { // check=false , 表示不要檢查權限
				return true;
			}
			String progId = ((ControllerMethodAuthority)anno).programId();
			if (StringUtils.isBlank(progId)) {
				return false;	
			}
			if (UserUtils.isPermitted(progId, PermissionType.CONTROLLER.name())) {
				return true;
			}
		}
		return false;
	}	    
	
	/*
	 * Event log 查詢的頁面
	 */
	private boolean isEventLogPage(String url) {
		return (StringUtils.defaultString(url).startsWith("/sysEventLog") || StringUtils.defaultString(url).startsWith("/api/PROG004D0002"));
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/interceptor/MDC4UserBuildInterceptor.java`

- Purpose: Java class; declares class MDC4UserBuildInterceptor; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.interceptor`
- Role: Java class
- Main types: `class MDC4UserBuildInterceptor implements HandlerInterceptor`
- Key annotations: `Override`
- Local dependencies: `org.qifu.core.model.User`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.web.servlet.HandlerInterceptor`
- Main methods:
  - L14 `public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)`
  - L25 `public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)`
- Main fields:
  - L11 `String USERID_KEY_NAME`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\interceptor\MDC4UserBuildInterceptor.java`
- Size: 964 bytes

#### Source

````java
package org.qifu.core.interceptor;

import org.qifu.core.model.User;
import org.qifu.core.util.UserUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MDC4UserBuildInterceptor implements HandlerInterceptor {
	private static final String USERID_KEY_NAME = "userId";
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String logUserId = "";
		User u = null;
		if ((u = UserUtils.getCurrentUser()) != null) {
			logUserId = u.getUserId();
		}
		org.slf4j.MDC.put(USERID_KEY_NAME, logUserId);
		return true;
	}
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	org.slf4j.MDC.remove(USERID_KEY_NAME);
    }	
    
}
````

### `backend/core/src/main/java/org/qifu/core/interceptor/MqttMonitoringInterceptor.java`

- Purpose: Java class; declares class MqttMonitoringInterceptor; has 11 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.interceptor`
- Role: Java class
- Main types: `class MqttMonitoringInterceptor extends AbstractInterceptHandler`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.properties.MqttConfigProperties`, `org.qifu.core.vo.MqttMessageVO`
- Third-party dependencies: `io.moquette.interception.AbstractInterceptHandler`, `io.moquette.interception.messages.InterceptPublishMessage`, `io.moquette.interception.messages.InterceptSubscribeMessage`, `io.moquette.interception.messages.InterceptUnsubscribeMessage`, `io.netty.buffer.ByteBuf`
- Main methods:
  - L48 `public String getID()`
  - L53 `public void onPublish(InterceptPublishMessage msg)`
  - L79 `public void onSubscribe(InterceptSubscribeMessage msg)`
  - L85 `public void onUnsubscribe(InterceptUnsubscribeMessage msg)`
  - L96 `public void onSessionLoopError(Throwable error)`
  - L103 `public Set<String> getObservedTopics()`
  - L110 `public Set<String> getSubscribedTopics()`
  - L117 `public Map<String, Integer> getTopicSubscribers()`
  - L125 `public List<MqttMessageVO> getMessages(String topic)`
  - L138 `public String getLastTime(String topic)`
  - L145 `public int getSubscriberCount(String topic)`
- Main fields:
  - L26 `MqttConfigProperties mqttConfigProperties`
  - L35 `Map<String, Deque<MqttMessageVO>> topicMessages`
  - L40 `Map<String, String> topicLastTime`
  - L45 `Map<String, AtomicInteger> topicSubscribers`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\interceptor\MqttMonitoringInterceptor.java`
- Size: 4048 bytes

#### Source

````java
package org.qifu.core.interceptor;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.vo.MqttMessageVO;

import io.moquette.interception.AbstractInterceptHandler;
import io.moquette.interception.messages.InterceptPublishMessage;
import io.moquette.interception.messages.InterceptSubscribeMessage;
import io.moquette.interception.messages.InterceptUnsubscribeMessage;
import io.netty.buffer.ByteBuf;

public class MqttMonitoringInterceptor extends AbstractInterceptHandler {
	private final MqttConfigProperties mqttConfigProperties;
	
	public MqttMonitoringInterceptor(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}

	/**
	 * Topic -> Recent Messages
	 */
	private final Map<String, Deque<MqttMessageVO>> topicMessages = new ConcurrentHashMap<>();

	/**
	 * Topic -> Last Publish Time
	 */
	private final Map<String, String> topicLastTime = new ConcurrentHashMap<>();

	/**
	 * Topic -> Subscriber Count
	 */
	private final Map<String, AtomicInteger> topicSubscribers = new ConcurrentHashMap<>();

	@Override
	public String getID() {
		return "MqttMonitoringInterceptor";
	}

	@Override
	public void onPublish(InterceptPublishMessage msg) {
		String topic = msg.getTopicName();
		ByteBuf payload = msg.getPayload();
		String content = payload.toString(StandardCharsets.UTF_8);
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		MqttMessageVO messageVO = new MqttMessageVO();
		messageVO.setTopic(topic);
		messageVO.setPayload(content);
		messageVO.setTime(time);
		
		topicMessages.computeIfAbsent(topic, k -> new LinkedList<>());
		
		Deque<MqttMessageVO> queue = topicMessages.get(topic);
		
		synchronized (queue) {
			queue.addFirst(messageVO);
			while (queue.size() > mqttConfigProperties.getMonitoringInterceptorPerTopic()) {
				queue.removeLast();
			}
		}
		
		topicLastTime.put(topic, time);
	}
	
	@Override
	public void onSubscribe(InterceptSubscribeMessage msg) {
		String topic = msg.getTopicFilterClient();
		topicSubscribers.computeIfAbsent(topic, k -> new AtomicInteger(0)).incrementAndGet();
	}
	
	@Override
	public void onUnsubscribe(InterceptUnsubscribeMessage msg) {
		String topic = msg.getTopicFilterClient();
		AtomicInteger count = topicSubscribers.get(topic);
		if (count != null) {
			if (count.decrementAndGet() <= 0) {
				topicSubscribers.remove(topic);
			}
		}
	}

	@Override
	public void onSessionLoopError(Throwable error) {
		// ignore
	}

	/**
	 * 所有曾收到 Publish 的 Topic
	 */
	public Set<String> getObservedTopics() {
		return topicMessages.keySet();
	}

	/**
	 * 所有有訂閱者的 Topic
	 */
	public Set<String> getSubscribedTopics() {
		return topicSubscribers.keySet();
	}

	/**
	 * Topic -> Subscriber Count
	 */
	public Map<String, Integer> getTopicSubscribers() {
		return topicSubscribers.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get()));
	}

	/**
	 * 最近訊息
	 */
	public List<MqttMessageVO> getMessages(String topic) {
		Deque<MqttMessageVO> queue = topicMessages.get(topic);
		if (queue == null) {
			return new ArrayList<>();
		}
		synchronized (queue) {
			return new ArrayList<>(queue);
		}
	}

	/**
	 * 最後訊息時間
	 */
	public String getLastTime(String topic) {
		return topicLastTime.get(topic);
	}

	/**
	 * Topic 訂閱數
	 */
	public int getSubscriberCount(String topic) {
		AtomicInteger count = topicSubscribers.get(topic);
		return count == null ? 0 : count.get();
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/interceptor/UserBuilderInterceptor.java`

- Purpose: Java class; declares class UserBuilderInterceptor; has 15 detected methods; depends on 14 org.qifu local types
- Package: `org.qifu.core.interceptor`
- Role: Java class
- Main types: `class UserBuilderInterceptor implements HandlerInterceptor`
- Key annotations: `Deprecated`, `Resource`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.support.TokenStoreValidateBuilder`, `org.qifu.base.util.TokenBuilderUtils`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysCode`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.ISysCodeService`, `org.qifu.core.service.IUserRoleService`, `org.qifu.core.util.CookieUtils`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.security.oauth2.jwt.Jwt`, `org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken`, `org.springframework.web.servlet.HandlerInterceptor`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `com.auth0.jwt.interfaces.Claim`
- Injection/config points:
  - L80 `@Resource` -> `public void setSysCodeService(ISysCodeService<TbSysCode, String> sysCodeService) {`
  - L89 `@Resource` -> `public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService) {`
  - L98 `@Resource` -> `public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService) {`
  - L107 `@Resource` -> `public void setDataSource(DataSource dataSource) {`
- Main methods:
  - L76 `public ISysCodeService<TbSysCode, String> getSysCodeService()`
  - L81 `public void setSysCodeService(ISysCodeService<TbSysCode, String> sysCodeService)`
  - L85 `public IUserRoleService<TbUserRole, String> getUserRoleService()`
  - L90 `public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService)`
  - L94 `public IRolePermissionService<TbRolePermission, String> getRolePermissionService()`
  - L99 `public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService)`
  - L103 `public DataSource getDataSource()`
  - L108 `public void setDataSource(DataSource dataSource)`
  - L113 `public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)`
  - L123 `private boolean buildUserFromSecurityContext()`
  - L138 `private boolean buildUserFromLegacyToken(HttpServletRequest request, HttpServletResponse response)`
  - L179 `private void buildUserLocal(String userId)`
  - L183 `private void buildUserLocal(String userId, Map<String, Object> param)`
  - L191 `private void fillUserRoleDataOfPreHandle(Map<String, Object> param, String userId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap)`
  - L222 `public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)`
- Main fields:
  - L66 `Logger logger`
  - L68 `ISysCodeService<TbSysCode, String> sysCodeService`
  - L70 `IUserRoleService<TbUserRole, String> userRoleService`
  - L72 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
  - L74 `DataSource dataSource`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\interceptor\UserBuilderInterceptor.java`
- Size: 8890 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.interceptor;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.support.TokenStoreValidateBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.ISysCodeService;
import org.qifu.core.service.IUserRoleService;
import org.qifu.core.util.CookieUtils;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.servlet.HandlerInterceptor;

import com.auth0.jwt.interfaces.Claim;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @deprecated JWT user context is now built by JwtUserContextFilter in the Spring Security filter chain.
 */
@Deprecated(since = "0.0.5")
public class UserBuilderInterceptor implements HandlerInterceptor {
	
	protected static Logger logger = LoggerFactory.getLogger(UserBuilderInterceptor.class);
	
	private ISysCodeService<TbSysCode, String> sysCodeService;	
	
	private IUserRoleService<TbUserRole, String> userRoleService; 
	
	private IRolePermissionService<TbRolePermission, String> rolePermissionService;
	
	private DataSource dataSource;	
	
	public ISysCodeService<TbSysCode, String> getSysCodeService() {
		return sysCodeService;
	}
	
	@Resource
	public void setSysCodeService(ISysCodeService<TbSysCode, String> sysCodeService) {
		this.sysCodeService = sysCodeService;
	}

	public IUserRoleService<TbUserRole, String> getUserRoleService() {
		return userRoleService;
	}

	@Resource
	public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService) {
		this.userRoleService = userRoleService;
	}

	public IRolePermissionService<TbRolePermission, String> getRolePermissionService() {
		return rolePermissionService;
	}

	@Resource
	public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService) {
		this.rolePermissionService = rolePermissionService;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (request.getRequestURL().indexOf(Constants.TOKEN_CHECK_URL_PATH) == -1) {
			return true;
		}
		if (this.buildUserFromSecurityContext()) {
			return true;
		}
		return this.buildUserFromLegacyToken(request, response);
	}
	
	private boolean buildUserFromSecurityContext() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof JwtAuthenticationToken jwtAuthentication)) {
			return false;
		}
		Jwt jwt = jwtAuthentication.getToken();
		String userId = StringUtils.defaultString(jwt.getClaimAsString(Constants.TOKEN_USER_PARAM_NAME));
		if (StringUtils.isBlank(userId)) {
			logger.warn(">>> JWT authenticated, but no user claim: {}", Constants.TOKEN_USER_PARAM_NAME);
			return false;
		}
		this.buildUserLocal(userId);
		return true;
	}
	
	private boolean buildUserFromLegacyToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String authorization = StringUtils.defaultString(request.getHeader( Constants.TOKEN_AUTH )).trim();
		String token = "";
		if (authorization.startsWith(Constants.TOKEN_PREFIX)) {
			token = authorization.replaceFirst(Constants.TOKEN_PREFIX, "").replace(" ", "");
		} 
		
		if (StringUtils.isBlank(token) || YesNoKeyProvide.YES.equals(token)) {
			token = StringUtils.defaultString(CookieUtils.getCookieValue(request, Constants.TOKEN_ACCESS_COOKIE_NAME));
		}
		
		if (StringUtils.isBlank(token)) {
			logger.warn(">>> No authorization uri: {} , remote-address: {} , remote-port: {} ", request.getRequestURI(), request.getRemoteAddr(), request.getRemotePort());
			response.setCharacterEncoding( Constants.BASE_ENCODING );
			response.setStatus(401); // 2023-08-04 add , 讓前端的 axios interceptor 去接
			response.getWriter().print( "{ \"success\":\"N\",\"message\":\"No authorization token\",\"login\":\"N\",\"isAuthorize\":\"N\" }" );
			response.getWriter().flush();
			response.getWriter().close();						
			return false;
		}
		
		TokenStoreValidateBuilder tsv = TokenStoreValidateBuilder.build(this.dataSource);
		
		Map<String, Object> param = new HashMap<>();
		Map<String, Claim> claimToken = TokenBuilderUtils.verifyToken(token, tsv);
		if (TokenBuilderUtils.existsInfo(claimToken)) {
			String userId = StringUtils.defaultString( claimToken.get(Constants.TOKEN_USER_PARAM_NAME).asString() );
			this.buildUserLocal(userId, param);
		}
		if ( UserUtils.getCurrentUser() == null ) {
			logger.warn(">>> No authorization uri: {} , remote-address: {} , remote-port: {} ", request.getRequestURI(), request.getRemoteAddr(), request.getRemotePort());
			response.setCharacterEncoding( Constants.BASE_ENCODING );
			response.setStatus(401); // 2023-08-04 add , 讓前端的 axios interceptor 去接
			response.getWriter().print( Constants.NO_LOGIN_JSON_DATA );
			response.getWriter().flush();
			response.getWriter().close();			
			return false;
		}
		return true;
	}

	private void buildUserLocal(String userId) {
		this.buildUserLocal(userId, new HashMap<>());
	}
	
	private void buildUserLocal(String userId, Map<String, Object> param) {
		List<String> roleIds = new ArrayList<>();
		Map<String, List<RolePermissionAttr>> rolePermissionMap = new HashMap<>();
		this.fillUserRoleDataOfPreHandle(param, userId, roleIds, rolePermissionMap);
		UserUtils.setUserInfoForUserLocalUtils(userId, roleIds, rolePermissionMap);
		logger.info("User builder from Resource Server JWT : {} , role: {}", userId, roleIds);
	}
	
	private void fillUserRoleDataOfPreHandle(Map<String, Object> param, String userId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap) {
		try {
			param.clear();
			if (!StringUtils.isBlank(userId)) {
				param.put("account", userId);
				List<TbUserRole> urList = this.userRoleService.selectListByParams(param).getValue();
				for (int j = 0; urList != null && j < urList.size(); j++) {
					TbUserRole ur = urList.get(j);
					roleIds.add(ur.getRole());
					param.clear();
					param.put("role", ur.getRole());
					List<TbRolePermission> rpList = this.rolePermissionService.selectListByParams(param).getValue();
					rolePermissionMap.put(ur.getRole(), new ArrayList<>());
					List<RolePermissionAttr> permList = rolePermissionMap.get(ur.getRole());
					for (int x = 0; rpList != null && x < rpList.size(); x++) {
						TbRolePermission rp = rpList.get(x);
						RolePermissionAttr rpa = new RolePermissionAttr();
						rpa.setPermission(rp.getPermission());
						rpa.setType(rp.getPermType());
						permList.add(rpa);
					}
				}
			}				
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	UserUtils.removeForUserLocalUtils();
    }
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/IApplicationSystemLogicService.java`

- Purpose: Java class; declares interface IApplicationSystemLogicService; has 3 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface IApplicationSystemLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSys`
- Main methods:
  - L39 `public DefaultResult<TbSys> create(TbSys sys)`
  - L49 `public DefaultResult<Boolean> delete(TbSys sys)`
  - L60 `public DefaultResult<TbSys> update(TbSys sys)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\IApplicationSystemLogicService.java`
- Size: 1680 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSys;

public interface IApplicationSystemLogicService {
	
	/**
	 * 建立 TB_SYS 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSys> create(TbSys sys) throws ServiceException;
	
	/**
	 * 刪除 TB_SYS 資料
	 * 
	 * @param sys
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> delete(TbSys sys) throws ServiceException;
	
	/**
	 * 更新 TB_SYS 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSys> update(TbSys sys) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/ApplicationSystemLogicServiceImpl.java`

- Purpose: Service or business logic; declares class ApplicationSystemLogicServiceImpl; has 3 detected methods; depends on 12 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class ApplicationSystemLogicServiceImpl extends BaseLogicService implements IApplicationSystemLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSys`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.IApplicationSystemLogicService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.service.ISysService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L78 `public DefaultResult<TbSys> create(TbSys sys)`
  - L96 `public DefaultResult<Boolean> delete(TbSys sys)`
  - L128 `public DefaultResult<TbSys> update(TbSys sys)`
- Main fields:
  - L51 `Logger logger`
  - L53 `ISysService<TbSys, String> sysService`
  - L55 `ISysProgService<TbSysProg, String> sysProgService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\ApplicationSystemLogicServiceImpl.java`
- Size: 4498 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSys;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.IApplicationSystemLogicService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.service.ISysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class ApplicationSystemLogicServiceImpl extends BaseLogicService implements IApplicationSystemLogicService {
	protected static Logger logger = LoggerFactory.getLogger(ApplicationSystemLogicServiceImpl.class);
	
	private final ISysService<TbSys, String> sysService;
	
	private final ISysProgService<TbSysProg, String> sysProgService;
	
	public ApplicationSystemLogicServiceImpl(ISysService<TbSys, String> sysService, ISysProgService<TbSysProg, String> sysProgService) {
		super();
		this.sysService = sysService;
		this.sysProgService = sysProgService;
	}

	/**
	 * 建立 TB_SYS 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbSys> create(TbSys sys) throws ServiceException {
		return this.sysService.insert(sys);
	}
	
	/**
	 * 刪除 TB_SYS 資料
	 * 
	 * @param sys
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSys sys) throws ServiceException {
		if (sys==null || StringUtils.isBlank(sys.getOid()) ) {
			throw new ServiceException( BaseSystemMessage.parameterBlank() );
		}
		DefaultResult<TbSys> sysResult = this.sysService.selectByEntityPrimaryKey(sys);
		if (sysResult.getValue()==null) {
			throw new ServiceException(sysResult.getMessage());
		}
		sys = sysResult.getValue();
		Map<String, Object> params = new HashMap<>();
		params.put("progSystem", sys.getSysId());
		if (this.sysProgService.count(params)>0) {
			throw new ServiceException(BaseSystemMessage.dataCannotDelete());
		}		
		return this.sysService.delete(sys);		
	}
	
	/**
	 * 更新 TB_SYS 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSys> update(TbSys sys) throws ServiceException {
		return this.sysService.update(sys);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/RoleLogicServiceImpl.java`

- Purpose: Service or business logic; declares class RoleLogicServiceImpl; has 16 detected methods; depends on 23 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class RoleLogicServiceImpl extends BaseLogicService implements IRoleLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbAccount`, `org.qifu.core.entity.TbRole`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysCode`, `org.qifu.core.entity.TbSysMenuRole`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.logic.IRoleLogicService`, `org.qifu.core.service.IAccountService`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.IRoleService`, `org.qifu.core.service.ISysCodeService`, `org.qifu.core.service.ISysMenuRoleService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.service.IUserRoleService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L115 `public DefaultResult<TbRole> create(TbRole role)`
  - L138 `public DefaultResult<TbRole> update(TbRole role)`
  - L162 `public DefaultResult<Boolean> delete(TbRole role)`
  - L186 `private void deleteRolePermission(Map<String, Object> params)`
  - L196 `private void deleteUserRole(Map<String, Object> params)`
  - L206 `private void deleteSysMenuRole(Map<String, Object> params)`
  - L231 `public DefaultResult<TbRolePermission> createPermission(TbRolePermission permission, String roleOid)`
  - L264 `public DefaultResult<Boolean> deletePermission(TbRolePermission permission)`
  - L285 `public Map<String, List<TbRole>> findForAccountRoleEnableAndAll(String accountOid)`
  - L317 `public DefaultResult<Boolean> updateUserRole(String accountOid, List<String> roles)`
  - L354 `private void deleteUserRoleByAccount(TbAccount account)`
  - L380 `public Map<String, List<TbRole>> findForProgramRoleEnableAndAll(String programOid)`
  - L412 `public DefaultResult<Boolean> updateMenuRole(String progOid, List<String> roles)`
  - L469 `public DefaultResult<TbRole> copyAsNew(String fromRoleOid, TbRole role)`
  - L514 `public String getDefaultUserRole()`
  - L543 `public TbRole getDefaultUserRoleEntity()`
- Main fields:
  - L64 `Logger logger`
  - L68 `int MAX_DESCRIPTION_LENGTH`
  - L69 `String DESCRIPTION_VAR`
  - L71 `ISysCodeService<TbSysCode, String> sysCodeService`
  - L73 `IRoleService<TbRole, String> roleService`
  - L75 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
  - L77 `IUserRoleService<TbUserRole, String> userRoleService`
  - L79 `IAccountService<TbAccount, String> accountService`
  - L81 `ISysProgService<TbSysProg, String> sysProgService`
  - L83 `ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\RoleLogicServiceImpl.java`
- Size: 21127 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbAccount;
import org.qifu.core.entity.TbRole;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.entity.TbSysMenuRole;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.logic.IRoleLogicService;
import org.qifu.core.service.IAccountService;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.IRoleService;
import org.qifu.core.service.ISysCodeService;
import org.qifu.core.service.ISysMenuRoleService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.service.IUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class RoleLogicServiceImpl extends BaseLogicService implements IRoleLogicService {
	protected static Logger logger = LoggerFactory.getLogger(RoleLogicServiceImpl.class);
	
	private static final String DEFAULT_ROLE_CODE = "CMM_CONF001"; // 預設要套用role的 TB_SYS_CODE.CODE = 'BSC_CONF001' and TYPE='BSC'
	private static final String DEFAULT_ROLE_CODE_TYPE = "CMM"; // 預設要套用role的 TB_SYS_CODE.CODE = 'BSC_CONF001' and TYPE='BSC'	
	private static final int MAX_DESCRIPTION_LENGTH = 500;
	private static final String DESCRIPTION_VAR = "description";
	
	private final ISysCodeService<TbSysCode, String> sysCodeService;
	
	private final IRoleService<TbRole, String> roleService;
	
	private final IRolePermissionService<TbRolePermission, String> rolePermissionService;
	
	private final IUserRoleService<TbUserRole, String> userRoleService;
	
	private final IAccountService<TbAccount, String> accountService;
	
	private final ISysProgService<TbSysProg, String> sysProgService;
	
	private final ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService; 
	
	public RoleLogicServiceImpl(ISysCodeService<TbSysCode, String> sysCodeService,
			IRoleService<TbRole, String> roleService,
			IRolePermissionService<TbRolePermission, String> rolePermissionService,
			IUserRoleService<TbUserRole, String> userRoleService, IAccountService<TbAccount, String> accountService,
			ISysProgService<TbSysProg, String> sysProgService,
			ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService) {
		super();
		this.sysCodeService = sysCodeService;
		this.roleService = roleService;
		this.rolePermissionService = rolePermissionService;
		this.userRoleService = userRoleService;
		this.accountService = accountService;
		this.sysProgService = sysProgService;
		this.sysMenuRoleService = sysMenuRoleService;
	}

	/**
	 * 建立 TB_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbRole> create(TbRole role) throws ServiceException {
		if (role==null || super.isBlank(role.getRole())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		role.setDescription( super.defaultString(role.getDescription()) );
		this.setStringValueMaxLength(role, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		return this.roleService.insert(role);
	}

	/**
	 * 更新 TB_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )	
	@Override
	public DefaultResult<TbRole> update(TbRole role) throws ServiceException {
		
		if (role==null || super.isBlank(role.getRole())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		role.setDescription( super.defaultString(role.getDescription()) );
		this.setStringValueMaxLength(role, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		return this.roleService.update(role);
	}

	/**
	 * 刪除 TB_ROLE, TB_ROLE_PERMISSION, TB_USER_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> delete(TbRole role) throws ServiceException {
		if (role==null || super.isBlank(role.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbRole> rResult = this.roleService.selectByEntityPrimaryKey(role);
		if (rResult.getValue()==null) {
			throw new ServiceException(rResult.getMessage());
		}
		role = rResult.getValue();
		if (Constants.SUPER_ROLE_ADMIN.equals(role.getRole()) || Constants.SUPER_ROLE_ALL.equals(role.getRole())) {			
			throw new ServiceException("Administrator or super role cannot delete!");
		}		
		String defaultUserRole = this.getDefaultUserRole();
		if (role.getRole().equals(defaultUserRole)) {
			throw new ServiceException("Default user role: " + defaultUserRole + " cannot delete!");
		}
		Map<String, Object> params = new HashMap<>();
		params.put("role", role.getRole());		
		this.deleteRolePermission(params);
		this.deleteUserRole(params);
		this.deleteSysMenuRole(params);
		return roleService.delete(role);
	}
	
	private void deleteRolePermission(Map<String, Object> params) throws ServiceException {
		DefaultResult<List<TbRolePermission>> permListResult = this.rolePermissionService.selectListByParams(params);
		if (CollectionUtils.isEmpty(permListResult.getValue())) {
			return;
		}
		for (TbRolePermission rolePerm : permListResult.getValue()) {
			this.rolePermissionService.delete(rolePerm);
		}
	}
	
	private void deleteUserRole(Map<String, Object> params) throws ServiceException {
		DefaultResult<List<TbUserRole>> userRoleListResult = this.userRoleService.selectListByParams(params);
		if (CollectionUtils.isEmpty(userRoleListResult.getValue())) {
			return;
		}
		for (TbUserRole userRole : userRoleListResult.getValue()) {
			this.userRoleService.delete(userRole);
		}
	}
	
	private void deleteSysMenuRole(Map<String, Object> params) throws ServiceException {
		DefaultResult<List<TbSysMenuRole>> menuRoleListResult = this.sysMenuRoleService.selectListByParams(params);
		if (CollectionUtils.isEmpty(menuRoleListResult.getValue())) {
			return;
		}
		for (TbSysMenuRole sysMenuRole : menuRoleListResult.getValue()) {
			this.sysMenuRoleService.delete(sysMenuRole);
		}
	}

	/**
	 * 產生 TB_ROLE_PERMISSION 資料
	 * 
	 * @param permission
	 * @param roleOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbRolePermission> createPermission(TbRolePermission permission, String roleOid) throws ServiceException {
		if ( super.isBlank(roleOid) || permission==null || super.isBlank(permission.getPermission()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbRole> rResult = this.roleService.selectByPrimaryKey(roleOid);
		if (rResult.getValue()==null) {
			throw new ServiceException(rResult.getMessage());
		}
		TbRole role = rResult.getValue();
		if (Constants.SUPER_ROLE_ADMIN.equals(role.getRole()) || Constants.SUPER_ROLE_ALL.equals(role.getRole())) {			
			throw new ServiceException("Administrator or super role no need to set permission!");
		}
		permission.setRole(role.getRole());
		if ( super.defaultString(permission.getDescription()).length()>MAX_DESCRIPTION_LENGTH ) {
			permission.setDescription( permission.getDescription().substring(0, MAX_DESCRIPTION_LENGTH) );
		}
		return this.rolePermissionService.insert(permission);
	}

	/**
	 * 刪除 TB_ROLE_PERMISSION 資料
	 * 
	 * @param permission
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> deletePermission(TbRolePermission permission) throws ServiceException {
		if ( null==permission || super.isBlank(permission.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		return rolePermissionService.delete(permission);
	}

	/**
	 * 找出全部的role與某帳戶下的role
	 * 
	 * map 中的  key 
	 * enable	- 帳戶下的role
	 * all	- 所有role
	 * 
	 * @param accountOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.SELECT)
	@Override
	public Map<String, List<TbRole>> findForAccountRoleEnableAndAll(String accountOid) throws ServiceException {
		if (super.isBlank(accountOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbAccount> aResult = this.accountService.selectByPrimaryKey(accountOid);
		if (aResult.getValue()==null) {
			throw new ServiceException(aResult.getMessage());
		}
		TbAccount account = aResult.getValue();
		Map<String, List<TbRole>> roleMap = new HashMap<>();
		List<TbRole> enableRole = this.roleService.findForAccount(account.getAccount());
		List<TbRole> allRole = this.roleService.selectList().getValue();
		roleMap.put("enable", enableRole);
		roleMap.put("all", allRole);
		return roleMap;
	}

	/**
	 * 更新帳戶的role
	 * 
	 * @param accountOid
	 * @param roles
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> updateUserRole(String accountOid, List<String> roles) throws ServiceException {
		if (super.isBlank(accountOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbAccount> aResult = this.accountService.selectByPrimaryKey(accountOid);
		if (aResult.getValue()==null) {
			throw new ServiceException(aResult.getMessage());
		}
		TbAccount account = aResult.getValue();
		DefaultResult<Boolean> result = new DefaultResult<>();
		result.setValue(false);
		result.setMessage(BaseSystemMessage.updateFail());		
		this.deleteUserRoleByAccount(account);
		for (int i=0; roles!=null && i<roles.size(); i++) {
			String roleOid = roles.get(i).trim();
			if (super.isBlank(roleOid)) {
				continue;
			}
			DefaultResult<TbRole> rResult = this.roleService.selectByPrimaryKey(roleOid);
			if (rResult.getValue()==null) {
				throw new ServiceException(rResult.getMessage());
			}
			TbRole role = rResult.getValue();
			TbUserRole userRole = new TbUserRole();
			userRole.setAccount(account.getAccount());
			userRole.setRole(role.getRole());
			userRole.setDescription("");
			DefaultResult<TbUserRole> urResult = this.userRoleService.insert(userRole);
			if (urResult.getValue()==null) {
				throw new ServiceException(urResult.getMessage());
			}
		}
		result.setValue(true);
		result.setMessage(BaseSystemMessage.updateSuccess());
		return result;
	}
	
	private void deleteUserRoleByAccount(TbAccount account) throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("account", account.getAccount());
		DefaultResult<List<TbUserRole>> userRoleListResult = this.userRoleService.selectListByParams(paramMap);
		if (CollectionUtils.isEmpty(userRoleListResult.getValue())) {
			return;
		}
		for (TbUserRole userRole : userRoleListResult.getValue()) {
			this.userRoleService.delete(userRole);
		}
	}

	/**
	 * 找出全部的role與某程式menu所屬的role
	 * 
	 * map 中的  key 
	 * enable	- 程式menu的role
	 * all	- 所有role
	 * 
	 * @param programOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.SELECT)
	@Override
	public Map<String, List<TbRole>> findForProgramRoleEnableAndAll(String programOid) throws ServiceException {
		if (StringUtils.isBlank(programOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysProg> spResult = this.sysProgService.selectByPrimaryKey(programOid);
		if (spResult.getValue()==null) {
			throw new ServiceException(spResult.getMessage());
		}
		TbSysProg sysProg = spResult.getValue();
		Map<String, List<TbRole>> roleMap = new HashMap<>();
		List<TbRole> enableRole = this.roleService.findForProgram(sysProg.getProgId());
		List<TbRole> allRole = this.roleService.selectList().getValue();
		roleMap.put("enable", enableRole);
		roleMap.put("all", allRole);				
		return roleMap;
	}
	
	/**
	 * 更新存在選單中程式的選單所屬 role
	 * 
	 * @param progOid
	 * @param roles
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> updateMenuRole(String progOid, List<String> roles) throws ServiceException {
		if (super.isBlank(progOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysProg> spResult = this.sysProgService.selectByPrimaryKey(progOid);
		if (spResult.getValue()==null) {
			throw new ServiceException(spResult.getMessage());
		}
		TbSysProg sysProg = spResult.getValue();
		DefaultResult<Boolean> result = new DefaultResult<>();
		result.setValue(false);
		result.setMessage(BaseSystemMessage.updateSuccess());			
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("progId", sysProg.getProgId());
		DefaultResult<List<TbSysMenuRole>> sysMenuRoleListResult = this.sysMenuRoleService.selectListByParams(paramMap);
		for (int i=0; sysMenuRoleListResult.getValue() != null && i < sysMenuRoleListResult.getValue().size(); i++) {
			TbSysMenuRole sysMenuRole = sysMenuRoleListResult.getValue().get(i);
			this.sysMenuRoleService.delete(sysMenuRole);
		}
		for (int i=0; roles != null && i < roles.size(); i++) {
			String roleOid = roles.get(i).trim();
			if (super.isBlank(roleOid)) {
				continue;
			}
			DefaultResult<TbRole> rResult = this.roleService.selectByPrimaryKey(roleOid);
			if (rResult.getValue()==null) {
				throw new ServiceException(rResult.getMessage());
			}
			TbRole role = rResult.getValue();
			TbSysMenuRole sysMenuRole = new TbSysMenuRole();
			sysMenuRole.setProgId(sysProg.getProgId());
			sysMenuRole.setRole(role.getRole());
			DefaultResult<TbSysMenuRole> smrResult = this.sysMenuRoleService.insert(sysMenuRole);
			if (smrResult.getValue()==null) {
				throw new ServiceException(smrResult.getMessage());
			}			
		}
		result.setValue(true);
		result.setMessage(BaseSystemMessage.updateSuccess());
		return result;
	}
	
	/**
	 * 拷備一份role
	 * 
	 * @param fromRoleOid
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbRole> copyAsNew(String fromRoleOid, TbRole role) throws ServiceException {
		if (role==null || super.isBlank(role.getRole()) || super.isBlank(fromRoleOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		super.setStringValueMaxLength(role, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		DefaultResult<TbRole> result = this.roleService.insert(role);
		if (result.getValue() == null) {
			throw new ServiceException(result.getMessage());
		}
		DefaultResult<TbRole> fromResult = this.roleService.selectByPrimaryKey(fromRoleOid);
		if ( fromResult.getValue() == null ) {
			throw new ServiceException( fromResult.getMessage() );
		}
		TbRole oldRole = fromResult.getValue();		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("role", oldRole.getRole());
		DefaultResult<List<TbRolePermission>> permListResult = this.rolePermissionService.selectListByParams(paramMap);
		for (int i=0; permListResult.getValue() != null && i < permListResult.getValue().size(); i++) {
			TbRolePermission perm = permListResult.getValue().get(i);
			perm.setOid(null);
			perm.setRole( result.getValue().getRole() );
			perm.setCuserid(null);
			perm.setCdate(null);
			this.rolePermissionService.insert(perm);
		}
		// 選單menu role 也copy一份
		DefaultResult<List<TbSysMenuRole>> menuRolesResult = this.sysMenuRoleService.selectListByParams(paramMap);
		for (int i=0; menuRolesResult.getValue() != null && i < menuRolesResult.getValue().size(); i++) {
			TbSysMenuRole menuRole = menuRolesResult.getValue().get(i);
			menuRole.setOid(null);
			menuRole.setRole( result.getValue().getRole() );
			menuRole.setCuserid(null);
			menuRole.setCdate(null);
			this.sysMenuRoleService.insert(menuRole);
		}
		return result;
	}
	
	/**
	 * 使用者設的role-id(角色), 它設定在 tb_sys_code中
	 * 
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	public String getDefaultUserRole() throws ServiceException {
		String role = "";
		TbSysCode sysCode = new TbSysCode();
		sysCode.setType(DEFAULT_ROLE_CODE_TYPE);
		sysCode.setCode(DEFAULT_ROLE_CODE);
		DefaultResult<TbSysCode> result = this.sysCodeService.selectByUniqueKey(sysCode);
		if (result.getValue()==null) {
			throw new ServiceException(result.getMessage());
		}
		sysCode = result.getValue();
		role = sysCode.getParam1();
		if (super.isBlank(role)) {
			throw new ServiceException(BaseSystemMessage.dataErrors());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("role", role);
		if ( this.roleService.count(paramMap) != 1 ) {
			throw new ServiceException(BaseSystemMessage.dataErrors());
		}
		return role;
	}	
	
	/**
	 * 使用者設的role(角色), 它設定在 tb_sys_code中
	 * 
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	public TbRole getDefaultUserRoleEntity() throws ServiceException {
		TbSysCode sysCode = new TbSysCode();
		sysCode.setType(DEFAULT_ROLE_CODE_TYPE);
		sysCode.setCode(DEFAULT_ROLE_CODE);
		sysCode = this.sysCodeService.selectByUniqueKey(sysCode).getValueEmptyThrowMessage();
		if (super.isBlank(sysCode.getParam1())) {
			throw new ServiceException(BaseSystemMessage.dataErrors());
		}
		TbRole role = new TbRole();
		role.setRole( sysCode.getParam1() );
		role = this.roleService.selectByUniqueKey(role).getValueEmptyThrowMessage();
		return role;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemBeanHelpLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemBeanHelpLogicServiceImpl; has 7 detected methods; depends on 18 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemBeanHelpLogicServiceImpl extends BaseLogicService implements ISystemBeanHelpLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSys`, `org.qifu.core.entity.TbSysBeanHelp`, `org.qifu.core.entity.TbSysBeanHelpExpr`, `org.qifu.core.entity.TbSysBeanHelpExprMap`, `org.qifu.core.entity.TbSysExpression`, `org.qifu.core.logic.ISystemBeanHelpLogicService`, `org.qifu.core.service.ISysBeanHelpExprMapService`, `org.qifu.core.service.ISysBeanHelpExprService`, `org.qifu.core.service.ISysBeanHelpService`, `org.qifu.core.service.ISysExpressionService`, `org.qifu.core.service.ISysService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L88 `public DefaultResult<TbSysBeanHelp> create(TbSysBeanHelp beanHelp, String systemOid)`
  - L103 `public DefaultResult<TbSysBeanHelp> update(TbSysBeanHelp beanHelp, String systemOid)`
  - L118 `public DefaultResult<Boolean> delete(TbSysBeanHelp beanHelp)`
  - L147 `public DefaultResult<TbSysBeanHelpExpr> createExpr(TbSysBeanHelpExpr beanHelpExpr, String helpOid, String expressionOid)`
  - L164 `public DefaultResult<Boolean> deleteExpr(TbSysBeanHelpExpr beanHelpExpr)`
  - L184 `public DefaultResult<TbSysBeanHelpExprMap> createExprMap(TbSysBeanHelpExprMap beanHelpExprMap, String helpExprOid)`
  - L199 `public DefaultResult<Boolean> deleteExprMap(TbSysBeanHelpExprMap beanHelpExprMap)`
- Main fields:
  - L57 `Logger logger`
  - L59 `ISysService<TbSys, String> sysService`
  - L61 `ISysBeanHelpService<TbSysBeanHelp, String> sysBeanHelpService`
  - L63 `ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService`
  - L65 `ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> sysBeanHelpExprMapService`
  - L67 `ISysExpressionService<TbSysExpression, String> sysExpressionService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemBeanHelpLogicServiceImpl.java`
- Size: 9589 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSys;
import org.qifu.core.entity.TbSysBeanHelp;
import org.qifu.core.entity.TbSysBeanHelpExpr;
import org.qifu.core.entity.TbSysBeanHelpExprMap;
import org.qifu.core.entity.TbSysExpression;
import org.qifu.core.logic.ISystemBeanHelpLogicService;
import org.qifu.core.service.ISysBeanHelpExprMapService;
import org.qifu.core.service.ISysBeanHelpExprService;
import org.qifu.core.service.ISysBeanHelpService;
import org.qifu.core.service.ISysExpressionService;
import org.qifu.core.service.ISysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemBeanHelpLogicServiceImpl extends BaseLogicService implements ISystemBeanHelpLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemBeanHelpLogicServiceImpl.class);
	
	private final ISysService<TbSys, String> sysService;
	
	private final ISysBeanHelpService<TbSysBeanHelp, String> sysBeanHelpService;	
	
	private final ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService;
	
	private final ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> sysBeanHelpExprMapService;
	
	private final ISysExpressionService<TbSysExpression, String> sysExpressionService;
	
	public SystemBeanHelpLogicServiceImpl(ISysService<TbSys, String> sysService,
			ISysBeanHelpService<TbSysBeanHelp, String> sysBeanHelpService,
			ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService,
			ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> sysBeanHelpExprMapService,
			ISysExpressionService<TbSysExpression, String> sysExpressionService) {
		super();
		this.sysService = sysService;
		this.sysBeanHelpService = sysBeanHelpService;
		this.sysBeanHelpExprService = sysBeanHelpExprService;
		this.sysBeanHelpExprMapService = sysBeanHelpExprMapService;
		this.sysExpressionService = sysExpressionService;
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysBeanHelp> create(TbSysBeanHelp beanHelp, String systemOid) throws ServiceException {
		if (beanHelp==null || super.isBlank(systemOid) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSys sys = this.sysService.selectByPrimaryKey(systemOid).getValueEmptyThrowMessage();
		beanHelp.setSystem(sys.getSysId());		
		return sysBeanHelpService.insert(beanHelp);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysBeanHelp> update(TbSysBeanHelp beanHelp, String systemOid) throws ServiceException {
		if (beanHelp==null || super.isBlank(beanHelp.getOid()) || super.isBlank(systemOid) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSys sys = this.sysService.selectByPrimaryKey(systemOid).getValueEmptyThrowMessage();
		beanHelp.setSystem(sys.getSysId());		
		return sysBeanHelpService.update(beanHelp);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSysBeanHelp beanHelp) throws ServiceException {
		if (beanHelp==null || super.isBlank(beanHelp.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		// delete TB_SYS_BEAN_HELP_EXPR
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("helpOid", beanHelp.getOid());
		List<TbSysBeanHelpExpr> exprList = this.sysBeanHelpExprService.selectListByParams(paramMap).getValue();
		for (int i=0; exprList!=null && i<exprList.size(); i++) {
			// delete TB_SYS_BEAN_HELP_EXPR_MAP
			TbSysBeanHelpExpr helpExpr = exprList.get(i);
			paramMap.clear();
			paramMap.put("helpExprOid", helpExpr.getOid());
			List<TbSysBeanHelpExprMap> exprMapList = this.sysBeanHelpExprMapService.selectListByParams(paramMap).getValue();
			for (int j=0; exprMapList!=null && j<exprMapList.size(); j++) {
				TbSysBeanHelpExprMap helpExprMap = exprMapList.get(j);
				this.sysBeanHelpExprMapService.delete(helpExprMap);
			}
			this.sysBeanHelpExprService.delete(helpExpr);
		}				
		return sysBeanHelpService.delete(beanHelp);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysBeanHelpExpr> createExpr(TbSysBeanHelpExpr beanHelpExpr, String helpOid, String expressionOid) throws ServiceException {
		if (beanHelpExpr==null || super.isBlank(helpOid) || super.isBlank(expressionOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSysBeanHelp sysBeanHelp = this.sysBeanHelpService.selectByPrimaryKey(helpOid).getValueEmptyThrowMessage(); // 查看有沒有資料
		TbSysExpression sysExpression = this.sysExpressionService.selectByPrimaryKey(expressionOid).getValueEmptyThrowMessage(); // 查看有沒有資料
		beanHelpExpr.setHelpOid( sysBeanHelp.getOid() );
		beanHelpExpr.setExprId( sysExpression.getExprId() );		
		return this.sysBeanHelpExprService.insert(beanHelpExpr);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> deleteExpr(TbSysBeanHelpExpr beanHelpExpr) throws ServiceException {
		if (null==beanHelpExpr || super.isBlank(beanHelpExpr.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSysBeanHelpExpr oldSysBeanHelpExpr = this.sysBeanHelpExprService.selectByEntityPrimaryKey(beanHelpExpr).getValueEmptyThrowMessage(); // 查看有沒有資料
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("helpExprOid", oldSysBeanHelpExpr.getOid() );
		List<TbSysBeanHelpExprMap> mapList = this.sysBeanHelpExprMapService.selectListByParams(paramMap).getValue();
		for (int i=0; mapList!=null && i<mapList.size(); i++) {
			this.sysBeanHelpExprMapService.delete( mapList.get(i) );
		}		
		return this.sysBeanHelpExprService.delete(beanHelpExpr);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )				
	@Override
	public DefaultResult<TbSysBeanHelpExprMap> createExprMap(TbSysBeanHelpExprMap beanHelpExprMap, String helpExprOid) throws ServiceException {
		if (beanHelpExprMap==null || super.isBlank(helpExprOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSysBeanHelpExpr sysBeanHelpExpr = this.sysBeanHelpExprService.selectByPrimaryKey(helpExprOid).getValueEmptyThrowMessage(); // 查看有沒有資料
		beanHelpExprMap.setHelpExprOid( sysBeanHelpExpr.getOid() );		
		return this.sysBeanHelpExprMapService.insert(beanHelpExprMap);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> deleteExprMap(TbSysBeanHelpExprMap beanHelpExprMap) throws ServiceException {
		if (beanHelpExprMap==null || super.isBlank(beanHelpExprMap.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		return this.sysBeanHelpExprMapService.delete(beanHelpExprMap);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemExpressionLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemExpressionLogicServiceImpl; has 6 detected methods; depends on 17 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemExpressionLogicServiceImpl extends BaseLogicService implements ISystemExpressionLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSys`, `org.qifu.core.entity.TbSysBeanHelpExpr`, `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.entity.TbSysExpression`, `org.qifu.core.logic.ISystemExpressionLogicService`, `org.qifu.core.model.ExpressionJobConstants`, `org.qifu.core.service.ISysBeanHelpExprService`, `org.qifu.core.service.ISysExprJobService`, `org.qifu.core.service.ISysExpressionService`, `org.qifu.core.service.ISysService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L86 `public DefaultResult<TbSysExpression> create(TbSysExpression expression)`
  - L103 `public DefaultResult<TbSysExpression> update(TbSysExpression expression)`
  - L122 `public DefaultResult<Boolean> delete(TbSysExpression expression)`
  - L144 `public DefaultResult<TbSysExprJob> createJob(TbSysExprJob exprJob, String systemOid, String expressionOid)`
  - L163 `public DefaultResult<TbSysExprJob> updateJob(TbSysExprJob exprJob, String systemOid, String expressionOid)`
  - L188 `public DefaultResult<Boolean> deleteJob(TbSysExprJob exprJob)`
- Main fields:
  - L56 `Logger logger`
  - L58 `int MAX_CONTENT_LENGTH`
  - L59 `int MAX_DESCRIPTION_LENGTH`
  - L60 `String DESCRIPTION_VAR`
  - L62 `ISysExpressionService<TbSysExpression, String> sysExpressionService`
  - L64 `ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService`
  - L66 `ISysExprJobService<TbSysExprJob, String> sysExprJobService`
  - L68 `ISysService<TbSys, String> sysService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemExpressionLogicServiceImpl.java`
- Size: 9216 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSys;
import org.qifu.core.entity.TbSysBeanHelpExpr;
import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.entity.TbSysExpression;
import org.qifu.core.logic.ISystemExpressionLogicService;
import org.qifu.core.model.ExpressionJobConstants;
import org.qifu.core.service.ISysBeanHelpExprService;
import org.qifu.core.service.ISysExprJobService;
import org.qifu.core.service.ISysExpressionService;
import org.qifu.core.service.ISysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemExpressionLogicServiceImpl extends BaseLogicService implements ISystemExpressionLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemExpressionLogicServiceImpl.class);
	
	private static final int MAX_CONTENT_LENGTH = 8000;
	private static final int MAX_DESCRIPTION_LENGTH = 500;
	private static final String DESCRIPTION_VAR = "description";
	
	private final ISysExpressionService<TbSysExpression, String> sysExpressionService;
	
	private final ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService;
	
	private final ISysExprJobService<TbSysExprJob, String> sysExprJobService;
	
	private final ISysService<TbSys, String> sysService;
	
	public SystemExpressionLogicServiceImpl(ISysExpressionService<TbSysExpression, String> sysExpressionService,
			ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService,
			ISysExprJobService<TbSysExprJob, String> sysExprJobService, ISysService<TbSys, String> sysService) {
		super();
		this.sysExpressionService = sysExpressionService;
		this.sysBeanHelpExprService = sysBeanHelpExprService;
		this.sysExprJobService = sysExprJobService;
		this.sysService = sysService;
	}

	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysExpression> create(TbSysExpression expression) throws ServiceException {
		if (expression==null) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		if (super.defaultString(expression.getContent()).length() > MAX_CONTENT_LENGTH) {
			throw new ServiceException("Expression only 8,000 words!");
		}
		this.setStringValueMaxLength(expression, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		return this.sysExpressionService.insert(expression);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysExpression> update(TbSysExpression expression) throws ServiceException {
		if (expression==null || super.isBlank(expression.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		if (super.defaultString(expression.getContent()).length() > MAX_CONTENT_LENGTH) {
			throw new ServiceException("Expression only 8,000 words!");
		}
		this.setStringValueMaxLength(expression, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		TbSysExpression oldSysExpression = this.sysExpressionService.selectByEntityPrimaryKey(expression).getValueEmptyThrowMessage();
		expression.setExprId( oldSysExpression.getExprId() );
		return this.sysExpressionService.update(expression);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSysExpression expression) throws ServiceException {
		if (expression==null || super.isBlank(expression.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSysExpression oldSysExpression = this.sysExpressionService.selectByEntityPrimaryKey(expression).getValueEmptyThrowMessage();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("exprId", oldSysExpression.getExprId() );
		if ( this.sysBeanHelpExprService.count(paramMap) > 0) {
			throw new ServiceException(BaseSystemMessage.dataCannotDelete());
		}
		if ( this.sysExprJobService.count(paramMap) > 0 ) {
			throw new ServiceException(BaseSystemMessage.dataCannotDelete());
		}
		return this.sysExpressionService.delete(expression);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbSysExprJob> createJob(TbSysExprJob exprJob, String systemOid, String expressionOid) throws ServiceException {
		if (exprJob==null || super.isBlank(systemOid) || super.isBlank(expressionOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}	
		TbSys sys = this.sysService.selectByPrimaryKey(systemOid).getValueEmptyThrowMessage();
		TbSysExpression expression = this.sysExpressionService.selectByPrimaryKey(expressionOid).getValueEmptyThrowMessage();
		exprJob.setSystem( sys.getSysId() );
		exprJob.setExprId( expression.getExprId() );
		exprJob.setRunStatus( ExpressionJobConstants.RUNSTATUS_SUCCESS ); // 預設值
		this.setStringValueMaxLength(exprJob, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		return this.sysExprJobService.insert(exprJob);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbSysExprJob> updateJob(TbSysExprJob exprJob, String systemOid, String expressionOid) throws ServiceException {
		if ( null == exprJob || StringUtils.isBlank(exprJob.getOid()) || StringUtils.isBlank(systemOid) || StringUtils.isBlank(expressionOid) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSys sys = this.sysService.selectByPrimaryKey(systemOid).getValueEmptyThrowMessage();		
		TbSysExpression expression = this.sysExpressionService.selectByPrimaryKey(expressionOid).getValueEmptyThrowMessage();
		TbSysExprJob oldSysExprJob = this.sysExprJobService.selectByEntityPrimaryKey(exprJob).getValueEmptyThrowMessage();
		exprJob.setId( oldSysExprJob.getExprId() );
		exprJob.setSystem( sys.getSysId() );
		exprJob.setExprId( expression.getExprId() );
		exprJob.setRunStatus( oldSysExprJob.getRunStatus() );
		if (super.isBlank(oldSysExprJob.getRunStatus())) {
			exprJob.setRunStatus( ExpressionJobConstants.RUNSTATUS_FAULT );
			logger.warn( "Before runStatus flag is blank. Expression Job ID: {}" , oldSysExprJob.getId() );			
		}
		this.setStringValueMaxLength(exprJob, DESCRIPTION_VAR, MAX_DESCRIPTION_LENGTH);
		return this.sysExprJobService.update(exprJob);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> deleteJob(TbSysExprJob exprJob) throws ServiceException {
		if ( null == exprJob || StringUtils.isBlank(exprJob.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		exprJob = this.sysExprJobService.selectByEntityPrimaryKey(exprJob).getValueEmptyThrowMessage();
		return this.sysExprJobService.delete( exprJob );
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemJreportLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemJreportLogicServiceImpl; has 5 detected methods; depends on 13 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemJreportLogicServiceImpl extends BaseLogicService implements ISystemJreportLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSysJreport`, `org.qifu.core.entity.TbSysJreportParam`, `org.qifu.core.logic.ISystemJreportLogicService`, `org.qifu.core.service.ISysJreportParamService`, `org.qifu.core.service.ISysJreportService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.codec.binary.Base64`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L75 `public DefaultResult<TbSysJreport> create(TbSysJreport report)`
  - L97 `public DefaultResult<TbSysJreport> update(TbSysJreport report)`
  - L128 `public DefaultResult<Boolean> delete(TbSysJreport report)`
  - L152 `public DefaultResult<TbSysJreportParam> createParam(TbSysJreportParam reportParam, String reportOid)`
  - L172 `public DefaultResult<Boolean> deleteParam(TbSysJreportParam reportParam)`
- Main fields:
  - L53 `Logger logger`
  - L54 `int MAX_DESCRIPTION_LENGTH`
  - L55 `String SUB_FILE_NAME_JRXML`
  - L56 `String SUB_FILE_NANME_JASPER`
  - L58 `ISysJreportService<TbSysJreport, String> sysJreportService`
  - L60 `ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemJreportLogicServiceImpl.java`
- Size: 7619 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.logic.ISystemJreportLogicService;
import org.qifu.core.service.ISysJreportParamService;
import org.qifu.core.service.ISysJreportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemJreportLogicServiceImpl extends BaseLogicService implements ISystemJreportLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemJreportLogicServiceImpl.class);
	private static final int MAX_DESCRIPTION_LENGTH = 500;
	private static final String SUB_FILE_NAME_JRXML = ".jrxml";
	private static final String SUB_FILE_NANME_JASPER = ".jasper";
	
	private final ISysJreportService<TbSysJreport, String> sysJreportService;
	
	private final ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService;
	
	public SystemJreportLogicServiceImpl(ISysJreportService<TbSysJreport, String> sysJreportService,
			ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService) {
		super();
		this.sysJreportService = sysJreportService;
		this.sysJreportParamService = sysJreportParamService;
	}

	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysJreport> create(TbSysJreport report) throws ServiceException {
		if (report==null) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		if (!this.isBlank(report.getUploadBase64())) {
			report.setContent( Base64.decodeBase64(report.getUploadBase64()) );
		}
		this.setStringValueMaxLength(report, "description", MAX_DESCRIPTION_LENGTH);
		if (YesNoKeyProvide.YES.equals(report.getIsCompile())) {
			report.setFile( report.getReportId() + SUB_FILE_NAME_JRXML);
		} else {
			report.setFile( report.getReportId() + SUB_FILE_NANME_JASPER);
		}
		return this.sysJreportService.insert(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysJreport> update(TbSysJreport report) throws ServiceException {
		if (report==null || super.isBlank(report.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysJreport> oldResult = this.sysJreportService.selectByEntityPrimaryKey(report);
		if (oldResult.getValue()==null) {
			throw new ServiceException(oldResult.getMessage());
		}		
		report.setReportId( oldResult.getValue().getReportId() );		
		byte[] content = oldResult.getValue().getContent();
		this.setStringValueMaxLength(report, "description", MAX_DESCRIPTION_LENGTH);
		if (!this.isBlank(report.getUploadBase64())) {
			report.setContent( Base64.decodeBase64(report.getUploadBase64()) );
		}		
		if (report.getContent()==null) { // 沒有上傳新的jasper,jrxml檔案
			report.setContent( content );			
		}		
		if (YesNoKeyProvide.YES.equals(report.getIsCompile())) {
			report.setFile( report.getReportId() + SUB_FILE_NAME_JRXML);
		} else {
			report.setFile( report.getReportId() + SUB_FILE_NANME_JASPER);
		}		
		return this.sysJreportService.update(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSysJreport report) throws ServiceException {
		if (report==null || super.isBlank(report.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		DefaultResult<TbSysJreport> mResult = this.sysJreportService.selectByPrimaryKeySimple(report.getOid());
		if (mResult.getValue()==null) {
			throw new ServiceException(mResult.getMessage());
		}
		report = mResult.getValue();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("reportId", report.getReportId());
		DefaultResult<List<TbSysJreportParam>> searchListResult = this.sysJreportParamService.selectListByParams(paramMap);
		for (int i=0; searchListResult.getValue() !=null && i < searchListResult.getValue().size(); i++) {
			sysJreportParamService.delete(searchListResult.getValue().get(i));
		}
		return sysJreportService.delete(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )	
	@Override
	public DefaultResult<TbSysJreportParam> createParam(TbSysJreportParam reportParam, String reportOid)
			throws ServiceException {
		if (reportParam==null || super.isBlank(reportOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysJreport> mResult = this.sysJreportService.selectByPrimaryKeySimple(reportOid);
		if (mResult.getValue()==null) {
			throw new ServiceException(mResult.getMessage());
		}
		TbSysJreport report = mResult.getValue();
		reportParam.setReportId(report.getReportId());
		return this.sysJreportParamService.insert(reportParam);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> deleteParam(TbSysJreportParam reportParam) throws ServiceException {
		if (reportParam==null || super.isBlank(reportParam.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		return this.sysJreportParamService.delete(reportParam);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemMenuLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemMenuLogicServiceImpl; has 4 detected methods; depends on 15 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemMenuLogicServiceImpl extends BaseLogicService implements ISystemMenuLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.model.ZeroKeyProvide`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.ISystemMenuLogicService`, `org.qifu.core.model.MenuItemType`, `org.qifu.core.service.ISysMenuService`, `org.qifu.core.service.ISysProgService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L85 `public Map<String, List<TbSysProg>> findForMenuSettingsEnableAndAll(String folderProgramOid)`
  - L132 `public DefaultResult<Boolean> createOrUpdate(String folderProgramOid, List<String> childProgramOidList)`
  - L175 `private void removeMenuChildData(TbSysMenu parentSysMenu)`
  - L187 `private void createOrUpdate(TbSysMenu parentSysMenu, List<String> childProgramOidList)`
- Main fields:
  - L57 `Logger logger`
  - L59 `ISysProgService<TbSysProg, String> sysProgService`
  - L61 `ISysMenuService<TbSysMenu, String> sysMenuService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemMenuLogicServiceImpl.java`
- Size: 8115 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.model.ZeroKeyProvide;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.ISystemMenuLogicService;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.service.ISysProgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemMenuLogicServiceImpl extends BaseLogicService implements ISystemMenuLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemMenuLogicServiceImpl.class);
	
	private final ISysProgService<TbSysProg, String> sysProgService;
	
	private final ISysMenuService<TbSysMenu, String> sysMenuService;
	
	public SystemMenuLogicServiceImpl(ISysProgService<TbSysProg, String> sysProgService,
			ISysMenuService<TbSysMenu, String> sysMenuService) {
		super();
		this.sysProgService = sysProgService;
		this.sysMenuService = sysMenuService;
	}

	/**
	 * 找出選單設定功能要的
	 * 已在選單的程式 與 同SYS的程式
	 * 
	 * map 中的  key 
	 * enable	- 已在選單的程式
	 * all	- 同SYS的程式
	 * 
	 * @param folderProgramOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.SELECT)
	@Override
	public Map<String, List<TbSysProg>> findForMenuSettingsEnableAndAll(String folderProgramOid) throws ServiceException {
		if (StringUtils.isBlank(folderProgramOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysProg> spResult = this.sysProgService.selectByPrimaryKey(folderProgramOid);
		if (spResult.getValue()==null) {
			throw new ServiceException(spResult.getMessage());
		}
		TbSysProg sysProg = spResult.getValue();
		Map<String, List<TbSysProg>> dataMap = new HashMap<>();
		TbSysMenu sysMenu = new TbSysMenu();
		List<TbSysProg> enableList = null;
		List<TbSysProg> allList = null;
		sysMenu.setProgId(sysProg.getProgId());
		sysMenu.setParentOid(ZeroKeyProvide.OID_KEY);
		DefaultResult<TbSysMenu> smResult = this.sysMenuService.selectByUniqueKey(sysMenu);
		if (smResult.getValue()!=null) {
			sysMenu = smResult.getValue();						
			enableList = this.sysProgService.findForInTheFolderMenuItems(sysProg.getProgSystem(), sysMenu.getOid(), MenuItemType.ITEM);
		}
		allList = this.sysProgService.findForSystemItems(sysProg.getProgSystem());
		if (enableList==null) {
			enableList = new ArrayList<>();
		}
		if (allList==null) {
			allList = new ArrayList<>();
		}
		dataMap.put("enable", enableList);
		dataMap.put("all", allList);
		return dataMap;
	}
	
	/**
	 * 更新或是新增 TB_SYS_MENU 資料
	 * 
	 * @param folderProgramOid
	 * @param childProgramOidList
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = {ServiceMethodType.INSERT, ServiceMethodType.UPDATE})
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> createOrUpdate(String folderProgramOid, List<String> childProgramOidList) throws ServiceException {
		if (StringUtils.isBlank(folderProgramOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<Boolean> result = new DefaultResult<>();
		result.setValue(false);
		result.setMessage( BaseSystemMessage.updateFail() );
		
		// 找 TB_SYS_PROG 資料
		DefaultResult<TbSysProg> spResult = this.sysProgService.selectByPrimaryKey(folderProgramOid);
		if (spResult.getValue()==null) {
			throw new ServiceException(spResult.getMessage());
		}
		TbSysProg sysProg = spResult.getValue();
		
		// 找出 TB_SYS_MENU 原資料 , 沒有資料就是新增
		TbSysMenu sysMenu = new TbSysMenu();
		sysMenu.setProgId(sysProg.getProgId());
		sysMenu.setParentOid(ZeroKeyProvide.OID_KEY);
		if (this.sysMenuService.countByUK(sysMenu)>0) { // update 更新
			DefaultResult<TbSysMenu> smResult = this.sysMenuService.selectByUniqueKey(sysMenu);
			if (smResult.getValue()==null) {
				throw new ServiceException(smResult.getMessage());
			}
			sysMenu = smResult.getValue();
		} else { // create new 新產
			sysMenu.setProgId(sysProg.getProgId());
			sysMenu.setParentOid(ZeroKeyProvide.OID_KEY);
			sysMenu.setEnableFlag(YesNoKeyProvide.YES);
			DefaultResult<TbSysMenu> smResult = this.sysMenuService.insert(sysMenu);
			if (smResult.getValue()==null) {
				throw new ServiceException(smResult.getMessage());
			}
			sysMenu = smResult.getValue();
		}
		
		this.removeMenuChildData(sysMenu);
		this.createOrUpdate(sysMenu, childProgramOidList);		
		result.setValue(true);
		result.setMessage(BaseSystemMessage.updateSuccess());
		return result;
	}	
	
	private void removeMenuChildData(TbSysMenu parentSysMenu) throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("parentOid", parentSysMenu.getOid());
		DefaultResult<List<TbSysMenu>> sysMenuResult = this.sysMenuService.selectListByParams(paramMap);
		if (sysMenuResult == null || CollectionUtils.isEmpty(sysMenuResult.getValue())) {
			return;
		}
		for (TbSysMenu childSysMenu : sysMenuResult.getValue()) {
			this.sysMenuService.delete(childSysMenu);			
		}
	}
	
	private void createOrUpdate(TbSysMenu parentSysMenu, List<String> childProgramOidList) throws ServiceException {
		for (String progOid : childProgramOidList) {
			DefaultResult<TbSysProg> spResult = this.sysProgService.selectByPrimaryKey(progOid);
			if (spResult.getValue()==null) {
				throw new ServiceException(spResult.getMessage());
			}
			TbSysProg sysProg = spResult.getValue();			
			if ("CORE_PROG999D9999Q".equals(sysProg.getProgId())) { // CORE_PROG999D9999Q program is About page.
				throw new ServiceException("The program - CORE_PROG999D9999Q cannot settings.");
			}			
			TbSysMenu childSysMenu = new TbSysMenu();
			childSysMenu.setProgId(sysProg.getProgId());
			childSysMenu.setParentOid(parentSysMenu.getOid());
			childSysMenu.setEnableFlag(YesNoKeyProvide.YES);
			DefaultResult<TbSysMenu> result = this.sysMenuService.insert(childSysMenu);
			if (result.getValue()==null) {
				throw new ServiceException(result.getMessage());
			}
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemProgramLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemProgramLogicServiceImpl; has 3 detected methods; depends on 18 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemProgramLogicServiceImpl extends BaseLogicService implements ISystemProgramLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSys`, `org.qifu.core.entity.TbSysIcon`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.entity.TbSysMenuRole`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.ISystemProgramLogicService`, `org.qifu.core.service.ISysIconService`, `org.qifu.core.service.ISysMenuRoleService`, `org.qifu.core.service.ISysMenuService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.service.ISysService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L97 `public DefaultResult<TbSysProg> create(TbSysProg sysProg, String sysOid, String iconOid)`
  - L133 `public DefaultResult<TbSysProg> update(TbSysProg sysProg, String sysOid, String iconOid)`
  - L170 `public DefaultResult<Boolean> delete(TbSysProg sysProg)`
- Main fields:
  - L58 `Logger logger`
  - L60 `ISysIconService<TbSysIcon, String> sysIconService`
  - L62 `ISysService<TbSys, String> sysService`
  - L64 `ISysProgService<TbSysProg, String> sysProgService`
  - L66 `ISysMenuService<TbSysMenu, String> sysMenuService`
  - L68 `ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemProgramLogicServiceImpl.java`
- Size: 7343 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSys;
import org.qifu.core.entity.TbSysIcon;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.entity.TbSysMenuRole;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.ISystemProgramLogicService;
import org.qifu.core.service.ISysIconService;
import org.qifu.core.service.ISysMenuRoleService;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.service.ISysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemProgramLogicServiceImpl extends BaseLogicService implements ISystemProgramLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemProgramLogicServiceImpl.class);
	
	private final ISysIconService<TbSysIcon, String> sysIconService;
	
	private final ISysService<TbSys, String> sysService;
	
	private final ISysProgService<TbSysProg, String> sysProgService;
	
	private final ISysMenuService<TbSysMenu, String> sysMenuService;
	
	private final ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService;	
	
	public SystemProgramLogicServiceImpl(ISysIconService<TbSysIcon, String> sysIconService,
			ISysService<TbSys, String> sysService, ISysProgService<TbSysProg, String> sysProgService,
			ISysMenuService<TbSysMenu, String> sysMenuService,
			ISysMenuRoleService<TbSysMenuRole, String> sysMenuRoleService) {
		super();
		this.sysIconService = sysIconService;
		this.sysService = sysService;
		this.sysProgService = sysProgService;
		this.sysMenuService = sysMenuService;
		this.sysMenuRoleService = sysMenuRoleService;
	}

	/**
	 * 產生 TB_SYS_PROG 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysProg> create(TbSysProg sysProg, String sysOid, String iconOid) throws ServiceException {
		TbSys sys = new TbSys();
		sys.setOid(sysOid);
		DefaultResult<TbSys> sysResult = this.sysService.selectByEntityPrimaryKey(sys);
		if (sysResult.getValue()==null) {
			throw new ServiceException(sysResult.getMessage());
		}
		sys = sysResult.getValue();
		TbSysIcon sysIcon = new TbSysIcon();
		sysIcon.setOid(iconOid);
		DefaultResult<TbSysIcon> iconResult = this.sysIconService.selectByEntityPrimaryKey(sysIcon);
		if (iconResult.getValue()==null) {
			throw new ServiceException(iconResult.getMessage());
		}	
		sysIcon = iconResult.getValue();
		sysProg.setProgSystem(sys.getSysId());
		sysProg.setIcon(sysIcon.getIconId());		
		return this.sysProgService.insert(sysProg);
	}

	/**
	 * 更新 TB_SYS_PROG 資料
	 * 
	 * @param sysProg
	 * @param sysOid
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbSysProg> update(TbSysProg sysProg, String sysOid, String iconOid) throws ServiceException {
		if (sysProg==null || StringUtils.isBlank(sysProg.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TbSys sys = new TbSys();
		sys.setOid(sysOid);
		DefaultResult<TbSys> sysResult = this.sysService.selectByEntityPrimaryKey(sys);
		if (sysResult.getValue()==null) {
			throw new ServiceException(sysResult.getMessage());
		}
		sys = sysResult.getValue();
		TbSysIcon sysIcon = new TbSysIcon();
		sysIcon.setOid(iconOid);
		DefaultResult<TbSysIcon> iconResult = this.sysIconService.selectByEntityPrimaryKey(sysIcon);
		if (iconResult.getValue()==null) {
			throw new ServiceException(iconResult.getMessage());
		}		
		sysIcon = iconResult.getValue();
		sysProg.setProgSystem(sys.getSysId());
		sysProg.setIcon(sysIcon.getIconId());			
		return this.sysProgService.update(sysProg);
	}
	
	/**
	 * 刪除 TB_SYS_PROG 資料
	 * 
	 * @param sysProg
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> delete(TbSysProg sysProg) throws ServiceException {
		if (sysProg==null || StringUtils.isBlank(sysProg.getOid()) ) {
			throw new ServiceException( BaseSystemMessage.parameterBlank() );
		}		
		DefaultResult<TbSysProg> sysProgResult = this.sysProgService.selectByEntityPrimaryKey(sysProg);
		if (sysProgResult.getValue()==null) {
			throw new ServiceException(sysProgResult.getMessage());
		}
		sysProg = sysProgResult.getValue(); 
		Map<String, Object> params = new HashMap<>();
		params.put("progId", sysProg.getProgId());
		if (this.sysMenuService.count(params)>0) {
			throw new ServiceException(BaseSystemMessage.dataCannotDelete());
		}
		// 刪除 TB_SYS_MENU_ROLE 資料
		DefaultResult<List<TbSysMenuRole>> sysMenuRoleResult = this.sysMenuRoleService.selectListByParams(params);
		List<TbSysMenuRole> sysMenuRoleList = sysMenuRoleResult.getValue();
		for (int i=0; sysMenuRoleList!=null && i<sysMenuRoleList.size(); i++) {
			TbSysMenuRole sysMenuRole = sysMenuRoleList.get(i);
			this.sysMenuRoleService.delete(sysMenuRole);
		}
		return this.sysProgService.delete(sysProg);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/impl/SystemTemplateLogicServiceImpl.java`

- Purpose: Service or business logic; declares class SystemTemplateLogicServiceImpl; has 5 detected methods; depends on 13 org.qifu local types
- Package: `org.qifu.core.logic.impl`
- Role: Service or business logic
- Main types: `class SystemTemplateLogicServiceImpl extends BaseLogicService implements ISystemTemplateLogicService`
- Key annotations: `Service`, `ServiceAuthority`, `Transactional`, `ServiceMethodAuthority`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.ServiceAuthority`, `org.qifu.base.model.ServiceMethodAuthority`, `org.qifu.base.model.ServiceMethodType`, `org.qifu.base.service.BaseLogicService`, `org.qifu.core.entity.TbSysTemplate`, `org.qifu.core.entity.TbSysTemplateParam`, `org.qifu.core.logic.ISystemTemplateLogicService`, `org.qifu.core.model.TemplateCode`, `org.qifu.core.service.ISysTemplateParamService`, `org.qifu.core.service.ISysTemplateService`
- Spring dependencies: `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L72 `public DefaultResult<TbSysTemplate> create(TbSysTemplate sysTemplate)`
  - L88 `public DefaultResult<TbSysTemplate> update(TbSysTemplate sysTemplate)`
  - L109 `public DefaultResult<Boolean> delete(TbSysTemplate sysTemplate)`
  - L136 `public DefaultResult<TbSysTemplateParam> createParam(TbSysTemplateParam sysTemplateParam, String templateOid)`
  - L155 `public DefaultResult<Boolean> deleteParam(TbSysTemplateParam sysTemplateParam)`
- Main fields:
  - L52 `Logger logger`
  - L53 `int MAX_MESSAGE_LENGTH`
  - L55 `ISysTemplateService<TbSysTemplate, String> sysTemplateService`
  - L57 `ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\impl\SystemTemplateLogicServiceImpl.java`
- Size: 7131 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.entity.TbSysTemplateParam;
import org.qifu.core.logic.ISystemTemplateLogicService;
import org.qifu.core.model.TemplateCode;
import org.qifu.core.service.ISysTemplateParamService;
import org.qifu.core.service.ISysTemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemTemplateLogicServiceImpl extends BaseLogicService implements ISystemTemplateLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemTemplateLogicServiceImpl.class);
	private static final int MAX_MESSAGE_LENGTH = 4000;
	
	private final ISysTemplateService<TbSysTemplate, String> sysTemplateService;
	
	private final ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService;
	
	public SystemTemplateLogicServiceImpl(ISysTemplateService<TbSysTemplate, String> sysTemplateService,
			ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService) {
		super();
		this.sysTemplateService = sysTemplateService;
		this.sysTemplateParamService = sysTemplateParamService;
	}

	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysTemplate> create(TbSysTemplate sysTemplate) throws ServiceException {
		if (sysTemplate==null) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		if (super.defaultString(sysTemplate.getMessage()).length() > MAX_MESSAGE_LENGTH ) {
			throw new ServiceException("Content max only " + MAX_MESSAGE_LENGTH + " words!");
		}
		return sysTemplateService.insert(sysTemplate);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )				
	@Override
	public DefaultResult<TbSysTemplate> update(TbSysTemplate sysTemplate) throws ServiceException {
		if (sysTemplate==null || super.isBlank(sysTemplate.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		if (super.defaultString(sysTemplate.getMessage()).length() > MAX_MESSAGE_LENGTH ) {
			throw new ServiceException("Content max only " + MAX_MESSAGE_LENGTH + " words!");
		}		
		DefaultResult<TbSysTemplate> oldResult = this.sysTemplateService.selectByEntityPrimaryKey(sysTemplate);
		if (oldResult.getValue()==null) {
			throw new ServiceException(oldResult.getMessage());
		}
		sysTemplate.setTemplateId( oldResult.getValue().getTemplateId() );		
		return sysTemplateService.update(sysTemplate);
	}	
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSysTemplate sysTemplate) throws ServiceException {
		if (sysTemplate==null || super.isBlank(sysTemplate.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysTemplate> oldResult = this.sysTemplateService.selectByEntityPrimaryKey(sysTemplate);
		if (oldResult.getValue()==null) {
			throw new ServiceException(oldResult.getMessage());
		}
		sysTemplate = oldResult.getValue();
		if (TemplateCode.isUsed(sysTemplate.getTemplateId())) {
			throw new ServiceException(BaseSystemMessage.dataCannotDelete());
		}
		Map<String, Object> params = new HashMap<>();
		params.put("templateId", sysTemplate.getTemplateId());
		DefaultResult<List<TbSysTemplateParam>> templateParamListResult = this.sysTemplateParamService.selectListByParams(params);
		for (int i=0; templateParamListResult.getValue() !=null && i < templateParamListResult.getValue().size(); i++) {
			this.sysTemplateParamService.delete(templateParamListResult.getValue().get(i));
		}
		return this.sysTemplateService.delete(sysTemplate);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<TbSysTemplateParam> createParam(TbSysTemplateParam sysTemplateParam, String templateOid) throws ServiceException {
		if (sysTemplateParam==null || super.isBlank(templateOid) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysTemplate> mResult = this.sysTemplateService.selectByPrimaryKey(templateOid);
		if (mResult.getValue()==null) {
			throw new ServiceException(mResult.getMessage());
		}
		TbSysTemplate sysTemplate = mResult.getValue();
		sysTemplateParam.setTemplateId(sysTemplate.getTemplateId());
		return this.sysTemplateParamService.insert(sysTemplateParam);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> deleteParam(TbSysTemplateParam sysTemplateParam) throws ServiceException {
		if (sysTemplateParam==null || super.isBlank(sysTemplateParam.getOid()) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		return this.sysTemplateParamService.delete(sysTemplateParam);
	}	
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/IRoleLogicService.java`

- Purpose: Java class; declares interface IRoleLogicService; has 12 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface IRoleLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbRole`, `org.qifu.core.entity.TbRolePermission`
- Main methods:
  - L42 `public DefaultResult<TbRole> create(TbRole role)`
  - L52 `public DefaultResult<TbRole> update(TbRole role)`
  - L62 `public DefaultResult<Boolean> delete(TbRole role)`
  - L73 `public DefaultResult<TbRolePermission> createPermission(TbRolePermission permission, String roleOid)`
  - L83 `public DefaultResult<Boolean> deletePermission(TbRolePermission permission)`
  - L97 `public Map<String, List<TbRole>> findForAccountRoleEnableAndAll(String accountOid)`
  - L108 `public DefaultResult<Boolean> updateUserRole(String accountOid, List<String> roles)`
  - L122 `public Map<String, List<TbRole>> findForProgramRoleEnableAndAll(String programOid)`
  - L133 `public DefaultResult<Boolean> updateMenuRole(String progOid, List<String> roles)`
  - L144 `public DefaultResult<TbRole> copyAsNew(String fromRoleOid, TbRole role)`
  - L153 `public String getDefaultUserRole()`
  - L162 `public TbRole getDefaultUserRoleEntity()`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\IRoleLogicService.java`
- Size: 4253 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbRole;
import org.qifu.core.entity.TbRolePermission;

public interface IRoleLogicService {
	
	/**
	 * 建立 TB_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbRole> create(TbRole role) throws ServiceException;
	
	/**
	 * 更新 TB_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbRole> update(TbRole role) throws ServiceException;
	
	/**
	 * 刪除 TB_ROLE, TB_ROLE_PERMISSION, TB_USER_ROLE 資料
	 * 
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> delete(TbRole role) throws ServiceException;
	
	/**
	 * 產生 TB_ROLE_PERMISSION 資料
	 * 
	 * @param permission
	 * @param roleOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbRolePermission> createPermission(TbRolePermission permission, String roleOid) throws ServiceException;
	
	/**
	 * 刪除 TB_ROLE_PERMISSION 資料
	 * 
	 * @param permission
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> deletePermission(TbRolePermission permission) throws ServiceException;
	
	/**
	 * 找出全部的role與某帳戶下的role
	 * 
	 * map 中的  key 
	 * enable	- 帳戶下的role
	 * all	- 所有role
	 * 
	 * @param accountOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public Map<String, List<TbRole>> findForAccountRoleEnableAndAll(String accountOid) throws ServiceException;
	
	/**
	 * 更新帳戶的role
	 * 
	 * @param accountOid
	 * @param roles
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> updateUserRole(String accountOid, List<String> roles) throws ServiceException;
	
	/**
	 * 找出全部的role與某程式menu所屬的role
	 * 
	 * map 中的  key 
	 * enable	- 程式menu的role
	 * all	- 所有role
	 * 
	 * @param programOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public Map<String, List<TbRole>> findForProgramRoleEnableAndAll(String programOid) throws ServiceException;
	
	/**
	 * 更新存在選單中程式的選單所屬 role
	 * 
	 * @param progOid
	 * @param roles
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> updateMenuRole(String progOid, List<String> roles) throws ServiceException;
	
	/**
	 * 拷備一份role
	 * 
	 * @param fromRoleOid
	 * @param role
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbRole> copyAsNew(String fromRoleOid, TbRole role) throws ServiceException;
	
	/**
	 * 使用者設的role-id(角色), 它設定在 tb_sys_code中
	 * 
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public String getDefaultUserRole() throws ServiceException;
	
	/**
	 * 使用者設的role(角色), 它設定在 tb_sys_code中
	 * 
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public TbRole getDefaultUserRoleEntity() throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemBeanHelpLogicService.java`

- Purpose: Java class; declares interface ISystemBeanHelpLogicService; depends on 5 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemBeanHelpLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysBeanHelp`, `org.qifu.core.entity.TbSysBeanHelpExpr`, `org.qifu.core.entity.TbSysBeanHelpExprMap`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemBeanHelpLogicService.java`
- Size: 1919 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysBeanHelp;
import org.qifu.core.entity.TbSysBeanHelpExpr;
import org.qifu.core.entity.TbSysBeanHelpExprMap;

public interface ISystemBeanHelpLogicService {
	
	DefaultResult<TbSysBeanHelp> create(TbSysBeanHelp beanHelp, String systemOid) throws ServiceException;
	
	DefaultResult<TbSysBeanHelp> update(TbSysBeanHelp beanHelp, String systemOid) throws ServiceException;
	
	DefaultResult<Boolean> delete(TbSysBeanHelp beanHelp) throws ServiceException;
	
	DefaultResult<TbSysBeanHelpExpr> createExpr(TbSysBeanHelpExpr beanHelpExpr, String helpOid, String expressionOid) throws ServiceException;
	
	DefaultResult<Boolean> deleteExpr(TbSysBeanHelpExpr beanHelpExpr) throws ServiceException;
	
	DefaultResult<TbSysBeanHelpExprMap> createExprMap(TbSysBeanHelpExprMap beanHelpExprMap, String helpExprOid) throws ServiceException;
	
	DefaultResult<Boolean> deleteExprMap(TbSysBeanHelpExprMap beanHelpExprMap) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemExpressionLogicService.java`

- Purpose: Java class; declares interface ISystemExpressionLogicService; has 6 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemExpressionLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.entity.TbSysExpression`
- Main methods:
  - L31 `public DefaultResult<TbSysExpression> create(TbSysExpression expression)`
  - L33 `public DefaultResult<TbSysExpression> update(TbSysExpression expression)`
  - L35 `public DefaultResult<Boolean> delete(TbSysExpression expression)`
  - L37 `public DefaultResult<TbSysExprJob> createJob(TbSysExprJob exprJob, String systemOid, String expressionOid)`
  - L39 `public DefaultResult<TbSysExprJob> updateJob(TbSysExprJob exprJob, String systemOid, String expressionOid)`
  - L41 `public DefaultResult<Boolean> deleteJob(TbSysExprJob exprJob)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemExpressionLogicService.java`
- Size: 1751 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.entity.TbSysExpression;

public interface ISystemExpressionLogicService {
	
	public DefaultResult<TbSysExpression> create(TbSysExpression expression) throws ServiceException;
	
	public DefaultResult<TbSysExpression> update(TbSysExpression expression) throws ServiceException;
	
	public DefaultResult<Boolean> delete(TbSysExpression expression) throws ServiceException;
	
	public DefaultResult<TbSysExprJob> createJob(TbSysExprJob exprJob, String systemOid, String expressionOid) throws ServiceException;
	
	public DefaultResult<TbSysExprJob> updateJob(TbSysExprJob exprJob, String systemOid, String expressionOid) throws ServiceException;
	
	public DefaultResult<Boolean> deleteJob(TbSysExprJob exprJob) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemJreportLogicService.java`

- Purpose: Java class; declares interface ISystemJreportLogicService; has 5 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemJreportLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysJreport`, `org.qifu.core.entity.TbSysJreportParam`
- Main methods:
  - L31 `public DefaultResult<TbSysJreport> create(TbSysJreport report)`
  - L33 `public DefaultResult<TbSysJreport> update(TbSysJreport report)`
  - L35 `public DefaultResult<Boolean> delete(TbSysJreport report)`
  - L37 `public DefaultResult<TbSysJreportParam> createParam(TbSysJreportParam reportParam, String reportOid)`
  - L39 `public DefaultResult<Boolean> deleteParam(TbSysJreportParam reportParam)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemJreportLogicService.java`
- Size: 1592 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;

public interface ISystemJreportLogicService {
	
	public DefaultResult<TbSysJreport> create(TbSysJreport report) throws ServiceException; 
	
	public DefaultResult<TbSysJreport> update(TbSysJreport report) throws ServiceException;
	
	public DefaultResult<Boolean> delete(TbSysJreport report) throws ServiceException;
	
	public DefaultResult<TbSysJreportParam> createParam(TbSysJreportParam reportParam, String reportOid) throws ServiceException;
	
	public DefaultResult<Boolean> deleteParam(TbSysJreportParam reportParam) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemMenuLogicService.java`

- Purpose: Java class; declares interface ISystemMenuLogicService; has 2 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemMenuLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysProg`
- Main methods:
  - L46 `public Map<String, List<TbSysProg>> findForMenuSettingsEnableAndAll(String folderProgramOid)`
  - L57 `public DefaultResult<Boolean> createOrUpdate(String folderProgramOid, List<String> childProgramOidList)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemMenuLogicService.java`
- Size: 1810 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysProg;

public interface ISystemMenuLogicService {
	
	/**
	 * 找出選單設定功能要的
	 * 已在選單的程式 與 同SYS的程式
	 * 
	 * map 中的  key 
	 * enable	- 已在選單的程式
	 * all	- 同SYS的程式
	 * 
	 * @param folderProgramOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public Map<String, List<TbSysProg>> findForMenuSettingsEnableAndAll(String folderProgramOid) throws ServiceException;
	
	/**
	 * 更新或是新增 TB_SYS_MENU 資料
	 * 
	 * @param folderProgramOid
	 * @param childProgramOidList
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> createOrUpdate(String folderProgramOid, List<String> childProgramOidList) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemProgramLogicService.java`

- Purpose: Java class; declares interface ISystemProgramLogicService; has 3 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemProgramLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysProg`
- Main methods:
  - L39 `public DefaultResult<TbSysProg> create(TbSysProg sysProg, String sysOid, String iconOid)`
  - L51 `public DefaultResult<TbSysProg> update(TbSysProg sysProg, String sysOid, String iconOid)`
  - L61 `public DefaultResult<Boolean> delete(TbSysProg sysProg)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemProgramLogicService.java`
- Size: 1816 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysProg;

public interface ISystemProgramLogicService {
	
	/**
	 * 產生 TB_SYS_PROG 資料
	 * 
	 * @param sys
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSysProg> create(TbSysProg sysProg, String sysOid, String iconOid) throws ServiceException;
	
	/**
	 * 更新 TB_SYS_PROG 資料
	 * 
	 * @param sysProg
	 * @param sysOid
	 * @param iconOid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSysProg> update(TbSysProg sysProg, String sysOid, String iconOid) throws ServiceException;
	
	/**
	 * 刪除 TB_SYS_PROG 資料
	 * 
	 * @param sysProg
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> delete(TbSysProg sysProg) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/logic/ISystemTemplateLogicService.java`

- Purpose: Java class; declares interface ISystemTemplateLogicService; has 5 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.logic`
- Role: Java class
- Main types: `interface ISystemTemplateLogicService`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysTemplate`, `org.qifu.core.entity.TbSysTemplateParam`
- Main methods:
  - L31 `public DefaultResult<TbSysTemplate> create(TbSysTemplate sysTemplate)`
  - L33 `public DefaultResult<TbSysTemplate> update(TbSysTemplate sysTemplate)`
  - L35 `public DefaultResult<Boolean> delete(TbSysTemplate sysTemplate)`
  - L37 `public DefaultResult<TbSysTemplateParam> createParam(TbSysTemplateParam sysTemplateParam, String templateOid)`
  - L39 `public DefaultResult<Boolean> deleteParam(TbSysTemplateParam sysTemplateParam)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\logic\ISystemTemplateLogicService.java`
- Size: 1629 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.logic;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.entity.TbSysTemplateParam;

public interface ISystemTemplateLogicService {

	public DefaultResult<TbSysTemplate> create(TbSysTemplate sysTemplate) throws ServiceException;
	
	public DefaultResult<TbSysTemplate> update(TbSysTemplate sysTemplate) throws ServiceException;
	
	public DefaultResult<Boolean> delete(TbSysTemplate sysTemplate) throws ServiceException;
	
	public DefaultResult<TbSysTemplateParam> createParam(TbSysTemplateParam sysTemplateParam, String templateOid) throws ServiceException;
	
	public DefaultResult<Boolean> deleteParam(TbSysTemplateParam sysTemplateParam) throws ServiceException;	
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/DB1Config.java`

- Purpose: MyBatis mapper; declares interface DB1Config
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface DB1Config`
- Key annotations: `Mapper`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\DB1Config.java`
- Size: 194 bytes

#### Source

````java
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * 這是引入共用設定的 Mapper 不需要加 Method
 */
@Mapper
public interface DB1Config {

}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbAccountMapper.java`

- Purpose: MyBatis mapper; declares interface TbAccountMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbAccountMapper extends IBaseMapper<TbAccount, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbAccount`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbAccountMapper.java`
- Size: 1048 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbAccount;

@Mapper
public interface TbAccountMapper extends IBaseMapper<TbAccount, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbRoleMapper.java`

- Purpose: MyBatis mapper; declares interface TbRoleMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbRoleMapper extends IBaseMapper<TbRole, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbRole`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbRoleMapper.java`
- Size: 1659 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbRole;

@Mapper
public interface TbRoleMapper extends IBaseMapper<TbRole, String> {
	
	/**
	 * 查某隻程式屬於的role
	 * 
	 * select OID, ROLE, DESCRIPTION from tb_role where ROLE in (
	 * 		select ROLE from tb_sys_menu_role WHERE PROG_ID = :progId 
	 * )
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<TbRole> findForProgram(Map<String, Object> paramMap);
	
	/**
	 * 查帳戶下有的 role
	 * SELECT * from tb_role 
	 * WHERE ROLE in (	
	 * 		select ROLE from tb_user_role WHERE ACCOUNT = :account
	 * )
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<TbRole> findForAccount(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbRolePermissionMapper.java`

- Purpose: MyBatis mapper; declares interface TbRolePermissionMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbRolePermissionMapper extends IBaseMapper<TbRolePermission, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbRolePermission`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbRolePermissionMapper.java`
- Size: 1069 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbRolePermission;

@Mapper
public interface TbRolePermissionMapper extends IBaseMapper<TbRolePermission, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpExprMapMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysBeanHelpExprMapMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysBeanHelpExprMapMapper extends IBaseMapper<TbSysBeanHelpExprMap, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysBeanHelpExprMap`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysBeanHelpExprMapMapper.java`
- Size: 1081 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysBeanHelpExprMap;

@Mapper
public interface TbSysBeanHelpExprMapMapper extends IBaseMapper<TbSysBeanHelpExprMap, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpExprMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysBeanHelpExprMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysBeanHelpExprMapper extends IBaseMapper<TbSysBeanHelpExpr, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysBeanHelpExpr`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysBeanHelpExprMapper.java`
- Size: 1072 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysBeanHelpExpr;

@Mapper
public interface TbSysBeanHelpExprMapper extends IBaseMapper<TbSysBeanHelpExpr, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysBeanHelpMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysBeanHelpMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysBeanHelpMapper extends IBaseMapper<TbSysBeanHelp, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysBeanHelp`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysBeanHelpMapper.java`
- Size: 1060 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysBeanHelp;

@Mapper
public interface TbSysBeanHelpMapper extends IBaseMapper<TbSysBeanHelp, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysCodeMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysCodeMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysCodeMapper extends IBaseMapper<TbSysCode, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysCode`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysCodeMapper.java`
- Size: 1048 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysCode;

@Mapper
public interface TbSysCodeMapper extends IBaseMapper<TbSysCode, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysEventLogMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysEventLogMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysEventLogMapper extends IBaseMapper<TbSysEventLog, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysEventLog`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysEventLogMapper.java`
- Size: 1210 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysEventLog;

@Mapper
public interface TbSysEventLogMapper extends IBaseMapper<TbSysEventLog, String> {
	
	public Boolean deleteAll(Map<String, Object> paramMap);
	
	public Boolean deleteByDate(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysExpressionMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysExpressionMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysExpressionMapper extends IBaseMapper<TbSysExpression, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysExpression`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysExpressionMapper.java`
- Size: 1761 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysExpression;

@Mapper
public interface TbSysExpressionMapper extends IBaseMapper<TbSysExpression, String> {
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public List<TbSysExpression> selectListByParamsSimple(Map<String, Object> paramMap);
	
	/**
	 * for work with findPageSimple
	 * 
	 * @param paramMap
	 * @return
	 */
	public Long countPageSimple(Map<String, Object> paramMap);
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<TbSysExpression> findPageSimple(Map<String, Object> paramMap);	
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysExprJobLogMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysExprJobLogMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysExprJobLogMapper extends IBaseMapper<TbSysExprJobLog, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysExprJobLog`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysExprJobLogMapper.java`
- Size: 1152 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysExprJobLog;

@Mapper
public interface TbSysExprJobLogMapper extends IBaseMapper<TbSysExprJobLog, String> {
	
	public Boolean deleteAll(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysExprJobMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysExprJobMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysExprJobMapper extends IBaseMapper<TbSysExprJob, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysExprJob`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysExprJobMapper.java`
- Size: 1057 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysExprJob;

@Mapper
public interface TbSysExprJobMapper extends IBaseMapper<TbSysExprJob, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysIconMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysIconMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysIconMapper extends IBaseMapper<TbSysIcon, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysIcon`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysIconMapper.java`
- Size: 1048 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysIcon;

@Mapper
public interface TbSysIconMapper extends IBaseMapper<TbSysIcon, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysJreportMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysJreportMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysJreportMapper extends IBaseMapper<TbSysJreport, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysJreport`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysJreportMapper.java`
- Size: 1827 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysJreport;

@Mapper
public interface TbSysJreportMapper extends IBaseMapper<TbSysJreport, String> {
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param oid
	 * @return
	 * @throws Exception
	 */
	public TbSysJreport selectByPrimaryKeySimple(String oid);
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public List<TbSysJreport> selectListByParamsSimple(Map<String, Object> paramMap);
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param paramMap
	 * @return
	 */
	public List<TbSysJreport> findPageSimple(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysJreportParamMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysJreportParamMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysJreportParamMapper extends IBaseMapper<TbSysJreportParam, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysJreportParam`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysJreportParamMapper.java`
- Size: 1072 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysJreportParam;

@Mapper
public interface TbSysJreportParamMapper extends IBaseMapper<TbSysJreportParam, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysLoginLogMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysLoginLogMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysLoginLogMapper extends IBaseMapper<TbSysLoginLog, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysLoginLog`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysLoginLogMapper.java`
- Size: 1210 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysLoginLog;

@Mapper
public interface TbSysLoginLogMapper extends IBaseMapper<TbSysLoginLog, String> {
	
	public Boolean deleteAll(Map<String, Object> paramMap);
	
	public Boolean deleteByDate(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysMailHelperMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysMailHelperMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysMailHelperMapper extends IBaseMapper<TbSysMailHelper, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysMailHelper`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysMailHelperMapper.java`
- Size: 1262 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysMailHelper;

@Mapper
public interface TbSysMailHelperMapper extends IBaseMapper<TbSysMailHelper, String> {
	
	public String findForMaxMailId(Map<String, Object> paramMap);
	
	public List<TbSysMailHelper> findForJobList(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysMapper extends IBaseMapper<TbSys, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSys`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysMapper.java`
- Size: 1036 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSys;

@Mapper
public interface TbSysMapper extends IBaseMapper<TbSys, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysMenuMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysMenuMapper; depends on 3 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysMenuMapper extends IBaseMapper<TbSysMenu, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.vo.SysMenuVO`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysMenuMapper.java`
- Size: 1215 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.vo.SysMenuVO;

@Mapper
public interface TbSysMenuMapper extends IBaseMapper<TbSysMenu, String> {
	
	public List<SysMenuVO> selectForMenuGenerator(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysMenuRoleMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysMenuRoleMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysMenuRoleMapper extends IBaseMapper<TbSysMenuRole, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysMenuRole`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysMenuRoleMapper.java`
- Size: 1060 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysMenuRole;

@Mapper
public interface TbSysMenuRoleMapper extends IBaseMapper<TbSysMenuRole, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysProgMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysProgMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysProgMapper extends IBaseMapper<TbSysProg, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysProg`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysProgMapper.java`
- Size: 1401 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysProg;

@Mapper
public interface TbSysProgMapper extends IBaseMapper<TbSysProg, String> {
	
	/**
	 * 找在選單中(FOLDER) 之下已存在的項目
	 * 
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public List<TbSysProg> findForInTheFolderMenuItems(Map<String, Object> paramMap);
	
	public List<TbSysProg> findForInThePermRoleOfUserId(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysQfieldLogMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysQfieldLogMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysQfieldLogMapper extends IBaseMapper<TbSysQfieldLog, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysQfieldLog`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysQfieldLogMapper.java`
- Size: 1063 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysQfieldLog;

@Mapper
public interface TbSysQfieldLogMapper extends IBaseMapper<TbSysQfieldLog, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysTemplateMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysTemplateMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysTemplateMapper extends IBaseMapper<TbSysTemplate, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysTemplate`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysTemplateMapper.java`
- Size: 1060 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysTemplate;

@Mapper
public interface TbSysTemplateMapper extends IBaseMapper<TbSysTemplate, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysTemplateParamMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysTemplateParamMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysTemplateParamMapper extends IBaseMapper<TbSysTemplateParam, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysTemplateParam`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysTemplateParamMapper.java`
- Size: 1075 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysTemplateParam;

@Mapper
public interface TbSysTemplateParamMapper extends IBaseMapper<TbSysTemplateParam, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysTokenMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysTokenMapper; depends on 3 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysTokenMapper extends IBaseMapper<TbSysToken, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysToken`, `org.qifu.core.vo.BoardDemo`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysTokenMapper.java`
- Size: 485 bytes

#### Source

````java
package org.qifu.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.vo.BoardDemo;

@Mapper
public interface TbSysTokenMapper extends IBaseMapper<TbSysToken, String> {
	
	public List<BoardDemo> findCountSizeByDatePerUser(Map<String, Object> param);
	
	public Long countSizeByDate(Map<String, Object> param);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysUploadMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysUploadMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysUploadMapper extends IBaseMapper<TbSysUpload, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysUpload`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysUploadMapper.java`
- Size: 1535 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysUpload;

@Mapper
public interface TbSysUploadMapper extends IBaseMapper<TbSysUpload, String> {
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param oid
	 * @return
	 * @throws Exception
	 */
	public TbSysUpload selectByPrimaryKeySimple(String oid);
	
	/**
	 * 刪除 IS_FILE='N' && CONTENT 欄位放byte 類別為暫存的資料
	 * 
	 * @param paramMap
	 * @return
	 * @throws Exception
	 */
	public boolean deleteTmpContentBySystem(Map<String, Object> paramMap);
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbSysUsessMapper.java`

- Purpose: MyBatis mapper; declares interface TbSysUsessMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbSysUsessMapper extends IBaseMapper<TbSysUsess, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbSysUsess`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbSysUsessMapper.java`
- Size: 1051 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbSysUsess;

@Mapper
public interface TbSysUsessMapper extends IBaseMapper<TbSysUsess, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/mapper/TbUserRoleMapper.java`

- Purpose: MyBatis mapper; declares interface TbUserRoleMapper; depends on 2 org.qifu local types
- Package: `org.qifu.core.mapper`
- Role: MyBatis mapper
- Main types: `interface TbUserRoleMapper extends IBaseMapper<TbUserRole, String>`
- Key annotations: `Mapper`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.core.entity.TbUserRole`
- Third-party dependencies: `org.apache.ibatis.annotations.Mapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\mapper\TbUserRoleMapper.java`
- Size: 1051 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.core.entity.TbUserRole;

@Mapper
public interface TbUserRoleMapper extends IBaseMapper<TbUserRole, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/ExpressionJobConstants.java`

- Purpose: DTO/VO/model; declares class ExpressionJobConstants
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class ExpressionJobConstants`
- Main fields:
  - L29 `String DATEOFWEEK_HOUR_MINUTE_ALL`
  - L34 `String RUNSTATUS_PROCESS_NOW`
  - L39 `String RUNSTATUS_SUCCESS`
  - L44 `String RUNSTATUS_FAULT`
  - L49 `String LOGSTATUS_SUCCESS`
  - L54 `String LOGSTATUS_FAULT`
  - L59 `String LOGSTATUS_NO_EXECUTE`
  - L64 `String CONTACT_MODE_NO`
  - L69 `String CONTACT_MODE_ONLY_FAULT`
  - L74 `String CONTACT_MODE_ONLY_SUCCESS`
  - L79 `String CONTACT_MODE_ALL`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\ExpressionJobConstants.java`
- Size: 2049 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

public class ExpressionJobConstants {
	
	/**
	 * 每次都符合時間的符號
	 */
	public static final String DATEOFWEEK_HOUR_MINUTE_ALL = "*";
	
	/**
	 * R-執行中
	 */
	public static final String RUNSTATUS_PROCESS_NOW = "R";
	
	/**
	 * Y-結束
	 */
	public static final String RUNSTATUS_SUCCESS = "Y";
	
	/**
	 * F-錯誤
	 */
	public static final String RUNSTATUS_FAULT = "F";
	
	/**
	 * Y-成功
	 */
	public static final String LOGSTATUS_SUCCESS = "Y";
	
	/**
	 * F-執行失敗
	 */
	public static final String LOGSTATUS_FAULT = "F";
	
	/**
	 * N-沒有執行expression
	 */
	public static final String LOGSTATUS_NO_EXECUTE = "N";
	
	/**
	 * 0-不通知
	 */
	public static final String CONTACT_MODE_NO = "0";
	
	/**
	 * 1-只有失敗fault時通知
	 */
	public static final String CONTACT_MODE_ONLY_FAULT = "1";
	
	/**
	 * 2-只有成功通知
	 */
	public static final String CONTACT_MODE_ONLY_SUCCESS = "2";
	
	/**
	 * 3-成功/失敗都通知
	 */
	public static final String CONTACT_MODE_ALL = "3";	
	
	protected ExpressionJobConstants() {
		throw new IllegalStateException("Constants class: ExpressionJobConstants");
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/ExpressionJobObj.java`

- Purpose: DTO/VO/model; declares class ExpressionJobObj; has 6 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class ExpressionJobObj implements java.io.Serializable`
- Local dependencies: `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.entity.TbSysExprJobLog`, `org.qifu.core.entity.TbSysExpression`
- Main methods:
  - L45 `public TbSysExpression getSysExpression()`
  - L49 `public void setSysExpression(TbSysExpression sysExpression)`
  - L53 `public TbSysExprJob getSysExprJob()`
  - L57 `public void setSysExprJob(TbSysExprJob sysExprJob)`
  - L61 `public TbSysExprJobLog getSysExprJobLog()`
  - L65 `public void setSysExprJobLog(TbSysExprJobLog sysExprJobLog)`
- Main fields:
  - L29 `long serialVersionUID`
  - L30 `TbSysExpression sysExpression`
  - L31 `TbSysExprJob sysExprJob`
  - L32 `TbSysExprJobLog sysExprJobLog`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\ExpressionJobObj.java`
- Size: 2058 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.entity.TbSysExprJobLog;
import org.qifu.core.entity.TbSysExpression;

public class ExpressionJobObj implements java.io.Serializable {
	private static final long serialVersionUID = 7251297482415387237L;
	private TbSysExpression sysExpression;
	private TbSysExprJob sysExprJob;
	private TbSysExprJobLog sysExprJobLog;
	
	public ExpressionJobObj() {
		
	}
	
	public ExpressionJobObj(TbSysExpression sysExpression, TbSysExprJob sysExprJob, TbSysExprJobLog sysExprJobLog) {
		super();
		this.sysExpression = sysExpression;
		this.sysExprJob = sysExprJob;
		this.sysExprJobLog = sysExprJobLog;
	}

	public TbSysExpression getSysExpression() {
		return sysExpression;
	}

	public void setSysExpression(TbSysExpression sysExpression) {
		this.sysExpression = sysExpression;
	}

	public TbSysExprJob getSysExprJob() {
		return sysExprJob;
	}

	public void setSysExprJob(TbSysExprJob sysExprJob) {
		this.sysExprJob = sysExprJob;
	}

	public TbSysExprJobLog getSysExprJobLog() {
		return sysExprJobLog;
	}

	public void setSysExprJobLog(TbSysExprJobLog sysExprJobLog) {
		this.sysExprJobLog = sysExprJobLog;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/LocaleMessageTemplateMethodModel.java`

- Purpose: DTO/VO/model; declares class LocaleMessageTemplateMethodModel; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class LocaleMessageTemplateMethodModel implements TemplateMethodModelEx`
- Key annotations: `Override`
- Local dependencies: `org.qifu.core.util.LocaleMessageSourceUtils`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `freemarker.template.TemplateMethodModelEx`, `freemarker.template.TemplateModelException`
- Main methods:
  - L35 `public Object exec(List arguments)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\LocaleMessageTemplateMethodModel.java`
- Size: 1393 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.core.util.LocaleMessageSourceUtils;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class LocaleMessageTemplateMethodModel implements TemplateMethodModelEx {
	
	@Override
	public Object exec(List arguments) throws TemplateModelException {
		if (CollectionUtils.isEmpty(arguments)) {
			return "";
		}
		return LocaleMessageSourceUtils.getMessage( String.valueOf(arguments.get(0)) );
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/MailContent.java`

- Purpose: DTO/VO/model; declares class MailContent; has 4 detected methods
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class MailContent`
- Main methods:
  - L12 `public String getSubject()`
  - L15 `public void setSubject(String subject)`
  - L18 `public String getContent()`
  - L21 `public void setContent(String content)`
- Main fields:
  - L4 `String subject`
  - L5 `String content`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\MailContent.java`
- Size: 502 bytes

#### Source

````java
package org.qifu.core.model;

public class MailContent {
	private String subject;
	private String content;
	
	public MailContent(String subject, String content) {
		super();
		this.subject = subject;
		this.content = content;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/MenuItemType.java`

- Purpose: DTO/VO/model; declares class MenuItemType
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class MenuItemType implements java.io.Serializable`
- Main fields:
  - L25 `long serialVersionUID`
  - L30 `String FOLDER`
  - L35 `String ITEM`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\MenuItemType.java`
- Size: 1124 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

public class MenuItemType implements java.io.Serializable {
	private static final long serialVersionUID = -611707319025098617L;

	/**
	 * 目錄類
	 */
	public static final String FOLDER = "FOLDER";
	
	/**
	 * 一般功能項目
	 */
	public static final String ITEM = "ITEM";	
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/PermissionType.java`

- Purpose: DTO/VO/model; declares enum PermissionType
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `enum PermissionType`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\PermissionType.java`
- Size: 118 bytes

#### Source

````java
package org.qifu.core.model;

/*
 * qifu4
 */
public enum PermissionType {
	VIEW, 
	CONTROLLER, 
	SERVICE
}
````

### `backend/core/src/main/java/org/qifu/core/model/ScriptExpressionRunType.java`

- Purpose: DTO/VO/model; declares class ScriptExpressionRunType; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class ScriptExpressionRunType`
- Local dependencies: `org.qifu.base.model.PleaseSelect`
- Main methods:
  - L36 `public boolean isCode(String runType)`
  - L40 `public Map<String, String> getRunTypeMap(boolean pleaseSelect)`
- Main fields:
  - L29 `String IS_AFTER`
  - L30 `String IS_BEFORE`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\ScriptExpressionRunType.java`
- Size: 1561 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

import java.util.Map;

import org.qifu.base.model.PleaseSelect;

public class ScriptExpressionRunType {
	public static final String IS_AFTER = "AFTER";
	public static final String IS_BEFORE = "BEFORE";
	
	protected ScriptExpressionRunType() {
		throw new IllegalStateException("static model class: ScriptExpressionRunType");
	}
	
	public static boolean isCode(String runType) {
		return (IS_AFTER.equals(runType) || IS_BEFORE.equals(runType));
	}
	
	public static Map<String, String> getRunTypeMap(boolean pleaseSelect) {
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		dataMap.put(IS_BEFORE, IS_BEFORE);
		dataMap.put(IS_AFTER, IS_AFTER);
		return dataMap;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/TemplateCode.java`

- Purpose: DTO/VO/model; declares class TemplateCode; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class TemplateCode`
- Local dependencies: `org.qifu.util.SimpleUtils`
- Config keys referenced: `CODE`
- Main methods:
  - L49 `public boolean isUsed(String code)`
- Main fields:
  - L33 `Properties props`
  - L34 `String[] useCode`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\TemplateCode.java`
- Size: 1748 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

import java.io.IOException;
import java.util.Properties;

import org.qifu.util.SimpleUtils;

/**
 * config properties file in META-INF/template-code-use.properties
 */
public class TemplateCode {
	private static Properties props = new Properties();
	private static String[] useCode = null;
	
	protected TemplateCode() {
		throw new IllegalStateException("static model class: TemplateCode");
	}
	
	static {
		try {
			props.load(TemplateCode.class.getClassLoader().getResource("template-code-use.properties").openStream());
			useCode = SimpleUtils.getStr(props.getProperty("CODE")).trim().split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isUsed(String code) {
		boolean f = false;
		for (int i=0; !f && useCode!=null && i<useCode.length; i++) {
			if (useCode[i].equals(code)) {
				f = true;
			}
		}
		return f;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/TemplateResultObj.java`

- Purpose: DTO/VO/model; declares class TemplateResultObj; has 4 detected methods
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class TemplateResultObj implements java.io.Serializable`
- Main methods:
  - L37 `public String getTitle()`
  - L41 `public void setTitle(String title)`
  - L45 `public String getContent()`
  - L49 `public void setContent(String content)`
- Main fields:
  - L25 `long serialVersionUID`
  - L30 `String title`
  - L35 `String content`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\TemplateResultObj.java`
- Size: 1363 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

public class TemplateResultObj implements java.io.Serializable {
	private static final long serialVersionUID = -814945434663377471L;
	
	/**
	 * 標題資料
	 */
	private String title = "";
	
	/**
	 * 內文資料
	 */
	private String content = "";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/UploadTypes.java`

- Purpose: DTO/VO/model; declares class UploadTypes; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class UploadTypes`
- Local dependencies: `org.qifu.base.model.PleaseSelect`
- Main methods:
  - L38 `public Map<String, String> getDataMap(boolean pleaseSelect)`
  - L46 `public boolean check(String type)`
- Main fields:
  - L32 `String[] TYPES`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\UploadTypes.java`
- Size: 1818 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.model;

import java.util.Map;

import org.qifu.base.model.PleaseSelect;

public class UploadTypes {
	public static final String IS_IMAGE = "image"; // 圖片
	public static final String IS_TEMP = "tmp"; // 暫存
	public static final String IS_COMMON = "common"; // 共用
	protected static final String[] TYPES = new String[] { IS_IMAGE, IS_TEMP, IS_COMMON };
	
	protected UploadTypes() {
        throw new IllegalStateException("static model class: UploadTypes");
    }
	
	public static Map<String, String> getDataMap(boolean pleaseSelect) {
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		dataMap.put(IS_TEMP, IS_TEMP);
		dataMap.put(IS_IMAGE, IS_IMAGE);
		dataMap.put(IS_COMMON, IS_COMMON);
		return dataMap;
	}
	
	public static boolean check(String type) {
		boolean f = false;
		for (int i=0; i<UploadTypes.TYPES.length; i++) {
			if (UploadTypes.TYPES[i].equals(type)) {
				f = true;
			}
		}
		return f;
	}	
	
}
````

### `backend/core/src/main/java/org/qifu/core/model/User.java`

- Purpose: DTO/VO/model; declares class User; has 14 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.model`
- Role: DTO/VO/model
- Main types: `class User extends BaseUserInfo implements UserDetails`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.CoreAppConstants`, `org.qifu.base.model.BaseUserInfo`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.UserRoleAndPermission`, `org.qifu.base.model.YesNoKeyProvide`
- Spring dependencies: `org.springframework.security.core.GrantedAuthority`, `org.springframework.security.core.authority.SimpleGrantedAuthority`, `org.springframework.security.core.userdetails.UserDetails`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`
- Main methods:
  - L63 `public List<GrantedAuthority> getAuthorities()`
  - L81 `public String getPassword()`
  - L85 `public void blankPassword()`
  - L90 `public String getUsername()`
  - L95 `public boolean isAccountNonExpired()`
  - L100 `public boolean isAccountNonLocked()`
  - L105 `public boolean isCredentialsNonExpired()`
  - L110 `public boolean isEnabled()`
  - L114 `public List<UserRoleAndPermission> getRoles()`
  - L118 `public void setRoles(List<UserRoleAndPermission> roles)`
  - L122 `public String getOnJob()`
  - L126 `public String getByLdap()`
  - L130 `public void setByLdap(String byLdap)`
  - L134 `public boolean isAdmin()`
- Main fields:
  - L39 `long serialVersionUID`
  - L41 `String username`
  - L42 `String password`
  - L43 `List<UserRoleAndPermission> roles`
  - L44 `String onJob`
  - L45 `String byLdap`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\model\User.java`
- Size: 4424 bytes

#### Source

````java
/*
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * -----------------------------------------------------------------------
 *
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 *
 */
package org.qifu.core.model;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.Constants;
import org.qifu.base.CoreAppConstants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNoKeyProvide;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseUserInfo implements UserDetails {
	private static final long serialVersionUID = 8145283038236989680L;
	
    private String username;
    private String password;
    private List<UserRoleAndPermission> roles;
    private String onJob;
    private String byLdap = YesNoKeyProvide.NO;

    public User(String username, String password, String onJob, List<UserRoleAndPermission> roles) {
        this.username = username;
        this.password = password;
        this.onJob = onJob;
        this.roles = roles;
        this.setUserId( this.username );
    }
    
    public User(String username, String password, String onJob) {
        this.username = username;
        this.password = password;
        this.onJob = onJob;
        this.setUserId( this.username );    	
    }
    
    @Override
    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        if (CollectionUtils.isEmpty(this.roles)) {
        	auths.add( new SimpleGrantedAuthority("ROLE_" + CoreAppConstants.SYS_BLANK_ROLE) );
        	return auths;
        }
        for (UserRoleAndPermission userRoleAndPerm : this.roles) {
            auths.add( new SimpleGrantedAuthority("ROLE_" + userRoleAndPerm.getRole()) );
            if (userRoleAndPerm.getRolePermission() != null) {
            	for (RolePermissionAttr perm : userRoleAndPerm.getRolePermission()) {
            		auths.add( new SimpleGrantedAuthority(perm.getPermission()) );
            	}
            }            
        }
        return auths;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
    
    public void blankPassword() {
    	this.password = "";
    }
    
    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return (YesNoKeyProvide.YES.equals(this.onJob) ? Boolean.TRUE : Boolean.FALSE);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return (YesNoKeyProvide.YES.equals(this.onJob) ? Boolean.TRUE : Boolean.FALSE);
    }
	
	public List<UserRoleAndPermission> getRoles() {
		return roles;
	}
	
	public void setRoles(List<UserRoleAndPermission> roles) {
		this.roles = roles;
	}	
	
	public String getOnJob() {
		return onJob;
	}

	public String getByLdap() {
		return byLdap;
	}

	public void setByLdap(String byLdap) {
		this.byLdap = byLdap;
	}
    
	public boolean isAdmin() {
		boolean f = false;
		for (int i = 0; !f && this.roles != null && i < this.roles.size(); i++) {
			String roleId = this.roles.get(i).getRole();
			if (Constants.SUPER_ROLE_ADMIN.equals(roleId) || Constants.SUPER_ROLE_ALL.equals(roleId)) {
				f = true;
			}
		}
		return f;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/scheduled/ClearSystemLogJob.java`

- Purpose: Spring component, Scheduled job; declares class ClearSystemLogJob; has 1 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.scheduled`
- Role: Spring component, Scheduled job
- Main types: `class ClearSystemLogJob extends BaseScheduledTasksProvide`
- Key annotations: `Component`, `Scheduled`, `Override`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.scheduled.BaseScheduledTasksProvide`, `org.qifu.core.entity.TbSysEventLog`, `org.qifu.core.entity.TbSysLoginLog`, `org.qifu.core.service.ISysEventLogService`, `org.qifu.core.service.ISysLoginLogService`
- Spring dependencies: `org.springframework.scheduling.annotation.Scheduled`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L41 `public void execute()`
- Main fields:
  - L37 `Logger logger`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\scheduled\ClearSystemLogJob.java`
- Size: 2095 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.scheduled;

import org.qifu.base.AppContext;
import org.qifu.base.scheduled.BaseScheduledTasksProvide;
import org.qifu.core.entity.TbSysEventLog;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.service.ISysEventLogService;
import org.qifu.core.service.ISysLoginLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClearSystemLogJob extends BaseScheduledTasksProvide {
	protected static Logger logger = LoggerFactory.getLogger(ClearSystemLogJob.class);
	
	@Scheduled(cron = "1 0 4 * * *")
	@Override
	public void execute() {
		logger.warn("Clear old log.");
		this.login();
		try {
			ISysEventLogService<TbSysEventLog, String> sysEventLogService = (ISysEventLogService<TbSysEventLog, String>) AppContext.getBean(ISysEventLogService.class);
			ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService = (ISysLoginLogService<TbSysLoginLog, String>) AppContext.getBean(ISysLoginLogService.class);
			sysEventLogService.deleteByDate();
			sysLoginLogService.deleteByDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.logout();
		logger.info("fine.");
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/scheduled/ClearTempUploadJob.java`

- Purpose: Spring component, Scheduled job; declares class ClearTempUploadJob; has 1 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.scheduled`
- Role: Spring component, Scheduled job
- Main types: `class ClearTempUploadJob extends BaseScheduledTasksProvide`
- Key annotations: `Component`, `Scheduled`
- Local dependencies: `org.qifu.base.scheduled.BaseScheduledTasksProvide`, `org.qifu.core.util.UploadSupportUtils`
- Spring dependencies: `org.springframework.scheduling.annotation.Scheduled`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L36 `public void execute()`
- Main fields:
  - L33 `Logger logger`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\scheduled\ClearTempUploadJob.java`
- Size: 1568 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.scheduled;

import org.qifu.base.scheduled.BaseScheduledTasksProvide;
import org.qifu.core.util.UploadSupportUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ClearTempUploadJob extends BaseScheduledTasksProvide {
	protected static Logger logger = LoggerFactory.getLogger(ClearTempUploadJob.class);
	
	@Scheduled(cron = "1 0 1 * * *")
	public void execute() {
		logger.warn("Clear upload type is TMP data.");
		this.login();
		try {
			UploadSupportUtils.cleanTempUpload();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.logout();
		logger.info("fine.");
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/scheduled/SendMailHelperJob.java`

- Purpose: Spring component, Scheduled job; declares class SendMailHelperJob, class ProcessWorker; has 7 detected methods; depends on 11 org.qifu local types
- Package: `org.qifu.core.scheduled`
- Role: Spring component, Scheduled job
- Main types: `class SendMailHelperJob extends BaseScheduledTasksProvide`; `class ProcessWorker extends Thread`
- Key annotations: `Component`, `Resource`, `Scheduled`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.scheduled.BaseScheduledTasksProvide`, `org.qifu.core.entity.TbSysMailHelper`, `org.qifu.core.model.MailContent`, `org.qifu.core.service.ISysMailHelperService`, `org.qifu.core.util.MailClientUtils`, `org.qifu.core.util.SystemSettingConfigureUtils`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.mail.MailException`, `org.springframework.scheduling.annotation.Scheduled`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Injection/config points:
  - L59 `@Resource` -> `public void setSysMailHelperService(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService) {`
- Main methods:
  - L55 `public ISysMailHelperService<TbSysMailHelper, String> getSysMailHelperService()`
  - L60 `public void setSysMailHelperService(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService)`
  - L65 `public void execute()`
  - L84 `private void process(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService, List<TbSysMailHelper> mailHelperList)`
  - L107 `public void run()`
  - L136 `private void sendMail()`
  - L146 `private void handleSuccess()`
- Main fields:
  - L51 `Logger log`
  - L53 `ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService`
  - L94 `ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService`
  - L95 `TbSysMailHelper mailHelper`
  - L97 `int RETRY_LIMIT`
  - L98 `boolean success`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\scheduled\SendMailHelperJob.java`
- Size: 6264 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.scheduled;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.scheduled.BaseScheduledTasksProvide;
import org.qifu.core.entity.TbSysMailHelper;
import org.qifu.core.model.MailContent;
import org.qifu.core.service.ISysMailHelperService;
import org.qifu.core.util.MailClientUtils;
import org.qifu.core.util.SystemSettingConfigureUtils;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;

@Component
public class SendMailHelperJob extends BaseScheduledTasksProvide {
	protected static Logger log = LoggerFactory.getLogger(SendMailHelperJob.class);
	
	private ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService;
	
	public ISysMailHelperService<TbSysMailHelper, String> getSysMailHelperService() {
		return sysMailHelperService;
	}
	
	@Resource
	public void setSysMailHelperService(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService) {
		this.sysMailHelperService = sysMailHelperService;
	}

	@Scheduled(initialDelay = 5000, fixedDelay = 180000)
	public void execute() {
		try {
			this.login();
			if (YesNoKeyProvide.YES.equals(SystemSettingConfigureUtils.getMailEnableValue())) {
				String linkMailId = SimpleUtils.getStrYMD("").substring(0, 6);
				DefaultResult<List<TbSysMailHelper>> result = sysMailHelperService.findForJobList(linkMailId);			
				if (result.getValue()!=null) {
					this.process(sysMailHelperService, result.getValue());
				}				
			} else {
				log.warn("************ mail sender is disable. please modify config CNF/CNF_CONF002 ************");				
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} finally {
			this.logout();
		}
	}
	
	private void process(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService, List<TbSysMailHelper> mailHelperList) throws ServiceException {
		if (CollectionUtils.isEmpty(mailHelperList)) {
			return;
		}	
		for (TbSysMailHelper mailHelper : mailHelperList) {
			new ProcessWorker(sysMailHelperService, mailHelper);
		}
	}
	
	private class ProcessWorker extends Thread {
	    private final ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService;
	    private final TbSysMailHelper mailHelper;
	    private static final long SLEEP_TIME = 3000; // 3 seconds
	    private static final int RETRY_LIMIT = 3;
	    private boolean success = false;
	    
	    public ProcessWorker(ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService, TbSysMailHelper mailHelper) {
	        this.sysMailHelperService = sysMailHelperService;
	        this.mailHelper = mailHelper;
	        this.start();
	    }
	    
	    @Override
	    public void run() {
	        int retries = RETRY_LIMIT;
	        while (!success && retries > 0) {
	            if (mailHelper == null) {
	            	break; // Exit if mailHelper is null
	            }
	            try {
	                log.info("Processing mail-id: {}", mailHelper.getMailId());
	                sendMail();
	                success = true;
	            } catch (MailException | UnsupportedEncodingException | MessagingException e) {
	                log.error("Error while sending email for mail-id: {}. Attempt {} of {}", mailHelper.getMailId(), RETRY_LIMIT - retries + 1, RETRY_LIMIT, e);
	            }
	            if (success) {
	                handleSuccess();
	            }
	            retries--;
	            
	            // Sleep between retries
	            try {
	                Thread.sleep(SLEEP_TIME);
	            } catch (InterruptedException e) {
	                log.error("Thread interrupted while sleeping.", e);
	                Thread.currentThread().interrupt();
	                retries = -1;
	            }
	        }
	    }

	    private void sendMail() throws MailException, UnsupportedEncodingException, MessagingException {
	        MailClientUtils.send(
	                mailHelper.getMailFrom(),
	                mailHelper.getMailTo(),
	                mailHelper.getMailCc(),
	                mailHelper.getMailBcc(),
	                new MailContent(mailHelper.getSubject(), new String(mailHelper.getText(), Constants.BASE_ENCODING))
	        );
	    }

	    private void handleSuccess() {
	        try {
	            if (YesNoKeyProvide.YES.equals(mailHelper.getRetainFlag())) {
	                mailHelper.setSuccessFlag(YesNoKeyProvide.YES);
	                mailHelper.setSuccessTime(new Date());
	                sysMailHelperService.update(mailHelper);
	            } else {
	                sysMailHelperService.delete(mailHelper);
	            }
	            log.info("Successfully processed mail-id: {}", mailHelper.getMailId());
	        } catch (ServiceException e) {
	            log.error("Error updating mail record for mail-id: {}", mailHelper.getMailId(), e);
	        }
	    }
	    
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/scheduled/SysExpressionJob.java`

- Purpose: Spring component, Scheduled job; declares class SysExpressionJob; has 2 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.scheduled`
- Role: Spring component, Scheduled job
- Main types: `class SysExpressionJob extends BaseScheduledTasksProvide`
- Key annotations: `Component`, `Scheduled`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.scheduled.BaseScheduledTasksProvide`, `org.qifu.core.util.SystemExpressionJobUtils`
- Spring dependencies: `org.springframework.scheduling.annotation.Scheduled`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L40 `public void execute()`
  - L51 `private void executeJobs()`
- Main fields:
  - L36 `Logger log`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\scheduled\SysExpressionJob.java`
- Size: 1904 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.scheduled;

import java.util.concurrent.ExecutionException;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.scheduled.BaseScheduledTasksProvide;
import org.qifu.core.util.SystemExpressionJobUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SysExpressionJob extends BaseScheduledTasksProvide {
	protected static Logger log = LoggerFactory.getLogger(SysExpressionJob.class);
	
	/* fixedDelay 60000 , do not to modify */
	@Scheduled(initialDelay = 10000, fixedDelay = 60000)
	public void execute() {
		try {
			this.login();
			this.executeJobs();
		} catch (ServiceException e) {
			e.printStackTrace();
		} finally {
			this.logout();		
		}
	}
	
	private void executeJobs() {
		try {
			SystemExpressionJobUtils.executeJobs();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}		
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/IAccountService.java`

- Purpose: Service interface; declares interface IAccountService; has 1 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface IAccountService <T, E> extends IBaseService<TbAccount, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbAccount`
- Main methods:
  - L39 `public Map<String, String> findForAllMap(boolean pleaseSelect)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\IAccountService.java`
- Size: 1282 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbAccount;

public interface IAccountService<T, E> extends IBaseService<TbAccount, String> {
	
	/**
	 * 下拉Select 要用
	 * 
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	public Map<String, String> findForAllMap(boolean pleaseSelect) throws ServiceException; 
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/AccountServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class AccountServiceImpl; has 2 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class AccountServiceImpl extends BaseService<TbAccount, String> implements IAccountService<TbAccount, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.model.PleaseSelect`, `org.qifu.base.model.SortType`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbAccount`, `org.qifu.core.mapper.TbAccountMapper`, `org.qifu.core.service.IAccountService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`
- Main methods:
  - L54 `protected IBaseMapper<TbAccount, String> getBaseMapper()`
  - L62 `public Map<String, String> findForAllMap(boolean pleaseSelect)`
- Main fields:
  - L46 `TbAccountMapper accountMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\AccountServiceImpl.java`
- Size: 2520 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.model.PleaseSelect;
import org.qifu.base.model.SortType;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbAccount;
import org.qifu.core.mapper.TbAccountMapper;
import org.qifu.core.service.IAccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class AccountServiceImpl extends BaseService<TbAccount, String> implements IAccountService<TbAccount, String> {
	
	private final TbAccountMapper accountMapper;

	public AccountServiceImpl(TbAccountMapper accountMapper) {
		super();
		this.accountMapper = accountMapper;
	}

	@Override
	protected IBaseMapper<TbAccount, String> getBaseMapper() {
		return this.accountMapper;
	}

	/**
	 * 下拉Select 要用
	 */
	@Override
	public Map<String, String> findForAllMap(boolean pleaseSelect) throws ServiceException {
		List<TbAccount> searchList = this.selectList("ACCOUNT", SortType.ASC).getValue();
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		if (CollectionUtils.isEmpty(searchList)) {
			return dataMap;
		}
		for (TbAccount account : searchList) {
			dataMap.put(account.getOid(), account.getAccount());
		}
		return dataMap;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/RolePermissionServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class RolePermissionServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class RolePermissionServiceImpl extends BaseService<TbRolePermission, String> implements IRolePermissionService<TbRolePermission, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.mapper.TbRolePermissionMapper`, `org.qifu.core.service.IRolePermissionService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbRolePermission, String> getBaseMapper()`
- Main fields:
  - L39 `TbRolePermissionMapper tbRolePermissionMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\RolePermissionServiceImpl.java`
- Size: 1909 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.mapper.TbRolePermissionMapper;
import org.qifu.core.service.IRolePermissionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class RolePermissionServiceImpl extends BaseService<TbRolePermission, String> implements IRolePermissionService<TbRolePermission, String> {
	
	private final TbRolePermissionMapper tbRolePermissionMapper;
	
	public RolePermissionServiceImpl(TbRolePermissionMapper tbRolePermissionMapper) {
		super();
		this.tbRolePermissionMapper = tbRolePermissionMapper;
	}
	
	@Override
	protected IBaseMapper<TbRolePermission, String> getBaseMapper() {
		return this.tbRolePermissionMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/RoleServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class RoleServiceImpl; has 3 detected methods; depends on 7 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class RoleServiceImpl extends BaseService<TbRole, String> implements IRoleService<TbRole, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbRole`, `org.qifu.core.mapper.TbRoleMapper`, `org.qifu.core.service.IRoleService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L54 `protected IBaseMapper<TbRole, String> getBaseMapper()`
  - L67 `public List<TbRole> findForAccount(String account)`
  - L85 `public List<TbRole> findForProgram(String progId)`
- Main fields:
  - L46 `TbRoleMapper roleMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\RoleServiceImpl.java`
- Size: 2988 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbRole;
import org.qifu.core.mapper.TbRoleMapper;
import org.qifu.core.service.IRoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class RoleServiceImpl extends BaseService<TbRole, String> implements IRoleService<TbRole, String> {
	
	private final TbRoleMapper roleMapper;
	
	public RoleServiceImpl(TbRoleMapper roleMapper) {
		super();
		this.roleMapper = roleMapper;
	}

	@Override
	protected IBaseMapper<TbRole, String> getBaseMapper() {
		return this.roleMapper;
	}
	
	/**
	 * 查帳戶下有的 role
	 * 
	 * @param account
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@Override
	public List<TbRole> findForAccount(String account) throws ServiceException {
		if (StringUtils.isBlank(account)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("account", account);		
		return this.roleMapper.findForAccount(paramMap);
	}
	
	/**
	 * 查某隻程式屬於的role
	 * 
	 * select OID, ROLE, DESCRIPTION from tb_role where ROLE in (
	 * 		select ROLE from tb_sys_menu_role WHERE PROG_ID = :progId 
	 * )
	 * 
	 */
	@Override
	public List<TbRole> findForProgram(String progId) throws ServiceException {
		if (StringUtils.isBlank(progId)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("progId", progId);
		return this.roleMapper.findForProgram(paramMap);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpExprMapServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysBeanHelpExprMapServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysBeanHelpExprMapServiceImpl extends BaseService<TbSysBeanHelpExprMap, String> implements ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysBeanHelpExprMap`, `org.qifu.core.mapper.TbSysBeanHelpExprMapMapper`, `org.qifu.core.service.ISysBeanHelpExprMapService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysBeanHelpExprMap, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysBeanHelpExprMapMapper tbSysBeanHelpExprMapMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysBeanHelpExprMapServiceImpl.java`
- Size: 1973 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysBeanHelpExprMap;
import org.qifu.core.mapper.TbSysBeanHelpExprMapMapper;
import org.qifu.core.service.ISysBeanHelpExprMapService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysBeanHelpExprMapServiceImpl extends BaseService<TbSysBeanHelpExprMap, String> implements ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> {
	
	private final TbSysBeanHelpExprMapMapper tbSysBeanHelpExprMapMapper;
	
	public SysBeanHelpExprMapServiceImpl(TbSysBeanHelpExprMapMapper tbSysBeanHelpExprMapMapper) {
		super();
		this.tbSysBeanHelpExprMapMapper = tbSysBeanHelpExprMapMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysBeanHelpExprMap, String> getBaseMapper() {
		return this.tbSysBeanHelpExprMapMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpExprServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysBeanHelpExprServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysBeanHelpExprServiceImpl extends BaseService<TbSysBeanHelpExpr, String> implements ISysBeanHelpExprService<TbSysBeanHelpExpr, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysBeanHelpExpr`, `org.qifu.core.mapper.TbSysBeanHelpExprMapper`, `org.qifu.core.service.ISysBeanHelpExprService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysBeanHelpExpr, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysBeanHelpExprMapper tbSysBeanHelpExprMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysBeanHelpExprServiceImpl.java`
- Size: 1925 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysBeanHelpExpr;
import org.qifu.core.mapper.TbSysBeanHelpExprMapper;
import org.qifu.core.service.ISysBeanHelpExprService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysBeanHelpExprServiceImpl extends BaseService<TbSysBeanHelpExpr, String> implements ISysBeanHelpExprService<TbSysBeanHelpExpr, String> {
	
	private final TbSysBeanHelpExprMapper tbSysBeanHelpExprMapper;
	
	public SysBeanHelpExprServiceImpl(TbSysBeanHelpExprMapper tbSysBeanHelpExprMapper) {
		super();
		this.tbSysBeanHelpExprMapper = tbSysBeanHelpExprMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysBeanHelpExpr, String> getBaseMapper() {
		return this.tbSysBeanHelpExprMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysBeanHelpServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysBeanHelpServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysBeanHelpServiceImpl extends BaseService<TbSysBeanHelp, String> implements ISysBeanHelpService<TbSysBeanHelp, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysBeanHelp`, `org.qifu.core.mapper.TbSysBeanHelpMapper`, `org.qifu.core.service.ISysBeanHelpService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysBeanHelp, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysBeanHelpMapper tbSysBeanHelpMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysBeanHelpServiceImpl.java`
- Size: 1861 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysBeanHelp;
import org.qifu.core.mapper.TbSysBeanHelpMapper;
import org.qifu.core.service.ISysBeanHelpService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysBeanHelpServiceImpl extends BaseService<TbSysBeanHelp, String> implements ISysBeanHelpService<TbSysBeanHelp, String> {
	
	private final TbSysBeanHelpMapper tbSysBeanHelpMapper;
	
	public SysBeanHelpServiceImpl(TbSysBeanHelpMapper tbSysBeanHelpMapper) {
		super();
		this.tbSysBeanHelpMapper = tbSysBeanHelpMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysBeanHelp, String> getBaseMapper() {
		return this.tbSysBeanHelpMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysCodeServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysCodeServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysCodeServiceImpl extends BaseService<TbSysCode, String> implements ISysCodeService<TbSysCode, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysCode`, `org.qifu.core.mapper.TbSysCodeMapper`, `org.qifu.core.service.ISysCodeService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysCode, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysCodeMapper sysCodeMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysCodeServiceImpl.java`
- Size: 1787 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.mapper.TbSysCodeMapper;
import org.qifu.core.service.ISysCodeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysCodeServiceImpl extends BaseService<TbSysCode, String> implements ISysCodeService<TbSysCode, String> {
	
	private final TbSysCodeMapper sysCodeMapper;
	
	public SysCodeServiceImpl(TbSysCodeMapper sysCodeMapper) {
		super();
		this.sysCodeMapper = sysCodeMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysCode, String> getBaseMapper() {
		return this.sysCodeMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysEventLogServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysEventLogServiceImpl; has 3 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysEventLogServiceImpl extends BaseService<TbSysEventLog, String> implements ISysEventLogService<TbSysEventLog, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysEventLog`, `org.qifu.core.mapper.TbSysEventLogMapper`, `org.qifu.core.service.ISysEventLogService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.joda.time.DateTime`
- Main methods:
  - L53 `protected IBaseMapper<TbSysEventLog, String> getBaseMapper()`
  - L62 `public Boolean deleteAll()`
  - L71 `public Boolean deleteByDate()`
- Main fields:
  - L45 `TbSysEventLogMapper tbSysEventLogMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysEventLogServiceImpl.java`
- Size: 2737 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysEventLog;
import org.qifu.core.mapper.TbSysEventLogMapper;
import org.qifu.core.service.ISysEventLogService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysEventLogServiceImpl extends BaseService<TbSysEventLog, String> implements ISysEventLogService<TbSysEventLog, String> {
	
	private final TbSysEventLogMapper tbSysEventLogMapper;
	
	public SysEventLogServiceImpl(TbSysEventLogMapper tbSysEventLogMapper) {
		super();
		this.tbSysEventLogMapper = tbSysEventLogMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysEventLog, String> getBaseMapper() {
		return this.tbSysEventLogMapper;
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteAll() throws ServiceException {
		return this.tbSysEventLogMapper.deleteAll(null);
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteByDate() throws ServiceException {
		DateTime dt = new DateTime();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("cdate", dt.plusDays(-14).toDate());
		return this.tbSysEventLogMapper.deleteByDate(paramMap);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysExpressionServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysExpressionServiceImpl; has 2 detected methods; depends on 7 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysExpressionServiceImpl extends BaseService<TbSysExpression, String> implements ISysExpressionService<TbSysExpression, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.model.PleaseSelect`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysExpression`, `org.qifu.core.mapper.TbSysExpressionMapper`, `org.qifu.core.service.ISysExpressionService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L52 `protected IBaseMapper<TbSysExpression, String> getBaseMapper()`
  - L57 `public Map<String, String> findExpressionMap(boolean pleaseSelect)`
- Main fields:
  - L44 `TbSysExpressionMapper sysExpressionMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysExpressionServiceImpl.java`
- Size: 2541 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.model.PleaseSelect;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysExpression;
import org.qifu.core.mapper.TbSysExpressionMapper;
import org.qifu.core.service.ISysExpressionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysExpressionServiceImpl extends BaseService<TbSysExpression, String> implements ISysExpressionService<TbSysExpression, String> {
	
	private final TbSysExpressionMapper sysExpressionMapper;
	
	public SysExpressionServiceImpl(TbSysExpressionMapper sysExpressionMapper) {
		super();
		this.sysExpressionMapper = sysExpressionMapper;
	}

	@Override
	protected IBaseMapper<TbSysExpression, String> getBaseMapper() {
		return this.sysExpressionMapper;
	}
	
	@Override
	public Map<String, String> findExpressionMap(boolean pleaseSelect) throws ServiceException {
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		List<TbSysExpression> searchList = this.sysExpressionMapper.selectListByParamsSimple(null);
		for (int i=0; searchList!=null && i<searchList.size(); i++) {
			TbSysExpression expression = searchList.get(i);
			dataMap.put(expression.getOid(), expression.getExprId() + " - " + expression.getName());
		}
		return dataMap;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysExprJobLogServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysExprJobLogServiceImpl; has 2 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysExprJobLogServiceImpl extends BaseService<TbSysExprJobLog, String> implements ISysExprJobLogService<TbSysExprJobLog, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysExprJobLog`, `org.qifu.core.mapper.TbSysExprJobLogMapper`, `org.qifu.core.service.ISysExprJobLogService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L50 `protected IBaseMapper<TbSysExprJobLog, String> getBaseMapper()`
  - L59 `public Boolean deleteAll()`
- Main fields:
  - L42 `TbSysExprJobLogMapper tbSysExprJobLogMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysExprJobLogServiceImpl.java`
- Size: 2259 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.io.IOException;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysExprJobLog;
import org.qifu.core.mapper.TbSysExprJobLogMapper;
import org.qifu.core.service.ISysExprJobLogService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysExprJobLogServiceImpl extends BaseService<TbSysExprJobLog, String> implements ISysExprJobLogService<TbSysExprJobLog, String> {
	
	private final TbSysExprJobLogMapper tbSysExprJobLogMapper;
	
	public SysExprJobLogServiceImpl(TbSysExprJobLogMapper tbSysExprJobLogMapper) {
		super();
		this.tbSysExprJobLogMapper = tbSysExprJobLogMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysExprJobLog, String> getBaseMapper() {
		return this.tbSysExprJobLogMapper;
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteAll() throws ServiceException {
		return this.tbSysExprJobLogMapper.deleteAll(null);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysExprJobServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysExprJobServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysExprJobServiceImpl extends BaseService<TbSysExprJob, String> implements ISysExprJobService<TbSysExprJob, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.mapper.TbSysExprJobMapper`, `org.qifu.core.service.ISysExprJobService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysExprJob, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysExprJobMapper tbSysExprJobMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysExprJobServiceImpl.java`
- Size: 1845 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.mapper.TbSysExprJobMapper;
import org.qifu.core.service.ISysExprJobService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysExprJobServiceImpl extends BaseService<TbSysExprJob, String> implements ISysExprJobService<TbSysExprJob, String> {
	
	private final TbSysExprJobMapper tbSysExprJobMapper;
	
	public SysExprJobServiceImpl(TbSysExprJobMapper tbSysExprJobMapper) {
		super();
		this.tbSysExprJobMapper = tbSysExprJobMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysExprJob, String> getBaseMapper() {
		return this.tbSysExprJobMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysIconServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysIconServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysIconServiceImpl extends BaseService<TbSysIcon, String> implements ISysIconService<TbSysIcon, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysIcon`, `org.qifu.core.mapper.TbSysIconMapper`, `org.qifu.core.service.ISysIconService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysIcon, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysIconMapper tbSysIconMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysIconServiceImpl.java`
- Size: 1797 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysIcon;
import org.qifu.core.mapper.TbSysIconMapper;
import org.qifu.core.service.ISysIconService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysIconServiceImpl extends BaseService<TbSysIcon, String> implements ISysIconService<TbSysIcon, String> {
	
	private final TbSysIconMapper tbSysIconMapper;
	
	public SysIconServiceImpl(TbSysIconMapper tbSysIconMapper) {
		super();
		this.tbSysIconMapper = tbSysIconMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysIcon, String> getBaseMapper() {
		return this.tbSysIconMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysJreportParamServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysJreportParamServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysJreportParamServiceImpl extends BaseService<TbSysJreportParam, String> implements ISysJreportParamService<TbSysJreportParam, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysJreportParam`, `org.qifu.core.mapper.TbSysJreportParamMapper`, `org.qifu.core.service.ISysJreportParamService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysJreportParam, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysJreportParamMapper sysJreportParamMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysJreportParamServiceImpl.java`
- Size: 1915 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.mapper.TbSysJreportParamMapper;
import org.qifu.core.service.ISysJreportParamService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysJreportParamServiceImpl extends BaseService<TbSysJreportParam, String> implements ISysJreportParamService<TbSysJreportParam, String> {
	
	private final TbSysJreportParamMapper sysJreportParamMapper;
	
	public SysJreportParamServiceImpl(TbSysJreportParamMapper sysJreportParamMapper) {
		super();
		this.sysJreportParamMapper = sysJreportParamMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysJreportParam, String> getBaseMapper() {
		return this.sysJreportParamMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysJreportServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysJreportServiceImpl; has 3 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysJreportServiceImpl extends BaseService<TbSysJreport, String> implements ISysJreportService<TbSysJreport, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysJreport`, `org.qifu.core.mapper.TbSysJreportMapper`, `org.qifu.core.service.ISysJreportService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.MapUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L55 `protected IBaseMapper<TbSysJreport, String> getBaseMapper()`
  - L63 `public DefaultResult<TbSysJreport> selectByPrimaryKeySimple(String oid)`
  - L81 `public DefaultResult<List<TbSysJreport>> selectListByParamsSimple(Map<String, Object> paramMap)`
- Main fields:
  - L47 `TbSysJreportMapper sysJreportMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysJreportServiceImpl.java`
- Size: 3425 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.mapper.TbSysJreportMapper;
import org.qifu.core.service.ISysJreportService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysJreportServiceImpl extends BaseService<TbSysJreport, String> implements ISysJreportService<TbSysJreport, String> {
	
	private final TbSysJreportMapper sysJreportMapper;
	
	public SysJreportServiceImpl(TbSysJreportMapper sysJreportMapper) {
		super();
		this.sysJreportMapper = sysJreportMapper;
	}

	@Override
	protected IBaseMapper<TbSysJreport, String> getBaseMapper() {
		return this.sysJreportMapper;
	}

	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 */
	@Override
	public DefaultResult<TbSysJreport> selectByPrimaryKeySimple(String oid) throws ServiceException {
		if (null == oid || StringUtils.isBlank(oid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysJreport> result = new DefaultResult<>();
		TbSysJreport value = this.sysJreportMapper.selectByPrimaryKeySimple(oid);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 */
	@Override
	public DefaultResult<List<TbSysJreport>> selectListByParamsSimple(Map<String, Object> paramMap) throws ServiceException {
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterIncorrect());
		}
		DefaultResult<List<TbSysJreport>> result = new DefaultResult<>();
		List<TbSysJreport> value = this.sysJreportMapper.selectListByParamsSimple(paramMap);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysLoginLogServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysLoginLogServiceImpl; has 4 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysLoginLogServiceImpl extends BaseService<TbSysLoginLog, String> implements ISysLoginLogService<TbSysLoginLog, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysLoginLog`, `org.qifu.core.mapper.TbSysLoginLogMapper`, `org.qifu.core.service.ISysLoginLogService`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.joda.time.DateTime`
- Main methods:
  - L57 `protected IBaseMapper<TbSysLoginLog, String> getBaseMapper()`
  - L66 `public Boolean deleteAll()`
  - L75 `public Boolean deleteByDate()`
  - L87 `public void insertLoginFailLog(TbSysLoginLog log)`
- Main fields:
  - L49 `TbSysLoginLogMapper tbSysLoginLogMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysLoginLogServiceImpl.java`
- Size: 3484 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.mapper.TbSysLoginLogMapper;
import org.qifu.core.service.ISysLoginLogService;
import org.qifu.util.SimpleUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysLoginLogServiceImpl extends BaseService<TbSysLoginLog, String> implements ISysLoginLogService<TbSysLoginLog, String> {
	
	private final TbSysLoginLogMapper tbSysLoginLogMapper;
	
	public SysLoginLogServiceImpl(TbSysLoginLogMapper tbSysLoginLogMapper) {
		super();
		this.tbSysLoginLogMapper = tbSysLoginLogMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysLoginLog, String> getBaseMapper() {
		return this.tbSysLoginLogMapper;
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteAll() throws ServiceException {
		return this.tbSysLoginLogMapper.deleteAll(null);
	}
	
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteByDate() throws ServiceException {
		DateTime dt = new DateTime();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("cdate", dt.plusDays(-14).toDate());
		return this.tbSysLoginLogMapper.deleteByDate(paramMap);
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public void insertLoginFailLog(TbSysLoginLog log) throws ServiceException {
		if (StringUtils.isBlank(log.getOid())) {
			log.setOid(SimpleUtils.getUUIDStr());
		}
		
		log.setCuserid("sys");
		log.setFailFlag("Y");
		if (log.getCdate() == null) {
			log.setCdate(new Date());
		}
		
		if (this.tbSysLoginLogMapper.insert(log) < 1) {
			throw new ServiceException(BaseSystemMessage.insertFail());
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysMailHelperServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysMailHelperServiceImpl; has 4 detected methods; depends on 9 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysMailHelperServiceImpl extends BaseService<TbSysMailHelper, String> implements ISysMailHelperService<TbSysMailHelper, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysMailHelper`, `org.qifu.core.mapper.TbSysMailHelperMapper`, `org.qifu.core.service.ISysMailHelperService`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L59 `protected IBaseMapper<TbSysMailHelper, String> getBaseMapper()`
  - L64 `public DefaultResult<List<TbSysMailHelper>> findForJobList(String mailId)`
  - L85 `public String findForMaxMailId(String mailId)`
  - L99 `public String findForMaxMailIdComplete(String mailId)`
- Main fields:
  - L49 `String MAILID_VAR`
  - L51 `TbSysMailHelperMapper tbSysMailHelperMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysMailHelperServiceImpl.java`
- Size: 4152 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysMailHelper;
import org.qifu.core.mapper.TbSysMailHelperMapper;
import org.qifu.core.service.ISysMailHelperService;
import org.qifu.util.SimpleUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysMailHelperServiceImpl extends BaseService<TbSysMailHelper, String> implements ISysMailHelperService<TbSysMailHelper, String> {
	
	private static final String MAILID_VAR = "mailId";
	
	private final TbSysMailHelperMapper tbSysMailHelperMapper;
	
	public SysMailHelperServiceImpl(TbSysMailHelperMapper tbSysMailHelperMapper) {
		super();
		this.tbSysMailHelperMapper = tbSysMailHelperMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysMailHelper, String> getBaseMapper() {
		return this.tbSysMailHelperMapper;
	}
	
	@Override
	public DefaultResult<List<TbSysMailHelper>> findForJobList(String mailId) throws ServiceException {
		if ( StringUtils.isBlank(mailId) ) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		if (mailId.endsWith("%")) {
			paramMap.put(MAILID_VAR, mailId);
		} else {
			paramMap.put(MAILID_VAR, mailId+"%");
		}
		DefaultResult<List<TbSysMailHelper>> result = new DefaultResult<>();
		List<TbSysMailHelper> searchList = this.tbSysMailHelperMapper.findForJobList(paramMap);
		if (!CollectionUtils.isEmpty(searchList)) {
			result.setValue(searchList);
		} else {
			result.setMessage( BaseSystemMessage.searchNoData() );
		}
		return result;
	}
	
	@Override
	public String findForMaxMailId(String mailId) throws ServiceException {
		if (StringUtils.isBlank(mailId)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		Map<String, Object> paramMap = new HashMap<>();
		if (mailId.endsWith("%")) {
			paramMap.put(MAILID_VAR, mailId);
		} else {
			paramMap.put(MAILID_VAR, mailId+"%");
		}
		return this.tbSysMailHelperMapper.findForMaxMailId(paramMap);
	}	
	
	@Override
	public String findForMaxMailIdComplete(String mailId) throws ServiceException {
		if (StringUtils.isBlank(mailId) || !SimpleUtils.isDate(mailId)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		String maxMailId = this.findForMaxMailId(mailId);
		if (StringUtils.isBlank(maxMailId)) {
			return mailId + "000000001";
		}
		int maxSeq = Integer.parseInt( maxMailId.substring(8, 17) ) + 1;
		if (maxSeq > 999999999) {
			throw new ServiceException(BaseSystemMessage.dataErrors() + " over max mail-id 999999999!");
		}
		return mailId + StringUtils.leftPad(String.valueOf(maxSeq), 9, "0");
	}	
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysMenuRoleServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysMenuRoleServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysMenuRoleServiceImpl extends BaseService<TbSysMenuRole, String> implements ISysMenuRoleService<TbSysMenuRole, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysMenuRole`, `org.qifu.core.mapper.TbSysMenuRoleMapper`, `org.qifu.core.service.ISysMenuRoleService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysMenuRole, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysMenuRoleMapper tbSysMenuRoleMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysMenuRoleServiceImpl.java`
- Size: 1861 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysMenuRole;
import org.qifu.core.mapper.TbSysMenuRoleMapper;
import org.qifu.core.service.ISysMenuRoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysMenuRoleServiceImpl extends BaseService<TbSysMenuRole, String> implements ISysMenuRoleService<TbSysMenuRole, String> {
	
	private final TbSysMenuRoleMapper tbSysMenuRoleMapper;
	
	public SysMenuRoleServiceImpl(TbSysMenuRoleMapper tbSysMenuRoleMapper) {
		super();
		this.tbSysMenuRoleMapper = tbSysMenuRoleMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysMenuRole, String> getBaseMapper() {
		return this.tbSysMenuRoleMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysMenuServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysMenuServiceImpl; has 5 detected methods; depends on 12 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysMenuServiceImpl extends BaseService<TbSysMenu, String> implements ISysMenuService<TbSysMenu, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.mapper.TbSysMenuMapper`, `org.qifu.core.model.MenuItemType`, `org.qifu.core.service.ISysMenuService`, `org.qifu.core.vo.SysMenuVO`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L66 `protected IBaseMapper<TbSysMenu, String> getBaseMapper()`
  - L71 `public DefaultResult<List<SysMenuVO>> findForMenuGenerator(String sysId, String account)`
  - L91 `public List<Map<String, Object>> getMemuItemListForFrontend(String account)`
  - L134 `protected List<SysMenuVO> searchFolder(List<SysMenuVO> sysMenuList)`
  - L152 `protected List<SysMenuVO> searchItem(String parentOid, List<SysMenuVO> sysMenuList)`
- Main fields:
  - L55 `TbSysMenuMapper tbSysMenuMapper`
  - L57 `BaseInfoConfigProperties baseInfoConfigProperties`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysMenuServiceImpl.java`
- Size: 5816 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.mapper.TbSysMenuMapper;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.vo.SysMenuVO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysMenuServiceImpl extends BaseService<TbSysMenu, String> implements ISysMenuService<TbSysMenu, String> {
	
	private final TbSysMenuMapper tbSysMenuMapper;
	
	private final BaseInfoConfigProperties baseInfoConfigProperties;	
	
	public SysMenuServiceImpl(TbSysMenuMapper tbSysMenuMapper, BaseInfoConfigProperties baseInfoConfigProperties) {
		super();
		this.tbSysMenuMapper = tbSysMenuMapper;
		this.baseInfoConfigProperties = baseInfoConfigProperties;
	}
	
	@Override
	protected IBaseMapper<TbSysMenu, String> getBaseMapper() {
		return this.tbSysMenuMapper;
	}
	
	@Override
	public DefaultResult<List<SysMenuVO>> findForMenuGenerator(String sysId, String account) throws ServiceException {
		if (StringUtils.isBlank(sysId)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("progSystem", sysId);
		if (!StringUtils.isBlank(account)) {
			paramMap.put("account", account);
		}
		DefaultResult<List<SysMenuVO>> result = new DefaultResult<>();
		List<SysMenuVO> value = this.tbSysMenuMapper.selectForMenuGenerator(paramMap);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}

	@Override
	public List<Map<String, Object>> getMemuItemListForFrontend(String account) throws ServiceException {
		List<SysMenuVO> menuList = this.findForMenuGenerator(baseInfoConfigProperties.getMainSystem(), account).getValueEmptyThrowMessage();
		if (CollectionUtils.isEmpty(menuList)) {
			throw new ServiceException(BaseSystemMessage.searchNoData());
		}
		List<Map<String, Object>> menuTreeList = new ArrayList<>();		
		List<SysMenuVO> parentSysMenuList = searchFolder(menuList);
		for (SysMenuVO pMenu : parentSysMenuList) {
			List<SysMenuVO> childSysMenuList = searchItem(pMenu.getOid(), menuList);
			if (CollectionUtils.isEmpty(childSysMenuList)) {
				continue;
			}
			Map<String, Object> menuMap = new LinkedHashMap<>();					
			menuMap.put("id", pMenu.getProgId());
			menuMap.put("type", pMenu.getItemType());
			menuMap.put("name", pMenu.getName());
			menuMap.put("icon", pMenu.getFontIconClassId());
			
			List<Map<String, String>> menuItemList = new LinkedList<>();			
			menuMap.put("items", menuItemList);
			
			for (SysMenuVO cMenu : childSysMenuList) {
				Map<String, String> cItemMap = new HashMap<>();
				cItemMap.put("id", cMenu.getProgId());
				cItemMap.put("type", cMenu.getItemType());
				cItemMap.put("name", cMenu.getName());
				cItemMap.put("icon", cMenu.getFontIconClassId());
				cItemMap.put("url", cMenu.getUrl());
				menuItemList.add(cItemMap);
			}
			
			menuTreeList.add(menuMap);	
		}		
		return menuTreeList;
	}
	
	/**
	 * 取是目錄選單的資料
	 * 
	 * @param sysMenuList
	 * @return
	 * @throws Exception
	 */
	protected static List<SysMenuVO> searchFolder(List<SysMenuVO> sysMenuList) {
		List<SysMenuVO> folderList = new ArrayList<>();
		for (SysMenuVO sysMenu : sysMenuList) {
			if (MenuItemType.FOLDER.equals(sysMenu.getItemType()) && YesNoKeyProvide.YES.equals(sysMenu.getEnableFlag()) ) {
				folderList.add(sysMenu);
			}
		}
		return folderList;
	}		
	
	/**
	 * 取目錄下的選單項目
	 * 
	 * @param parentOid
	 * @param sysMenuList
	 * @return
	 * @throws Exception
	 */
	protected static List<SysMenuVO> searchItem(String parentOid, List<SysMenuVO> sysMenuList) {
		List<SysMenuVO> folderList = new ArrayList<>();
		for (SysMenuVO sysMenu : sysMenuList) {
			if (MenuItemType.ITEM.equals(sysMenu.getItemType()) && parentOid.equals(sysMenu.getParentOid())
					&& YesNoKeyProvide.YES.equals(sysMenu.getEnableFlag()) ) {
				folderList.add(sysMenu);
			}
		}
		return folderList;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysProgServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysProgServiceImpl; has 5 detected methods; depends on 11 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysProgServiceImpl extends BaseService<TbSysProg, String> implements ISysProgService<TbSysProg, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.PleaseSelect`, `org.qifu.base.model.SortType`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.mapper.TbSysProgMapper`, `org.qifu.core.model.MenuItemType`, `org.qifu.core.service.ISysProgService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L62 `protected IBaseMapper<TbSysProg, String> getBaseMapper()`
  - L67 `public Map<String, String> findSysProgFolderMap(String basePath, String progSystem, String itemType, boolean pleaseSelect)`
  - L86 `public List<TbSysProg> findForInTheFolderMenuItems(String progSystem, String menuParentOid, String itemType)`
  - L102 `public List<TbSysProg> findForSystemItems(String progSystem)`
  - L113 `public List<TbSysProg> findForInThePermRoleOfUserId(String accountId)`
- Main fields:
  - L51 `String PROG_SYSTEM_VAR`
  - L52 `String ITEM_TYPE_VAR`
  - L54 `TbSysProgMapper tbSysProgMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysProgServiceImpl.java`
- Size: 4661 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.PleaseSelect;
import org.qifu.base.model.SortType;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.mapper.TbSysProgMapper;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysProgService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysProgServiceImpl extends BaseService<TbSysProg, String> implements ISysProgService<TbSysProg, String> {
	
	private static final String PROG_SYSTEM_VAR = "progSystem";
	private static final String ITEM_TYPE_VAR = "itemType";
	
	private final TbSysProgMapper tbSysProgMapper;
	
	public SysProgServiceImpl(TbSysProgMapper tbSysProgMapper) {
		super();
		this.tbSysProgMapper = tbSysProgMapper;
	}

	@Override
	protected IBaseMapper<TbSysProg, String> getBaseMapper() {
		return this.tbSysProgMapper;
	}

	@Override
	public Map<String, String> findSysProgFolderMap(String basePath, String progSystem, String itemType, boolean pleaseSelect) throws ServiceException {
		if (StringUtils.isBlank(progSystem)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		Map<String, Object> params = new HashMap<>();
		params.put(PROG_SYSTEM_VAR, progSystem);
		params.put(ITEM_TYPE_VAR, itemType);
		DefaultResult<List<TbSysProg>> searchResult = this.selectListByParams(params);
		if (null == searchResult || CollectionUtils.isEmpty(searchResult.getValue())) {
			return dataMap;
		}
		for (TbSysProg sysProg : searchResult.getValue()) {
			dataMap.put(sysProg.getOid(), sysProg.getProgId() + " - " + sysProg.getName());
		}
		return dataMap;
	}

	@Override
	public List<TbSysProg> findForInTheFolderMenuItems(String progSystem, String menuParentOid, String itemType) throws ServiceException {
		if (StringUtils.isBlank(progSystem)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put(PROG_SYSTEM_VAR, progSystem);
		if (!StringUtils.isBlank(menuParentOid)) {
			paramMap.put("menuParentOid", menuParentOid);
		}
		if (!StringUtils.isBlank(itemType)) {
			paramMap.put(ITEM_TYPE_VAR, itemType);
		}
		return this.tbSysProgMapper.findForInTheFolderMenuItems(paramMap);
	}
	
	@Override
	public List<TbSysProg> findForSystemItems(String progSystem) throws ServiceException {
		if (StringUtils.isBlank(progSystem)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put(PROG_SYSTEM_VAR, progSystem);
		DefaultResult<List<TbSysProg>> result = this.selectListByParams(paramMap, "PROG_ID", SortType.ASC);
		return result.getValue();
	}

	@Override
	public List<TbSysProg> findForInThePermRoleOfUserId(String accountId) throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		if (!StringUtils.isBlank(accountId)) {
			paramMap.put("account", accountId);
		}
		paramMap.put(ITEM_TYPE_VAR, MenuItemType.ITEM);
		return this.tbSysProgMapper.findForInThePermRoleOfUserId(paramMap);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysQfieldLogServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysQfieldLogServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysQfieldLogServiceImpl extends BaseService<TbSysQfieldLog, String> implements ISysQfieldLogService<TbSysQfieldLog, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysQfieldLog`, `org.qifu.core.mapper.TbSysQfieldLogMapper`, `org.qifu.core.service.ISysQfieldLogService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysQfieldLog, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysQfieldLogMapper tbSysQfieldLogMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysQfieldLogServiceImpl.java`
- Size: 1877 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysQfieldLog;
import org.qifu.core.mapper.TbSysQfieldLogMapper;
import org.qifu.core.service.ISysQfieldLogService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysQfieldLogServiceImpl extends BaseService<TbSysQfieldLog, String> implements ISysQfieldLogService<TbSysQfieldLog, String> {
	
	private final TbSysQfieldLogMapper tbSysQfieldLogMapper;
	
	public SysQfieldLogServiceImpl(TbSysQfieldLogMapper tbSysQfieldLogMapper) {
		super();
		this.tbSysQfieldLogMapper = tbSysQfieldLogMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysQfieldLog, String> getBaseMapper() {
		return this.tbSysQfieldLogMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysServiceImpl; has 2 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysServiceImpl extends BaseService<TbSys, String> implements ISysService<TbSys, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.PleaseSelect`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSys`, `org.qifu.core.mapper.TbSysMapper`, `org.qifu.core.service.ISysService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`
- Main methods:
  - L54 `protected IBaseMapper<TbSys, String> getBaseMapper()`
  - L59 `public Map<String, String> findSysMap(boolean pleaseSelect)`
- Main fields:
  - L46 `TbSysMapper tbSysMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysServiceImpl.java`
- Size: 2463 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.PleaseSelect;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSys;
import org.qifu.core.mapper.TbSysMapper;
import org.qifu.core.service.ISysService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysServiceImpl extends BaseService<TbSys, String> implements ISysService<TbSys, String> {
	
	private final TbSysMapper tbSysMapper;
	
	public SysServiceImpl(TbSysMapper tbSysMapper) {
		super();
		this.tbSysMapper = tbSysMapper;
	}

	@Override
	protected IBaseMapper<TbSys, String> getBaseMapper() {
		return this.tbSysMapper;
	}

	@Override
	public Map<String, String> findSysMap(boolean pleaseSelect) throws ServiceException {
		Map<String, String> sysMap = PleaseSelect.pageSelectMap(pleaseSelect);
		DefaultResult<List<TbSys>> searchResult = this.selectList();
		if (searchResult == null || CollectionUtils.isEmpty(searchResult.getValue())) {
			return sysMap;
		}
		for (TbSys sys : searchResult.getValue()) {
			sysMap.put(sys.getOid(), sys.getSysId() + " - " + sys.getName());
		}
		return sysMap;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysTemplateParamServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysTemplateParamServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysTemplateParamServiceImpl extends BaseService<TbSysTemplateParam, String> implements ISysTemplateParamService<TbSysTemplateParam, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysTemplateParam`, `org.qifu.core.mapper.TbSysTemplateParamMapper`, `org.qifu.core.service.ISysTemplateParamService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysTemplateParam, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysTemplateParamMapper sysTemplateParamMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysTemplateParamServiceImpl.java`
- Size: 1931 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysTemplateParam;
import org.qifu.core.mapper.TbSysTemplateParamMapper;
import org.qifu.core.service.ISysTemplateParamService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysTemplateParamServiceImpl extends BaseService<TbSysTemplateParam, String> implements ISysTemplateParamService<TbSysTemplateParam, String> {
	
	private final TbSysTemplateParamMapper sysTemplateParamMapper;
	
	public SysTemplateParamServiceImpl(TbSysTemplateParamMapper sysTemplateParamMapper) {
		super();
		this.sysTemplateParamMapper = sysTemplateParamMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysTemplateParam, String> getBaseMapper() {
		return this.sysTemplateParamMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysTemplateServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysTemplateServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysTemplateServiceImpl extends BaseService<TbSysTemplate, String> implements ISysTemplateService<TbSysTemplate, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysTemplate`, `org.qifu.core.mapper.TbSysTemplateMapper`, `org.qifu.core.service.ISysTemplateService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbSysTemplate, String> getBaseMapper()`
- Main fields:
  - L39 `TbSysTemplateMapper sysTemplateMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysTemplateServiceImpl.java`
- Size: 1851 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.mapper.TbSysTemplateMapper;
import org.qifu.core.service.ISysTemplateService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysTemplateServiceImpl extends BaseService<TbSysTemplate, String> implements ISysTemplateService<TbSysTemplate, String> {
	
	private final TbSysTemplateMapper sysTemplateMapper;
	
	public SysTemplateServiceImpl(TbSysTemplateMapper sysTemplateMapper) {
		super();
		this.sysTemplateMapper = sysTemplateMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysTemplate, String> getBaseMapper() {
		return this.sysTemplateMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysTokenServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysTokenServiceImpl; has 3 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysTokenServiceImpl extends BaseService<TbSysToken, String> implements ISysTokenService<TbSysToken, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysToken`, `org.qifu.core.mapper.TbSysTokenMapper`, `org.qifu.core.service.ISysTokenService`, `org.qifu.core.vo.BoardDemo`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L34 `protected IBaseMapper<TbSysToken, String> getBaseMapper()`
  - L39 `public List<BoardDemo> findCountSizeByDatePerUser(Date date1, Date date2)`
  - L50 `public Long countSizeByDate(Date date1, Date date2)`
- Main fields:
  - L26 `TbSysTokenMapper sysTokenMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysTokenServiceImpl.java`
- Size: 2040 bytes

#### Source

````java
package org.qifu.core.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.mapper.TbSysTokenMapper;
import org.qifu.core.service.ISysTokenService;
import org.qifu.core.vo.BoardDemo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysTokenServiceImpl extends BaseService<TbSysToken, String> implements ISysTokenService<TbSysToken, String> {
	
	private final TbSysTokenMapper sysTokenMapper;
	
	public SysTokenServiceImpl(TbSysTokenMapper sysTokenMapper) {
		super();
		this.sysTokenMapper = sysTokenMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysToken, String> getBaseMapper() {
		return this.sysTokenMapper;
	}

	@Override
	public List<BoardDemo> findCountSizeByDatePerUser(Date date1, Date date2) throws ServiceException {
		if (null == date1 || null == date2) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("date1", date1);
		paramMap.put("date2", date2);
		return sysTokenMapper.findCountSizeByDatePerUser(paramMap);
	}

	@Override
	public Long countSizeByDate(Date date1, Date date2) throws ServiceException {
		if (null == date1 || null == date2) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("date1", date1);
		paramMap.put("date2", date2);		
		return sysTokenMapper.countSizeByDate(paramMap);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysUploadServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysUploadServiceImpl; has 3 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysUploadServiceImpl extends BaseService<TbSysUpload, String> implements ISysUploadService<TbSysUpload, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysUpload`, `org.qifu.core.mapper.TbSysUploadMapper`, `org.qifu.core.model.UploadTypes`, `org.qifu.core.service.ISysUploadService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L57 `protected IBaseMapper<TbSysUpload, String> getBaseMapper()`
  - L70 `public DefaultResult<TbSysUpload> selectByPrimaryKeySimple(String oid)`
  - L97 `public DefaultResult<Boolean> deleteTmpContentBySystem(String systemId)`
- Main fields:
  - L49 `TbSysUploadMapper tbSysUploadMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysUploadServiceImpl.java`
- Size: 4001 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysUpload;
import org.qifu.core.mapper.TbSysUploadMapper;
import org.qifu.core.model.UploadTypes;
import org.qifu.core.service.ISysUploadService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysUploadServiceImpl extends BaseService<TbSysUpload, String> implements ISysUploadService<TbSysUpload, String> {
	
	private final TbSysUploadMapper tbSysUploadMapper;
	
	public SysUploadServiceImpl(TbSysUploadMapper tbSysUploadMapper) {
		super();
		this.tbSysUploadMapper = tbSysUploadMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysUpload, String> getBaseMapper() {
		return this.tbSysUploadMapper;
	}

	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param oid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@Override
	public DefaultResult<TbSysUpload> selectByPrimaryKeySimple(String oid) throws ServiceException {
		if (null == oid || StringUtils.isBlank(oid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysUpload> result = new DefaultResult<>();
		TbSysUpload value = this.tbSysUploadMapper.selectByPrimaryKeySimple(oid);
		if (value != null) {
			result.setValue(value);
		} else { 
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}

	/**
	 * 刪除 IS_FILE='N' && CONTENT 欄位放byte 類別為暫存的資料
	 * 
	 * @param systemId
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */	
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )	
	@Override
	public DefaultResult<Boolean> deleteTmpContentBySystem(String systemId) throws ServiceException {
		if (StringUtils.isBlank(systemId)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("system", systemId);
		paramMap.put("type", UploadTypes.IS_TEMP);
		paramMap.put("isFile", YesNoKeyProvide.NO);
		DefaultResult<Boolean> result = new DefaultResult<>();
		result.setValue( this.tbSysUploadMapper.deleteTmpContentBySystem(paramMap) );
		if (result.getValue() != null && result.getValue()) {
			result.setMessage(BaseSystemMessage.deleteSuccess());
		} else {
			result.setMessage(BaseSystemMessage.deleteFail());
		}
		return result;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/SysUsessServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class SysUsessServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class SysUsessServiceImpl extends BaseService<TbSysUsess, String> implements ISysUsessService<TbSysUsess, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbSysUsess`, `org.qifu.core.mapper.TbSysUsessMapper`, `org.qifu.core.service.ISysUsessService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L48 `protected IBaseMapper<TbSysUsess, String> getBaseMapper()`
- Main fields:
  - L40 `TbSysUsessMapper sysUsessMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\SysUsessServiceImpl.java`
- Size: 1837 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysUsess;
import org.qifu.core.mapper.TbSysUsessMapper;
import org.qifu.core.service.ISysUsessService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//change use SysTokenServiceImpl
@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysUsessServiceImpl extends BaseService<TbSysUsess, String> implements ISysUsessService<TbSysUsess, String> {
	
	private final TbSysUsessMapper sysUsessMapper;
	
	public SysUsessServiceImpl(TbSysUsessMapper sysUsessMapper) {
		super();
		this.sysUsessMapper = sysUsessMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysUsess, String> getBaseMapper() {
		return this.sysUsessMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/impl/UserRoleServiceImpl.java`

- Purpose: Service or business logic, Spring component; declares class UserRoleServiceImpl; has 1 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service.impl`
- Role: Service or business logic, Spring component
- Main types: `class UserRoleServiceImpl extends BaseService<TbUserRole, String> implements IUserRoleService<TbUserRole, String>`
- Key annotations: `Component`, `Service`, `Transactional`, `Override`
- Local dependencies: `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.service.BaseService`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.mapper.TbUserRoleMapper`, `org.qifu.core.service.IUserRoleService`
- Spring dependencies: `org.springframework.stereotype.Component`, `org.springframework.stereotype.Service`, `org.springframework.transaction.annotation.Propagation`, `org.springframework.transaction.annotation.Transactional`
- Main methods:
  - L47 `protected IBaseMapper<TbUserRole, String> getBaseMapper()`
- Main fields:
  - L39 `TbUserRoleMapper tbUserRoleMapper`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\impl\UserRoleServiceImpl.java`
- Size: 1813 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.mapper.TbUserRoleMapper;
import org.qifu.core.service.IUserRoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class UserRoleServiceImpl extends BaseService<TbUserRole, String> implements IUserRoleService<TbUserRole, String> {
	
	private final TbUserRoleMapper tbUserRoleMapper;
	
	public UserRoleServiceImpl(TbUserRoleMapper tbUserRoleMapper) {
		super();
		this.tbUserRoleMapper = tbUserRoleMapper;
	}
	
	@Override
	protected IBaseMapper<TbUserRole, String> getBaseMapper() {
		return this.tbUserRoleMapper;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/IRolePermissionService.java`

- Purpose: Service interface; declares interface IRolePermissionService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface IRolePermissionService <T, E> extends IBaseService<TbRolePermission, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbRolePermission`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\IRolePermissionService.java`
- Size: 1024 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbRolePermission;

public interface IRolePermissionService<T, E> extends IBaseService<TbRolePermission, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/IRoleService.java`

- Purpose: Service interface; declares interface IRoleService; has 2 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface IRoleService <T, E> extends IBaseService<TbRole, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbRole`
- Main methods:
  - L40 `public List<TbRole> findForAccount(String account)`
  - L54 `public List<TbRole> findForProgram(String progId)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\IRoleService.java`
- Size: 1645 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.List;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbRole;

public interface IRoleService<T, E> extends IBaseService<TbRole, String> {
	
	/**
	 * 查帳戶下有的 role
	 * 
	 * @param account
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public List<TbRole> findForAccount(String account) throws ServiceException;	
	
	/**
	 * 查某隻程式屬於的role
	 * 
	 * select OID, ROLE, DESCRIPTION from tb_role where ROLE in (
	 * 		select ROLE from tb_sys_menu_role WHERE PROG_ID = :progId 
	 * )
	 * 
	 * @param progId
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public List<TbRole> findForProgram(String progId) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpExprMapService.java`

- Purpose: Service interface; declares interface ISysBeanHelpExprMapService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysBeanHelpExprMapService <T, E> extends IBaseService<TbSysBeanHelpExprMap, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysBeanHelpExprMap`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysBeanHelpExprMapService.java`
- Size: 1036 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysBeanHelpExprMap;

public interface ISysBeanHelpExprMapService<T, E> extends IBaseService<TbSysBeanHelpExprMap, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpExprService.java`

- Purpose: Service interface; declares interface ISysBeanHelpExprService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysBeanHelpExprService <T, E> extends IBaseService<TbSysBeanHelpExpr, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysBeanHelpExpr`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysBeanHelpExprService.java`
- Size: 1027 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysBeanHelpExpr;

public interface ISysBeanHelpExprService<T, E> extends IBaseService<TbSysBeanHelpExpr, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysBeanHelpService.java`

- Purpose: Service interface; declares interface ISysBeanHelpService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysBeanHelpService <T, E> extends IBaseService<TbSysBeanHelp, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysBeanHelp`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysBeanHelpService.java`
- Size: 1015 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysBeanHelp;

public interface ISysBeanHelpService<T, E> extends IBaseService<TbSysBeanHelp, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysCodeService.java`

- Purpose: Service interface; declares interface ISysCodeService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysCodeService <T, E> extends IBaseService<TbSysCode, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysCode`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysCodeService.java`
- Size: 1003 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysCode;

public interface ISysCodeService<T, E> extends IBaseService<TbSysCode, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysEventLogService.java`

- Purpose: Service interface; declares interface ISysEventLogService; has 2 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysEventLogService <T, E> extends IBaseService<TbSysEventLog, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysEventLog`
- Main methods:
  - L30 `public Boolean deleteAll()`
  - L32 `public Boolean deleteByDate()`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysEventLogService.java`
- Size: 1182 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysEventLog;

public interface ISysEventLogService<T, E> extends IBaseService<TbSysEventLog, String> {
	
	public Boolean deleteAll() throws ServiceException;
	
	public Boolean deleteByDate() throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysExpressionService.java`

- Purpose: Service interface; declares interface ISysExpressionService; has 1 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysExpressionService <T, E> extends IBaseService<TbSysExpression, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysExpression`
- Main methods:
  - L32 `public Map<String, String> findExpressionMap(boolean pleaseSelect)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysExpressionService.java`
- Size: 1193 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysExpression;

public interface ISysExpressionService<T, E> extends IBaseService<TbSysExpression, String> {
	
	public Map<String, String> findExpressionMap(boolean pleaseSelect) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysExprJobLogService.java`

- Purpose: Service interface; declares interface ISysExprJobLogService; has 1 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysExprJobLogService <T, E> extends IBaseService<TbSysExprJobLog, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysExprJobLog`
- Main methods:
  - L30 `public Boolean deleteAll()`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysExprJobLogService.java`
- Size: 1128 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysExprJobLog;

public interface ISysExprJobLogService<T, E> extends IBaseService<TbSysExprJobLog, String> {
	
	public Boolean deleteAll() throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysExprJobService.java`

- Purpose: Service interface; declares interface ISysExprJobService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysExprJobService <T, E> extends IBaseService<TbSysExprJob, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysExprJob`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysExprJobService.java`
- Size: 1012 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysExprJob;

public interface ISysExprJobService<T, E> extends IBaseService<TbSysExprJob, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysIconService.java`

- Purpose: Service interface; declares interface ISysIconService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysIconService <T, E> extends IBaseService<TbSysIcon, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysIcon`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysIconService.java`
- Size: 1003 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysIcon;

public interface ISysIconService<T, E> extends IBaseService<TbSysIcon, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysJreportParamService.java`

- Purpose: Service interface; declares interface ISysJreportParamService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysJreportParamService <T, E> extends IBaseService<TbSysJreportParam, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysJreportParam`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysJreportParamService.java`
- Size: 1027 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysJreportParam;

public interface ISysJreportParamService<T, E> extends IBaseService<TbSysJreportParam, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysJreportService.java`

- Purpose: Service interface; declares interface ISysJreportService; has 2 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysJreportService <T, E> extends IBaseService<TbSysJreport, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysJreport`
- Main methods:
  - L42 `public DefaultResult<TbSysJreport> selectByPrimaryKeySimple(String oid)`
  - L52 `public DefaultResult<List<TbSysJreport>> selectListByParamsSimple(Map<String, Object> paramMap)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysJreportService.java`
- Size: 1786 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysJreport;

public interface ISysJreportService<T, E> extends IBaseService<TbSysJreport, String> {
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param oid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSysJreport> selectByPrimaryKeySimple(String oid) throws ServiceException;
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param paramMap
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<List<TbSysJreport>> selectListByParamsSimple(Map<String, Object> paramMap) throws ServiceException;	
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysLoginLogService.java`

- Purpose: Service interface; declares interface ISysLoginLogService; has 3 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysLoginLogService <T, E> extends IBaseService<TbSysLoginLog, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysLoginLog`
- Main methods:
  - L31 `public Boolean deleteAll()`
  - L33 `public Boolean deleteByDate()`
  - L35 `public void insertLoginFailLog(TbSysLoginLog log)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysLoginLogService.java`
- Size: 1294 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysLoginLog;

// change use ISysTokenService
public interface ISysLoginLogService<T, E> extends IBaseService<TbSysLoginLog, String> {
	
	public Boolean deleteAll() throws ServiceException;
	
	public Boolean deleteByDate() throws ServiceException;
	
	public void insertLoginFailLog(TbSysLoginLog log) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysMailHelperService.java`

- Purpose: Service interface; declares interface ISysMailHelperService; has 3 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysMailHelperService <T, E> extends IBaseService<TbSysMailHelper, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysMailHelper`
- Main methods:
  - L33 `public DefaultResult<List<TbSysMailHelper>> findForJobList(String mailId)`
  - L35 `public String findForMaxMailId(String mailId)`
  - L37 `public String findForMaxMailIdComplete(String mailId)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysMailHelperService.java`
- Size: 1404 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.List;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysMailHelper;

public interface ISysMailHelperService<T, E> extends IBaseService<TbSysMailHelper, String> {
	
	public DefaultResult<List<TbSysMailHelper>> findForJobList(String mailId) throws ServiceException;
	
	public String findForMaxMailId(String mailId) throws ServiceException;
	
	public String findForMaxMailIdComplete(String mailId) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysMenuRoleService.java`

- Purpose: Service interface; declares interface ISysMenuRoleService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysMenuRoleService <T, E> extends IBaseService<TbSysMenuRole, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysMenuRole`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysMenuRoleService.java`
- Size: 1015 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysMenuRole;

public interface ISysMenuRoleService<T, E> extends IBaseService<TbSysMenuRole, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysMenuService.java`

- Purpose: Service interface; declares interface ISysMenuService; has 2 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysMenuService <T, E> extends IBaseService<TbSysMenu, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.vo.SysMenuVO`
- Main methods:
  - L35 `public DefaultResult<List<SysMenuVO>> findForMenuGenerator(String sysId, String account)`
  - L37 `public List<Map<String, Object>> getMemuItemListForFrontend(String account)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysMenuService.java`
- Size: 1406 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.vo.SysMenuVO;

public interface ISysMenuService<T, E> extends IBaseService<TbSysMenu, String> {
	
	public DefaultResult<List<SysMenuVO>> findForMenuGenerator(String sysId, String account) throws ServiceException;
	
	public List<Map<String, Object>> getMemuItemListForFrontend(String account) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysProgService.java`

- Purpose: Service interface; declares interface ISysProgService; has 4 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysProgService <T, E> extends IBaseService<TbSysProg, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysProg`
- Main methods:
  - L33 `public Map<String, String> findSysProgFolderMap(String basePath, String progSystem, String itemType, boolean pleaseSelect)`
  - L45 `public List<TbSysProg> findForInTheFolderMenuItems(String progSystem, String menuParentOid, String itemType)`
  - L61 `public List<TbSysProg> findForSystemItems(String progSystem)`
  - L63 `public List<TbSysProg> findForInThePermRoleOfUserId(String accountId)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysProgService.java`
- Size: 2101 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysProg;

public interface ISysProgService<T, E> extends IBaseService<TbSysProg, String> {
	
	public Map<String, String> findSysProgFolderMap(String basePath, String progSystem, String itemType, boolean pleaseSelect) throws ServiceException;
	
	/**
	 * 找在選單中(FOLDER) 之下已存在的項目
	 * 
	 * @param progSystem
	 * @param menuParentOid
	 * @param itemType
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public List<TbSysProg> findForInTheFolderMenuItems(String progSystem, String menuParentOid, String itemType) throws ServiceException;
	
	/**
	 * 找同 PROG_SYSTEM 的資料
	 * 
	 * select OID, PROG_ID, NAME, PROG_SYSTEM, ICON 
	 * from tb_sys_prog 
	 * where PROG_SYSTEM=:progSystem
	 * and ITEM_TYPE='ITEM' 
	 * and EDIT_MODE='N';
	 * 
	 * @param progSystem
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public List<TbSysProg> findForSystemItems(String progSystem) throws ServiceException;	
	
	public List<TbSysProg> findForInThePermRoleOfUserId(String accountId) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysQfieldLogService.java`

- Purpose: Service interface; declares interface ISysQfieldLogService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysQfieldLogService <T, E> extends IBaseService<TbSysQfieldLog, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysQfieldLog`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysQfieldLogService.java`
- Size: 1018 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysQfieldLog;

public interface ISysQfieldLogService<T, E> extends IBaseService<TbSysQfieldLog, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysService.java`

- Purpose: Service interface; declares interface ISysService; has 1 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysService <T, E> extends IBaseService<TbSys, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSys`
- Main methods:
  - L32 `public Map<String, String> findSysMap(boolean pleaseSelect)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysService.java`
- Size: 1156 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSys;

public interface ISysService<T, E> extends IBaseService<TbSys, String> {
	
	public Map<String, String> findSysMap(boolean pleaseSelect) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysTemplateParamService.java`

- Purpose: Service interface; declares interface ISysTemplateParamService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysTemplateParamService <T, E> extends IBaseService<TbSysTemplateParam, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysTemplateParam`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysTemplateParamService.java`
- Size: 1030 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysTemplateParam;

public interface ISysTemplateParamService<T, E> extends IBaseService<TbSysTemplateParam, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysTemplateService.java`

- Purpose: Service interface; declares interface ISysTemplateService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysTemplateService <T, E> extends IBaseService<TbSysTemplate, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysTemplate`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysTemplateService.java`
- Size: 1015 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysTemplate;

public interface ISysTemplateService<T, E> extends IBaseService<TbSysTemplate, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysTokenService.java`

- Purpose: Service interface; declares interface ISysTokenService; has 2 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysTokenService <T, E> extends IBaseService<TbSysToken, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysToken`, `org.qifu.core.vo.BoardDemo`
- Main methods:
  - L13 `public List<BoardDemo> findCountSizeByDatePerUser(Date date1, Date date2)`
  - L15 `public Long countSizeByDate(Date date1, Date date2)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysTokenService.java`
- Size: 533 bytes

#### Source

````java
package org.qifu.core.service;

import java.util.Date;
import java.util.List;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.vo.BoardDemo;

public interface ISysTokenService<T, E> extends IBaseService<TbSysToken, String> {

	public List<BoardDemo> findCountSizeByDatePerUser(Date date1, Date date2) throws ServiceException;
	
	public Long countSizeByDate(Date date1, Date date2) throws ServiceException;	
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysUploadService.java`

- Purpose: Service interface; declares interface ISysUploadService; has 2 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysUploadService <T, E> extends IBaseService<TbSysUpload, String>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysUpload`
- Main methods:
  - L39 `public DefaultResult<TbSysUpload> selectByPrimaryKeySimple(String oid)`
  - L49 `public DefaultResult<Boolean> deleteTmpContentBySystem(String systemId)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysUploadService.java`
- Size: 1684 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysUpload;

public interface ISysUploadService<T, E> extends IBaseService<TbSysUpload, String> {
	
	/**
	 * no CONTENT field for query , because sometime no need use this field, maybe field byte is big
	 * 
	 * @param oid
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<TbSysUpload> selectByPrimaryKeySimple(String oid) throws ServiceException;	
	
	/**
	 * 刪除 IS_FILE='N' && CONTENT 欄位放byte 類別為暫存的資料
	 * 
	 * @param systemId
	 * @return
	 * @throws ServiceException
	 * @throws Exception
	 */
	public DefaultResult<Boolean> deleteTmpContentBySystem(String systemId) throws ServiceException;
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/ISysUsessService.java`

- Purpose: Service interface; declares interface ISysUsessService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface ISysUsessService <T, E> extends IBaseService<TbSysUsess, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbSysUsess`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\ISysUsessService.java`
- Size: 1037 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbSysUsess;

//change use ISysTokenService
public interface ISysUsessService<T, E> extends IBaseService<TbSysUsess, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/service/IUserRoleService.java`

- Purpose: Service interface; declares interface IUserRoleService; depends on 2 org.qifu local types
- Package: `org.qifu.core.service`
- Role: Service interface
- Main types: `interface IUserRoleService <T, E> extends IBaseService<TbUserRole, String>`
- Local dependencies: `org.qifu.base.service.IBaseService`, `org.qifu.core.entity.TbUserRole`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\service\IUserRoleService.java`
- Size: 1006 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.service;

import org.qifu.base.service.IBaseService;
import org.qifu.core.entity.TbUserRole;

public interface IUserRoleService<T, E> extends IBaseService<TbUserRole, String> {
	
}
````

### `backend/core/src/main/java/org/qifu/core/support/BaseAuthenticationSuccessHandler.java`

- Purpose: Spring component; declares class BaseAuthenticationSuccessHandler; has 5 detected methods; depends on 15 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Spring component
- Main types: `class BaseAuthenticationSuccessHandler implements AuthenticationSuccessHandler`
- Key annotations: `Component`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.ScriptTypeCode`, `org.qifu.base.model.UserRoleAndPermission`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysLoginLog`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.ISysLoginLogService`, `org.qifu.core.service.IUserRoleService`, `org.qifu.util.ScriptExpressionUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.userdetails.UserDetails`, `org.springframework.security.web.authentication.AuthenticationSuccessHandler`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L80 `public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)`
  - L102 `private void fillOfOnAuthenticationSuccess(List<TbUserRole> userRoleList, List<UserRoleAndPermission> urapList)`
  - L124 `private List<TbUserRole> findUserRoleList(String username)`
  - L155 `private void processLdapAccountData(User user)`
  - L166 `public String getCreateUserDataLdapModeScript()`
- Main fields:
  - L60 `String CREATE_USER_DATA_LDAP_MODE_SCRIPT`
  - L62 `String createUserDataLdapModeScript`
  - L64 `ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService`
  - L66 `IUserRoleService<TbUserRole, String> userRoleService`
  - L68 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\BaseAuthenticationSuccessHandler.java`
- Size: 6930 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.ScriptTypeCode;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.ISysLoginLogService;
import org.qifu.core.service.IUserRoleService;
import org.qifu.util.ScriptExpressionUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class BaseAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	private static final String CREATE_USER_DATA_LDAP_MODE_SCRIPT = "resource/create-user-data-ldap-mode.groovy";
	
	private static String createUserDataLdapModeScript = "";
	
	private final ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService;
	
	private final IUserRoleService<TbUserRole, String> userRoleService;
    
	private final IRolePermissionService<TbRolePermission, String> rolePermissionService;	
    
	public BaseAuthenticationSuccessHandler(ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService,
			IUserRoleService<TbUserRole, String> userRoleService,
			IRolePermissionService<TbRolePermission, String> rolePermissionService) {
		super();
		this.sysLoginLogService = sysLoginLogService;
		this.userRoleService = userRoleService;
		this.rolePermissionService = rolePermissionService;
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		UserDetails user = (UserDetails) authentication.getPrincipal();
		try {
			if (user instanceof @SuppressWarnings("unused") User ux) {
				User u = (User) user;
				if (YesNoKeyProvide.YES.equals(u.getByLdap())) {
					this.processLdapAccountData(u);
				}
				List<TbUserRole> userRoleList = this.findUserRoleList(user.getUsername());
				List<UserRoleAndPermission> urapList = new ArrayList<>();
				this.fillOfOnAuthenticationSuccess(userRoleList, urapList);
				u.setRoles(urapList);
			}
			TbSysLoginLog loginLog = new TbSysLoginLog();
			loginLog.setUser(user.getUsername());
			this.sysLoginLogService.insert(loginLog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("/index");
	}
	
	private void fillOfOnAuthenticationSuccess(List<TbUserRole> userRoleList, List<UserRoleAndPermission> urapList) {
		for (int i = 0; userRoleList != null && i < userRoleList.size(); i++) {
			TbUserRole ur = userRoleList.get(i);
			UserRoleAndPermission urap = new UserRoleAndPermission();
			urap.setRole(ur.getRole());
			List<TbRolePermission> rPermList = ur.getRolePermission();
			if (urap.getRolePermission() == null) {
				urap.setRolePermission(new ArrayList<>());
			}
			for (int j = 0; rPermList != null && j < rPermList.size(); j++) {
				if (!PermissionType.VIEW.name().equals(rPermList.get(j).getPermType())) {
					continue;
				}						
				RolePermissionAttr rpa = new RolePermissionAttr();
				rpa.setPermission(rPermList.get(j).getPermission());
				rpa.setType(rPermList.get(j).getPermType());
				urap.getRolePermission().add(rpa);
			}
			urapList.add(urap);
		}		
	}
	
    private List<TbUserRole> findUserRoleList(String username) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("account", username);
        DefaultResult<List<TbUserRole>> result = null;
        try {
            result = userRoleService.selectListByParams(paramMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == result) {
        	return new ArrayList<>();
        }
        List<TbUserRole> roleList = result.getValue();
        for (int i = 0; roleList != null && i < roleList.size(); i++) {
        	TbUserRole userRole = roleList.get(i);
        	paramMap.clear();
        	paramMap.put("role", userRole.getRole());
        	try {
				DefaultResult<List<TbRolePermission>> permResult = rolePermissionService.selectListByParams(paramMap);
				userRole.setRolePermission( permResult.getValue() );
			} catch (Exception e) {
				e.printStackTrace();
			}
        	if (userRole.getRolePermission() == null) {
        		userRole.setRolePermission( new ArrayList<>() );
        	}
        }
        paramMap.clear();
        return roleList;
    }
    
    private void processLdapAccountData(User user) {
    	Map<String, Object> paramMap = new HashMap<>();
    	paramMap.put("user", user);
    	try {
			ScriptExpressionUtils.execute(ScriptTypeCode.GROOVY, getCreateUserDataLdapModeScript(), null, paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	paramMap.clear();
    }
    
	public static String getCreateUserDataLdapModeScript() throws IOException {
		if ( !StringUtils.isBlank(createUserDataLdapModeScript) ) {
			return createUserDataLdapModeScript;
		}
		try (InputStream is = BaseAuthenticationSuccessHandler.class.getClassLoader().getResource( CREATE_USER_DATA_LDAP_MODE_SCRIPT ).openStream()) {
			createUserDataLdapModeScript = IOUtils.toString(is, Constants.BASE_ENCODING);
		}
		return createUserDataLdapModeScript;
	}    
    
}
````

### `backend/core/src/main/java/org/qifu/core/support/BaseLoginUrlAuthenticationEntryPoint.java`

- Purpose: Java class; declares class BaseLoginUrlAuthenticationEntryPoint; has 1 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Java class
- Main types: `class BaseLoginUrlAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.CoreAppConstants`, `org.qifu.base.model.YesNoKeyProvide`
- Spring dependencies: `org.springframework.security.core.AuthenticationException`, `org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint`
- Third-party dependencies: `org.apache.commons.lang3.Strings`
- Main methods:
  - L44 `public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\BaseLoginUrlAuthenticationEntryPoint.java`
- Size: 2487 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.support;

import java.io.IOException;

import org.apache.commons.lang3.Strings;
import org.qifu.base.Constants;
import org.qifu.base.CoreAppConstants;
import org.qifu.base.model.YesNoKeyProvide;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BaseLoginUrlAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {

    public BaseLoginUrlAuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }
    
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        String xhrHeader = request.getHeader("X-Requested-With"); // qifu3, qifu2... bambooBSC old
        String contentType = request.getContentType().toLowerCase(); // qifu4
        if ("XMLHttpRequest".equals(xhrHeader) || Strings.CS.indexOf(contentType, "json") >-1) {
        	response.setCharacterEncoding( Constants.BASE_ENCODING );
        	response.setContentType("application/json");
        	response.getWriter().write(Constants.NO_AUTHZ_JSON_DATA);
        	return;
        }
        if (YesNoKeyProvide.YES.equals(request.getParameter(Constants.QIFU_PAGE_IN_TAB_IFRAME))) {
        	response.sendRedirect(CoreAppConstants.SYS_PAGE_TAB_LOGIN_AGAIN);
        	return;
        }
        super.commence(request, response, authException);
    }
    
}
````

### `backend/core/src/main/java/org/qifu/core/support/ExpressionJobExecuteCallable.java`

- Purpose: Java class; declares class ExpressionJobExecuteCallable; has 4 detected methods; depends on 17 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Java class
- Main types: `class ExpressionJobExecuteCallable implements Callable<ExpressionJobObj>`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.entity.TbSysExprJobLog`, `org.qifu.core.entity.TbSysMailHelper`, `org.qifu.core.model.ExpressionJobConstants`, `org.qifu.core.model.ExpressionJobObj`, `org.qifu.core.service.ISysExprJobLogService`, `org.qifu.core.service.ISysExprJobService`, `org.qifu.core.service.ISysMailHelperService`, `org.qifu.core.util.SystemSettingConfigureUtils`, `org.qifu.core.util.UserUtils`, `org.qifu.util.ScriptExpressionUtils`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L59 `public ExpressionJobObj getJobObj()`
  - L63 `public void setJobObj(ExpressionJobObj jobObj)`
  - L68 `public ExpressionJobObj call()`
  - L158 `private void sendMail()`
- Main fields:
  - L51 `Logger logger`
  - L53 `ExpressionJobObj jobObj`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\ExpressionJobExecuteCallable.java`
- Size: 8157 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.support;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.entity.TbSysExprJobLog;
import org.qifu.core.entity.TbSysMailHelper;
import org.qifu.core.model.ExpressionJobConstants;
import org.qifu.core.model.ExpressionJobObj;
import org.qifu.core.service.ISysExprJobLogService;
import org.qifu.core.service.ISysExprJobService;
import org.qifu.core.service.ISysMailHelperService;
import org.qifu.core.util.SystemSettingConfigureUtils;
import org.qifu.core.util.UserUtils;
import org.qifu.util.ScriptExpressionUtils;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpressionJobExecuteCallable implements Callable<ExpressionJobObj> {
	protected static Logger logger = LoggerFactory.getLogger(ExpressionJobExecuteCallable.class);
	
	private ExpressionJobObj jobObj = null;
	
	public ExpressionJobExecuteCallable(ExpressionJobObj jobObj) {
		this.jobObj = jobObj;
	}

	public ExpressionJobObj getJobObj() {
		return jobObj;
	}

	public void setJobObj(ExpressionJobObj jobObj) {
		this.jobObj = jobObj;
	}
	
	@Override
	public ExpressionJobObj call() throws Exception {
		Date beginDatetime = new Date();
		String faultMsg = "";
		String runStatus = "";
		String logStatus = "";
		boolean setUserInfoBackgroundMode = false;
		
		ISysExprJobService<TbSysExprJob, String> sysExprJobService = AppContext.getContext().getBean(ISysExprJobService.class);
		
		ISysExprJobLogService<TbSysExprJobLog, String> sysExprJobLogService = AppContext.getContext().getBean(ISysExprJobLogService.class);
		
		try {
			
			if (UserUtils.getCurrentUser() == null) {
				UserUtils.setUserInfoForUserLocalUtilsBackgroundMode();
				setUserInfoBackgroundMode = true;
			}
			
			logger.info("[Expression-Job] (Start) ID: {} , NAME: {}", this.jobObj.getSysExprJob().getId(), this.jobObj.getSysExprJob().getName());
			
			if (StringUtils.isBlank(jobObj.getSysExpression().getContent())) {
				faultMsg = "No expression content!";
				runStatus = ExpressionJobConstants.RUNSTATUS_FAULT;
				logStatus = ExpressionJobConstants.LOGSTATUS_NO_EXECUTE;
				return this.jobObj;
			}
			if (YesNoKeyProvide.YES.equals(this.jobObj.getSysExprJob().getCheckFault()) 
					&& ExpressionJobConstants.RUNSTATUS_FAULT.equals(this.jobObj.getSysExprJob().getRunStatus())) {
				faultMsg = "Before proccess fault, cannot execute expression job!";
				runStatus = ExpressionJobConstants.RUNSTATUS_FAULT;
				logStatus = ExpressionJobConstants.LOGSTATUS_NO_EXECUTE;
				return this.jobObj;
			}
			
			this.jobObj.getSysExprJob().setRunStatus(ExpressionJobConstants.RUNSTATUS_PROCESS_NOW);
			sysExprJobService.update( this.jobObj.getSysExprJob() );
			
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("jobObj", this.jobObj);
			ScriptExpressionUtils.execute(
					jobObj.getSysExpression().getType(), 
					jobObj.getSysExpression().getContent(), 
					paramMap, 
					paramMap);
			runStatus = ExpressionJobConstants.RUNSTATUS_SUCCESS;
			logStatus = ExpressionJobConstants.LOGSTATUS_SUCCESS;			
		} catch (ServiceException se) {
			faultMsg = se.getMessage();
			runStatus = ExpressionJobConstants.RUNSTATUS_FAULT;
			logStatus = ExpressionJobConstants.LOGSTATUS_FAULT;				
			logger.error( se.getMessage() );
		} catch (Exception e) {
			faultMsg = e.getMessage();
			if (e.getMessage()==null) { 
				faultMsg=e.toString();
			} else {
				faultMsg=e.getMessage();
			}			
			runStatus = ExpressionJobConstants.RUNSTATUS_FAULT;
			logStatus = ExpressionJobConstants.LOGSTATUS_FAULT;			
			logger.error( faultMsg );
		} finally {
			if (faultMsg.length()>2000) {
				faultMsg = faultMsg.substring(0, 2000);
			}
			jobObj.getSysExprJob().setRunStatus(runStatus);
			jobObj.getSysExprJobLog().setFaultMsg(faultMsg);
			jobObj.getSysExprJobLog().setLogStatus(logStatus);
			jobObj.getSysExprJobLog().setId( jobObj.getSysExprJob().getId() );
			jobObj.getSysExprJobLog().setBeginDatetime(beginDatetime);
			jobObj.getSysExprJobLog().setEndDatetime( new Date() );
			
			sysExprJobService.update( this.jobObj.getSysExprJob() );
			DefaultResult<TbSysExprJobLog> jobLogResult = sysExprJobLogService.insert(jobObj.getSysExprJobLog());
			if (jobLogResult.getValue() != null) {
				jobObj.setSysExprJobLog( jobLogResult.getValue() );
			}
			
			this.sendMail();
			
			logger.info("[Expression-Job] (End) ID: {} , NAME: {}", this.jobObj.getSysExprJob().getId(), this.jobObj.getSysExprJob().getName());
			
			if (setUserInfoBackgroundMode) {
				UserUtils.removeForUserLocalUtils();
			}
			
		}
		return this.jobObj;
	}	
	
	private void sendMail() {
		try {
			if (ExpressionJobConstants.CONTACT_MODE_NO.equals(this.jobObj.getSysExprJob().getContactMode())) {
				return;
			}
			if (ExpressionJobConstants.CONTACT_MODE_ONLY_FAULT.equals(this.jobObj.getSysExprJob().getContactMode()) 
					&& !ExpressionJobConstants.RUNSTATUS_FAULT.equals(this.jobObj.getSysExprJob().getRunStatus())) {
				return;
			}
			if (ExpressionJobConstants.CONTACT_MODE_ONLY_SUCCESS.equals(this.jobObj.getSysExprJob().getContactMode()) 
					&& !ExpressionJobConstants.RUNSTATUS_SUCCESS.equals(this.jobObj.getSysExprJob().getRunStatus())) {
				return;
			}
			String contact = StringUtils.defaultString(this.jobObj.getSysExprJob().getContact()).trim();
			if (StringUtils.isBlank(contact)) {
				return;
			}
			String subject = this.jobObj.getSysExprJob().getId() + " - " + this.jobObj.getSysExprJob().getName();
			String content = subject + Constants.HTML_BR;
			content += "Run status: " + this.jobObj.getSysExprJob().getRunStatus() + Constants.HTML_BR;
			content += "Start: " + this.jobObj.getSysExprJobLog().getBeginDatetime().toString() + Constants.HTML_BR;
			content += "End: " + this.jobObj.getSysExprJobLog().getEndDatetime().toString() + Constants.HTML_BR;
			if (ExpressionJobConstants.RUNSTATUS_FAULT.equals(this.jobObj.getSysExprJob().getRunStatus())) {
				content += Constants.HTML_BR;
				content += "Fault: " + Constants.HTML_BR;
				content += this.jobObj.getSysExprJobLog().getFaultMsg();
			}
			
			ISysMailHelperService<TbSysMailHelper, String> sysMailHelperService = AppContext.getContext().getBean(ISysMailHelperService.class);
			
			String mailId = SimpleUtils.getStrYMD("");
			TbSysMailHelper mailHelper = new TbSysMailHelper();
			mailHelper.setMailId( sysMailHelperService.findForMaxMailIdComplete(mailId) );
			mailHelper.setMailFrom( SystemSettingConfigureUtils.getMailDefaultFromValue() );
			mailHelper.setMailTo( contact );
			mailHelper.setSubject( subject );
			mailHelper.setText( content.getBytes(Constants.BASE_ENCODING) );
			mailHelper.setRetainFlag(YesNoKeyProvide.NO);
			mailHelper.setSuccessFlag(YesNoKeyProvide.NO);
			sysMailHelperService.insert(mailHelper);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/support/JwtAuthEntryPoint.java`

- Purpose: Spring component; declares class JwtAuthEntryPoint; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Spring component
- Main types: `class JwtAuthEntryPoint implements AuthenticationEntryPoint`
- Key annotations: `Component`, `Override`
- Local dependencies: `org.qifu.util.LoadResources`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.security.core.AuthenticationException`, `org.springframework.security.web.AuthenticationEntryPoint`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L24 `public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)`
- Main fields:
  - L21 `Logger logger`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\JwtAuthEntryPoint.java`
- Size: 1495 bytes

#### Source

````java
package org.qifu.core.support;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.qifu.util.LoadResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthEntryPoint implements AuthenticationEntryPoint {
	protected static Logger logger = LoggerFactory.getLogger(JwtAuthEntryPoint.class);

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
	    logger.error("Unauthorized error: {}", authException.getMessage());

	    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
	    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	    
	    Map<String, Object> body = new HashMap<>();
	    body.put("status", HttpServletResponse.SC_UNAUTHORIZED);
	    body.put("error", "Unauthorized");
	    body.put("message", authException.getMessage());
	    body.put("path", request.getServletPath());
	    
	    LoadResources.getObjectMapper().writeValue(response.getOutputStream(), body);
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/support/JwtAuthLoginedUserRoleService.java`

- Purpose: Spring component; declares class JwtAuthLoginedUserRoleService; has 11 detected methods; depends on 16 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Spring component
- Main types: `class JwtAuthLoginedUserRoleService`
- Key annotations: `Component`, `Resource`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.ScriptTypeCode`, `org.qifu.base.model.UserRoleAndPermission`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysLoginLog`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.ISysLoginLogService`, `org.qifu.core.service.IUserRoleService`, `org.qifu.util.ScriptExpressionUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.userdetails.UserDetails`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`
- Injection/config points:
  - L50 `@Resource` -> `public void setSysLoginLogService(ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService) {`
  - L59 `@Resource` -> `public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService) {`
  - L68 `@Resource` -> `public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService) {`
- Main methods:
  - L46 `public ISysLoginLogService<TbSysLoginLog, String> getSysLoginLogService()`
  - L51 `public void setSysLoginLogService(ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService)`
  - L55 `public IUserRoleService<TbUserRole, String> getUserRoleService()`
  - L60 `public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService)`
  - L64 `public IRolePermissionService<TbRolePermission, String> getRolePermissionService()`
  - L69 `public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService)`
  - L73 `public void onLoginedSuccess(Authentication authentication)`
  - L94 `private void fillOfOnLoginedSuccess(List<TbUserRole> userRoleList, List<UserRoleAndPermission> urapList)`
  - L116 `private List<TbUserRole> findUserRoleList(String username)`
  - L139 `private void processLdapAccountData(User user)`
  - L150 `public String getCreateUserDataLdapModeScript()`
- Main fields:
  - L36 `String CREATE_USER_DATA_LDAP_MODE_SCRIPT`
  - L38 `String createUserDataLdapModeScript`
  - L40 `ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService`
  - L42 `IUserRoleService<TbUserRole, String> userRoleService`
  - L44 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\JwtAuthLoginedUserRoleService.java`
- Size: 6029 bytes

#### Source

````java
package org.qifu.core.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.ScriptTypeCode;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.ISysLoginLogService;
import org.qifu.core.service.IUserRoleService;
import org.qifu.util.ScriptExpressionUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class JwtAuthLoginedUserRoleService {
	private static final String CREATE_USER_DATA_LDAP_MODE_SCRIPT = "resource/create-user-data-ldap-mode.groovy";
	
	private static String createUserDataLdapModeScript = "";
	
	private ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService;
	
	private IUserRoleService<TbUserRole, String> userRoleService;
    
	private IRolePermissionService<TbRolePermission, String> rolePermissionService;		
	
	public ISysLoginLogService<TbSysLoginLog, String> getSysLoginLogService() {
		return sysLoginLogService;
	}
	
	@Resource
	public void setSysLoginLogService(ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService) {
		this.sysLoginLogService = sysLoginLogService;
	}

	public IUserRoleService<TbUserRole, String> getUserRoleService() {
		return userRoleService;
	}

	@Resource
	public void setUserRoleService(IUserRoleService<TbUserRole, String> userRoleService) {
		this.userRoleService = userRoleService;
	}

	public IRolePermissionService<TbRolePermission, String> getRolePermissionService() {
		return rolePermissionService;
	}

	@Resource
	public void setRolePermissionService(IRolePermissionService<TbRolePermission, String> rolePermissionService) {
		this.rolePermissionService = rolePermissionService;
	}
    
	public void onLoginedSuccess(Authentication authentication) {
		UserDetails user = (UserDetails) authentication.getPrincipal();
		try {
			if (user instanceof @SuppressWarnings("unused") User ux) {
				User u = (User) user;
				if (YesNoKeyProvide.YES.equals(u.getByLdap())) {
					this.processLdapAccountData(u);
				}
				List<TbUserRole> userRoleList = this.findUserRoleList(user.getUsername());
				List<UserRoleAndPermission> urapList = new ArrayList<>();
				this.fillOfOnLoginedSuccess(userRoleList, urapList);
				u.setRoles(urapList);
			}
			TbSysLoginLog loginLog = new TbSysLoginLog();
			loginLog.setUser(user.getUsername());
			this.sysLoginLogService.insert(loginLog);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void fillOfOnLoginedSuccess(List<TbUserRole> userRoleList, List<UserRoleAndPermission> urapList) {
		for (int i = 0; userRoleList != null && i < userRoleList.size(); i++) {
			TbUserRole ur = userRoleList.get(i);
			UserRoleAndPermission urap = new UserRoleAndPermission();
			urap.setRole(ur.getRole());
			List<TbRolePermission> rPermList = ur.getRolePermission();
			if (urap.getRolePermission() == null) {
				urap.setRolePermission(new ArrayList<>());
			}
			for (int j = 0; rPermList != null && j < rPermList.size(); j++) {
				if (!PermissionType.VIEW.name().equals(rPermList.get(j).getPermType())) {
					continue;
				}
				RolePermissionAttr rpa = new RolePermissionAttr();
				rpa.setPermission(rPermList.get(j).getPermission());
				rpa.setType(rPermList.get(j).getPermType());
				urap.getRolePermission().add(rpa);
			}
			urapList.add(urap);
		}		
	}
	
    private List<TbUserRole> findUserRoleList(String username) throws ServiceException {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("account", username);
        DefaultResult<List<TbUserRole>> result = userRoleService.selectListByParams(paramMap);
        List<TbUserRole> roleList = result.getValue();
        for (int i = 0; roleList != null && i < roleList.size(); i++) {
        	TbUserRole userRole = roleList.get(i);
        	paramMap.clear();
        	paramMap.put("role", userRole.getRole());
        	try {
				DefaultResult<List<TbRolePermission>> permResult = rolePermissionService.selectListByParams(paramMap);
				userRole.setRolePermission( permResult.getValue() );
			} catch (Exception e) {
				e.printStackTrace();
			}
        	if (userRole.getRolePermission() == null) {
        		userRole.setRolePermission( new ArrayList<>() );
        	}
        }
        paramMap.clear();
        return roleList;
    }
    
    private void processLdapAccountData(User user) {
    	Map<String, Object> paramMap = new HashMap<>();
    	paramMap.put("user", user);
    	try {
			ScriptExpressionUtils.execute(ScriptTypeCode.GROOVY, getCreateUserDataLdapModeScript(), null, paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	paramMap.clear();
    }
    
	public static String getCreateUserDataLdapModeScript() throws IOException {
		if ( !StringUtils.isBlank(createUserDataLdapModeScript) ) {
			return createUserDataLdapModeScript;
		}
		try (InputStream is = JwtAuthLoginedUserRoleService.class.getClassLoader().getResource( CREATE_USER_DATA_LDAP_MODE_SCRIPT ).openStream()) {
			createUserDataLdapModeScript = IOUtils.toString(is, Constants.BASE_ENCODING);
		}
		return createUserDataLdapModeScript;
	}        
    
}
````

### `backend/core/src/main/java/org/qifu/core/support/SysEventLogSupport.java`

- Purpose: Java class; declares class SysEventLogSupport; has 1 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Java class
- Main types: `class SysEventLogSupport`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbSysEventLog`, `org.qifu.core.service.ISysEventLogService`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L45 `public void log(String userId, String sysId, String executeEventId, boolean permit)`
- Main fields:
  - L33 `Logger log`
  - L35 `ISysEventLogService<TbSysEventLog, String> sysEventLogService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\support\SysEventLogSupport.java`
- Size: 2319 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.support;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbSysEventLog;
import org.qifu.core.service.ISysEventLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SysEventLogSupport {
	protected static Logger log = LoggerFactory.getLogger(SysEventLogSupport.class);
	
	private static ISysEventLogService<TbSysEventLog, String> sysEventLogService;
	
	protected SysEventLogSupport() {
		throw new IllegalStateException("Support static class: SysEventLogSupport");
	}
	
	static {
		sysEventLogService = AppContext.getContext().getBean(ISysEventLogService.class);
	}
	
	public static void log(String userId, String sysId, String executeEventId, boolean permit) {
		if ( StringUtils.isBlank(userId) || StringUtils.isBlank(sysId) || StringUtils.isBlank(executeEventId) ) {
			log.warn("parameter has null value, userId={} , sysId={} , executeEventId={}", userId, sysId, executeEventId);
			return;
		}
		TbSysEventLog eventLog = new TbSysEventLog();
		eventLog.setUser(userId);
		eventLog.setSysId(sysId);
		eventLog.setExecuteEvent(executeEventId.length()>255 ? executeEventId.substring(0, 255) : executeEventId);
		eventLog.setIsPermit( permit ? YesNoKeyProvide.YES : YesNoKeyProvide.NO );
		try {
			sysEventLogService.insert(eventLog);
		} catch (Exception e) {
			e.printStackTrace();
			log.error( e.getMessage() );
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/CookieUtils.java`

- Purpose: Utility; declares class CookieUtils; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class CookieUtils`
- Local dependencies: `org.qifu.base.Constants`
- Spring dependencies: `org.springframework.http.HttpHeaders`, `org.springframework.http.ResponseCookie`
- Main methods:
  - L13 `public String getCookieValue(HttpServletRequest request, String name)`
  - L25 `public void setTokenCookie(HttpServletResponse response, String name, String value, int minutes)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\CookieUtils.java`
- Size: 1014 bytes

#### Source

````java
package org.qifu.core.util;

import org.qifu.base.Constants;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieUtils {

	public static String getCookieValue(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	public static void setTokenCookie(HttpServletResponse response, String name, String value, int minutes) {
		ResponseCookie cookie = ResponseCookie.from(name, value)
				.httpOnly(true)
				.secure(true)
				.path(Constants.FORWARD_SLASH)
				.maxAge(minutes * 60)
				.sameSite("Lax")
				.build();
		response.addHeader(HttpHeaders.SET_COOKIE, cookie.toString());
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/CoreApiSupport.java`

- Purpose: Utility; declares class CoreApiSupport; has 9 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class CoreApiSupport extends BaseApiSupport`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.PageOf`, `org.qifu.base.model.QueryControllerJsonResultObj`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.util.BaseApiSupport`, `org.qifu.base.util.UserLocalUtils`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.math.NumberUtils`
- Main methods:
  - L44 `protected <T> void setQueryGridJsonResult(QueryControllerJsonResultObj<T> jsonResult, QueryResult<T> queryResult, PageOf pageOf)`
  - L57 `protected <T> void setDefaultResponseJsonResult(DefaultControllerJsonResultObj<T> jsonResult, DefaultResult<T> actionResult)`
  - L66 `protected <T> void setDefaultResponseJsonResult(QueryResult<T> queryResult, QueryResult<T> responseResult)`
  - L82 `protected <T> void setDefaultResponseJsonResult(DefaultResult<T> queryResult, QueryResult<T> responseResult)`
  - L98 `protected <T> void setDefaultResponseJsonResult(DefaultResult<T> queryResult, DefaultControllerJsonResultObj<T> responseResult)`
  - L114 `protected <T> void setQueryResponseJsonResult(QueryResult<T> queryResult, QueryResult<T> responseResult, PageOf pageOf)`
  - L119 `protected <T> void setQueryResponseJsonResult(DefaultResult<T> queryResult, QueryResult<T> responseResult, PageOf pageOf)`
  - L124 `protected <T> CheckControllerFieldHandler<T> getCheckControllerFieldHandler(DefaultControllerJsonResultObj<T> result)`
  - L128 `protected List<String> transformAppendKeyStringToList(String appendOid)`
- Main fields:
  - L42 `long serialVersionUID`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\CoreApiSupport.java`
- Size: 5623 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.PageOf;
import org.qifu.base.model.QueryControllerJsonResultObj;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.util.BaseApiSupport;
import org.qifu.base.util.UserLocalUtils;

public class CoreApiSupport extends BaseApiSupport {
	
	private static final long serialVersionUID = -4750183395777134636L;	
	
	protected <T> void setQueryGridJsonResult(QueryControllerJsonResultObj<T> jsonResult, QueryResult<T> queryResult, PageOf pageOf) {
		if (queryResult.getValue() != null) {
			jsonResult.setValue( queryResult.getValue() );
			jsonResult.setPageOfCountSize( NumberUtils.toInt(pageOf.getCountSize(), 0) ); // queryResult.getRowCount()
			jsonResult.setPageOfSelect( NumberUtils.toInt(pageOf.getSelect(), 1) );
			jsonResult.setPageOfShowRow( NumberUtils.toInt(pageOf.getShowRow(), PageOf.DEFAULT_ROW) );
			jsonResult.setPageOfSize( NumberUtils.toInt(pageOf.getSize(), 1) );
			jsonResult.setSuccess(YesNoKeyProvide.YES);
		} else {
			jsonResult.setMessage( queryResult.getMessage() );
		}		
	}
	
	protected <T> void setDefaultResponseJsonResult(DefaultControllerJsonResultObj<T> jsonResult, DefaultResult<T> actionResult) {
		if ( actionResult.getValue() != null || (actionResult.getValue() instanceof Boolean && Boolean.TRUE.equals(actionResult.getValue())) ) {
			jsonResult.setValue(actionResult.getValue());
			jsonResult.setSuccess( YES );
		}
		jsonResult.setMessage( actionResult.getMessage() );
	}
		

	protected <T> void setDefaultResponseJsonResult(QueryResult<T> queryResult, QueryResult<T> responseResult) {
		if (queryResult == null || responseResult == null) {
			return;
		}
		if (UserLocalUtils.getUserInfo() != null) {
			responseResult.setIsAuth(YES);
		}
		if (StringUtils.isBlank(responseResult.getMessage()) && (!StringUtils.isBlank(queryResult.getMessage()))) {
			responseResult.setMessage( queryResult.getMessage() );
		}
		if ( queryResult.getValue() != null ) {
			responseResult.setValue( queryResult.getValue() );
			this.successResult(responseResult);
		}
	}
	
	protected <T> void setDefaultResponseJsonResult(DefaultResult<T> queryResult, QueryResult<T> responseResult) {
		if (queryResult == null || responseResult == null) {
			return;
		}
		if (UserLocalUtils.getUserInfo() != null) {
			responseResult.setIsAuth(YES);
		}
		if (StringUtils.isBlank(responseResult.getMessage()) && (!StringUtils.isBlank(queryResult.getMessage()))) {
			responseResult.setMessage( queryResult.getMessage() );
		}
		if ( queryResult.getValue() != null ) {
			responseResult.setValue( queryResult.getValue() );
			this.successResult(responseResult);
		}
	}	
	
	protected <T> void setDefaultResponseJsonResult(DefaultResult<T> queryResult, DefaultControllerJsonResultObj<T> responseResult) {
		if (queryResult == null || responseResult == null) {
			return;
		}
		if (UserLocalUtils.getUserInfo() != null) {
			responseResult.setIsAuth(YES);
		}
		if (StringUtils.isBlank(responseResult.getMessage()) && (!StringUtils.isBlank(queryResult.getMessage()))) {
			responseResult.setMessage( queryResult.getMessage() );
		}
		if ( queryResult.getValue() != null ) {
			responseResult.setValue( queryResult.getValue() );
			this.successResult(responseResult);
		}
	}	
	
	protected <T> void setQueryResponseJsonResult(QueryResult<T> queryResult, QueryResult<T> responseResult, PageOf pageOf) {
		this.setDefaultResponseJsonResult(queryResult, responseResult);
		responseResult.setPageOf( pageOf );
	}		

	protected <T> void setQueryResponseJsonResult(DefaultResult<T> queryResult, QueryResult<T> responseResult, PageOf pageOf) {
		this.setDefaultResponseJsonResult(queryResult, responseResult);
		responseResult.setPageOf( pageOf );
	}	
	
	protected <T> CheckControllerFieldHandler<T> getCheckControllerFieldHandler(DefaultControllerJsonResultObj<T> result) {
		return CheckControllerFieldHandler.build(result);
	}	
	
	protected List<String> transformAppendKeyStringToList(String appendOid) {
		List<String> list = new LinkedList<>();
		if (StringUtils.isBlank(appendOid)) {
			return list;
		}
		String[] tmp = appendOid.split(Constants.DEFAULT_SPLIT_DELIMITER);
		for (int i=0; tmp != null && i < tmp.length; i++) {
			if (StringUtils.isBlank(tmp[i]) || list.contains(tmp[i])) {
				continue;
			}
			list.add(tmp[i]);
		}
		return list;
	}		
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/IconUtils.java`

- Purpose: Utility; declares class IconUtils; has 5 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class IconUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysIcon`, `org.qifu.core.service.ISysIconService`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L49 `public String getUrl(String basePath, String iconId)`
  - L64 `public String getMenuIcon(String basePath, String iconId)`
  - L72 `public String getHtmlImg(String basePath, String iconId)`
  - L81 `public Map<String, String> getIconsSelectData()`
  - L94 `public String getJsData()`
- Main fields:
  - L37 `String ICON_FOLDER`
  - L39 `ISysIconService<TbSysIcon, String> sysIconService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\IconUtils.java`
- Size: 3768 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysIcon;
import org.qifu.core.service.ISysIconService;

public class IconUtils {
	public static final String ICON_FOLDER = "icons/";
	
	private static ISysIconService<TbSysIcon, String> sysIconService;
	
	protected IconUtils() {
		throw new IllegalStateException("Utils class: IconUtils");
	}
	
	static {
		sysIconService = AppContext.getContext().getBean(ISysIconService.class);
	}

	public static String getUrl(String basePath, String iconId) throws ServiceException {
		String url = "";
		if (StringUtils.isBlank(iconId)) {
			return url;
		}
		TbSysIcon sysIcon = new TbSysIcon();
		sysIcon.setIconId(iconId);
		DefaultResult<TbSysIcon> result = sysIconService.selectByUniqueKey(sysIcon);
		sysIcon = result.getValue();
		if (sysIcon!=null && StringUtils.defaultString(sysIcon.getFileName()).trim().length()>0) {
			url = basePath + ICON_FOLDER + StringUtils.defaultString(sysIcon.getFileName());
		}
		return url;
	}
	
	public static String getMenuIcon(String basePath, String iconId) throws ServiceException {
		String img = getHtmlImg(basePath, iconId);
		if (!"".equals(img)) {
			img += "&nbsp;";
		}
		return img;		
	}
	
	public static String getHtmlImg(String basePath, String iconId) throws ServiceException {
		String img = "";
		String url = getUrl(basePath, iconId);
		if (!StringUtils.isEmpty(url)) {
			img = "<img src='" + url + "' border='0' />";
		}
		return img;
	}
	
	public static Map<String, String> getIconsSelectData() throws ServiceException {
		Map<String, String> dataMap = new LinkedHashMap<>();
		DefaultResult<List<TbSysIcon>> result = sysIconService.selectList();
		if (CollectionUtils.isEmpty(result.getValue())) {
			return dataMap;
		}
		for (TbSysIcon entity : result.getValue()) {
			String label = "<img src='./" + ICON_FOLDER + entity.getFileName() + "' border='0'/>&nbsp;" + entity.getIconId();
			dataMap.put(entity.getOid(), label);
		}
		return dataMap;
	}
	
	public static String getJsData() throws ServiceException {
		StringBuilder sb = new StringBuilder();
		sb.append("var _iconData = [];");
		sb.append("\n");
		DefaultResult<List<TbSysIcon>> result = sysIconService.selectList();
		if (CollectionUtils.isEmpty(result.getValue())) {
			return sb.toString();
		}
		for (TbSysIcon entity : result.getValue()) {
			sb.append("_iconData.push({\"oid\" : \"").append( entity.getOid() ).append("\", \"iconId\" : \"").append( entity.getIconId() ).append("\", \"fileName\" : \"").append( entity.getFileName() ).append("\"});");
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/JReportUtils.java`

- Purpose: Utility; declares class JReportUtils; has 10 detected methods; depends on 12 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class JReportUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.JasperreportConfigProperties`, `org.qifu.core.entity.TbSysJreport`, `org.qifu.core.entity.TbSysJreportParam`, `org.qifu.core.service.ISysJreportParamService`, `org.qifu.core.service.ISysJreportService`, `org.qifu.util.DataUtils`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `net.lingala.zip4j.ZipFile`, `net.sf.jasperreports.engine.JRException`, `net.sf.jasperreports.engine.JasperCompileManager`, `net.sf.jasperreports.engine.JasperFillManager`, `net.sf.jasperreports.engine.JasperPrint`, `net.sf.jasperreports.export.SimpleExporterInput`, `net.sf.jasperreports.export.SimpleOutputStreamExporterOutput`, `net.sf.jasperreports.pdf.JRPdfExporter`, `net.sf.jasperreports.pdf.SimplePdfExporterConfiguration`
- Main methods:
  - L91 `private String getDataSourceIdByReportId(String reportId)`
  - L98 `private Connection getConnectionByReportId(String reportId)`
  - L105 `public void fillReportToResponse(String reportId, HttpServletRequest request, HttpServletResponse response)`
  - L111 `public void fillReportToResponse(String reportId, Map<String, Object> paramMap, HttpServletResponse response)`
  - L170 `public void deployReport(TbSysJreport report)`
  - L195 `public void deploy()`
  - L217 `public String compileReportToJasperFile(File[] sourceFile)`
  - L233 `public String compileReportToJasperFile(String[] files)`
  - L253 `public String selfTestDecompress4Upload(String uploadOid)`
  - L266 `public Map<String, Object> getParameter(String reportId, HttpServletRequest request)`
- Main fields:
  - L70 `Logger logger`
  - L72 `JasperreportConfigProperties jasperreportConfigProperties`
  - L74 `ISysJreportService<TbSysJreport, String> sysJreportService`
  - L76 `ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService`
  - L78 `String JASPER_SUB_NAME`
  - L79 `String JRXML_SUB_NAME`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\JReportUtils.java`
- Size: 10589 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.JasperreportConfigProperties;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.service.ISysJreportParamService;
import org.qifu.core.service.ISysJreportService;
import org.qifu.util.DataUtils;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import net.lingala.zip4j.ZipFile;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.pdf.JRPdfExporter;
import net.sf.jasperreports.pdf.SimplePdfExporterConfiguration;

public class JReportUtils {
	protected static Logger logger = LoggerFactory.getLogger(JReportUtils.class);
	
	private static JasperreportConfigProperties jasperreportConfigProperties;
	
	private static ISysJreportService<TbSysJreport, String> sysJreportService;
	
	private static ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService;
	
	private static final String JASPER_SUB_NAME = ".jasper";
	private static final String JRXML_SUB_NAME = ".jrxml";
	
	protected JReportUtils() {
		throw new IllegalStateException("Utils class: JReportUtils");
	}
	
	static {
		jasperreportConfigProperties = AppContext.getContext().getBean(JasperreportConfigProperties.class);
		sysJreportService = AppContext.getContext().getBean(ISysJreportService.class);
		sysJreportParamService = AppContext.getContext().getBean(ISysJreportParamService.class);
	}
	
	private static String getDataSourceIdByReportId(String reportId) {
		if ("TEST".equals(reportId)) {
			return "dataSourceTest";
		}
		return "dataSource";
	}
	
	private static Connection getConnectionByReportId(String reportId) {
		return DataUtils.getConnection(getDataSourceIdByReportId(reportId));
	}
	
	// =========================
	// export to response
	// =========================
	public static void fillReportToResponse(String reportId, HttpServletRequest request, HttpServletResponse response)
			throws ServiceException, IOException {
		Map<String, Object> paramMap = getParameter(reportId, request);
		fillReportToResponse(reportId, paramMap, response);
	}
	
	public static void fillReportToResponse(String reportId, Map<String, Object> paramMap, HttpServletResponse response)
			throws ServiceException, IOException {
		if (StringUtils.isBlank(reportId)) {
			throw new IllegalArgumentException("reportId is blank");
		}
		response.setContentType("application/pdf");
		String jasperFile = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator
				+ reportId + JASPER_SUB_NAME;
		try (InputStream reportSource = new FileInputStream(jasperFile)) {
			fillReport(reportId, reportSource, paramMap, response.getOutputStream());
		}
	}
	
	public static void fillReportToByteArray(String reportId, Map<String, Object> paramMap,
			ByteArrayOutputStream outputStream) throws ServiceException, IOException {
		String jasperFile = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator
				+ reportId + JASPER_SUB_NAME;
		try (InputStream reportSource = new FileInputStream(jasperFile)) {
			fillReport(reportId, reportSource, paramMap, outputStream);
		}
	}
	
	// =========================
	// core fill report
	// =========================
	private static void fillReport(String reportId, InputStream reportSource, Map<String, Object> paramMap,
			OutputStream outputStream) {
		Connection conn = null;
		try {
			conn = getConnectionByReportId(reportId);
			JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, paramMap, conn);
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));
			SimplePdfExporterConfiguration config = new SimplePdfExporterConfiguration();
			if (!StringUtils.isBlank(jasperreportConfigProperties.getOwner())) {
				config.setOwnerPassword(jasperreportConfigProperties.getOwner());
			}
			exporter.setConfiguration(config);
			exporter.exportReport();
			outputStream.flush();
		} catch (Exception e) {
			logger.error("fillReport error", e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			}
			IOUtils.closeQuietly(reportSource);
			IOUtils.closeQuietly(outputStream);
		}
	}
	
	// =========================
	// deploy report
	// =========================
	public static void deployReport(TbSysJreport report) throws ServiceException, IOException, JRException {
		String baseDir = jasperreportConfigProperties.getSource() + File.separator;
		File root = new File(baseDir);
		if (!root.exists()) {
			FileUtils.forceMkdir(root);
		}
		String zipPath = baseDir + report.getReportId() + ".zip";
		File zipFile = new File(zipPath);
		if (zipFile.exists()) {
			FileUtils.forceDelete(zipFile);
		}		
		try (FileOutputStream fos = new FileOutputStream(zipFile)) {
			fos.write(report.getContent());
			fos.flush();
			try (ZipFile zip = new ZipFile(zipPath)) {
				zip.extractAll(baseDir);
				String folder = baseDir + report.getReportId() + File.separator;
				File dir = new File(folder);
				if (YesNoKeyProvide.YES.equals(report.getIsCompile()) && report.getFile().endsWith(JRXML_SUB_NAME)) {
					compileReportToJasperFile(dir.listFiles());
				}
			}
		}
	}
	
	public static void deploy() throws ServiceException, JRException {
		logger.info("begin deploy...");
		DefaultResult<List<TbSysJreport>> result = sysJreportService.selectList();
		String baseDir = jasperreportConfigProperties.getSource() + File.separator;
		File dir = new File(baseDir);
		try {
			if (dir.exists()) {
				FileUtils.forceDelete(dir);
			}
			FileUtils.forceMkdir(dir);
			for (TbSysJreport r : result.getValue()) {
				deployReport(r);
			}
		} catch (IOException e) {
			logger.error("deploy error", e);
		}
		logger.info("end deploy...");
	}
	
	// =========================
	// compile jrxml
	// =========================
	public static String compileReportToJasperFile(File[] sourceFile) throws JRException {
		String first = "";
		for (File f : sourceFile) {
			if (!f.exists() || !f.getName().endsWith(JRXML_SUB_NAME)) {
				continue;
			}
			String out = f.getPath().replaceAll(JRXML_SUB_NAME, JASPER_SUB_NAME);
			if (first.isEmpty()) {
				first = out;
			}
			JasperCompileManager.compileReportToFile(f.getPath(), out);
			logger.info("compiled {}", out);
		}
		return first;
	}

	public static String compileReportToJasperFile(String[] files) throws JRException {
		String first = "";
		for (String path : files) {
			File f = new File(path);
			if (!f.exists() || !f.getName().endsWith(JRXML_SUB_NAME)) {
				continue;
			}
			String out = f.getPath().replaceAll(JRXML_SUB_NAME, JASPER_SUB_NAME);
			if (first.isEmpty()) {
				first = out;
			}
			JasperCompileManager.compileReportToFile(f.getPath(), out);
			logger.info("compiled {}", out);
		}
		return first;
	}

	// =========================
	// upload decompress test
	// =========================
	public static String selfTestDecompress4Upload(String uploadOid) throws ServiceException, IOException {
		String extractDir = Constants.getWorkTmpDir() + File.separator + JReportUtils.class.getSimpleName()
				+ File.separator + SimpleUtils.getUUIDStr() + File.separator;
		File realFile = UploadSupportUtils.getRealFile(uploadOid);
		try (ZipFile zip = new ZipFile(realFile)) {
			zip.extractAll(extractDir);
		}
		return extractDir;
	}

	// =========================
	// parameters
	// =========================
	public static Map<String, Object> getParameter(String reportId, HttpServletRequest request)
			throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		if (StringUtils.isBlank(reportId)) {
			return paramMap;
		}
		paramMap.put("reportId", reportId);
		DefaultResult<List<TbSysJreportParam>> result = sysJreportParamService.selectListByParams(paramMap);
		paramMap.clear();
		for (TbSysJreportParam p : result.getValue()) {
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String key = names.nextElement();
				if (key.equals(p.getUrlParam())) {
					paramMap.put(p.getRptParam(), request.getParameter(key));
				}
			}
		}
		String folder = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator;
		paramMap.put("REPORT_FOLDER", folder);
		paramMap.put("SUBREPORT_DIR", folder);
		return paramMap;
	}
}
````

### `backend/core/src/main/java/org/qifu/core/util/LocaleMessageSourceUtils.java`

- Purpose: Utility; declares class LocaleMessageSourceUtils; has 3 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class LocaleMessageSourceUtils`
- Local dependencies: `org.qifu.base.AppContext`
- Spring dependencies: `org.springframework.beans.BeansException`, `org.springframework.context.MessageSource`, `org.springframework.context.i18n.LocaleContextHolder`
- Main methods:
  - L39 `public String getMessage(String code)`
  - L43 `public String getMessage(String code, Object[] args)`
  - L47 `public String getMessage(String code, Object[] args, String defaultMessage)`
- Main fields:
  - L33 `MessageSource messageSource`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\LocaleMessageSourceUtils.java`
- Size: 2035 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.util.Locale;

import org.qifu.base.AppContext;
import org.springframework.beans.BeansException;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class LocaleMessageSourceUtils {
	
    private static MessageSource messageSource;
    
    protected LocaleMessageSourceUtils() {
    	throw new IllegalStateException("Util class: LocaleMessageSourceUtils");
    }
    
    public static String getMessage(String code) {
    	return getMessage(code, null);
    }
    
    public static String getMessage(String code, Object[] args){
    	return getMessage(code, args, "");
    }
    
    public static String getMessage(String code, Object[] args, String defaultMessage){
    	if (null == messageSource) {
    		try {
    			messageSource = (MessageSource) AppContext.getBean(MessageSource.class);
			} catch (BeansException e) {
				e.printStackTrace();
			}
    	}
    	if (null == messageSource) {
            return defaultMessage;
        }
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }
    
}
````

### `backend/core/src/main/java/org/qifu/core/util/MailClientUtils.java`

- Purpose: Utility; declares class MailClientUtils; depends on 4 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class MailClientUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.Constants`, `org.qifu.base.properties.SpringMailSessionConfigProperties`, `org.qifu.core.model.MailContent`
- Spring dependencies: `org.springframework.mail.MailException`, `org.springframework.mail.javamail.JavaMailSender`, `org.springframework.mail.javamail.MimeMessageHelper`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main fields:
  - L40 `JavaMailSender mailSender`
  - L42 `SpringMailSessionConfigProperties springMailSessionConfigProperties`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\MailClientUtils.java`
- Size: 4544 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.properties.SpringMailSessionConfigProperties;
import org.qifu.core.model.MailContent;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public class MailClientUtils {
	
	private static JavaMailSender mailSender;
	
	private static SpringMailSessionConfigProperties springMailSessionConfigProperties;
	
	protected MailClientUtils() {
		throw new IllegalStateException("Utils class: MailClientUtils");
	}
	
	static {
		mailSender = AppContext.getContext().getBean(JavaMailSender.class);
		springMailSessionConfigProperties = AppContext.getContext().getBean(SpringMailSessionConfigProperties.class);
	}
	
	public static void send(
			String from, String to, 
			MailContent mc) throws MailException, MessagingException {
		send(from, to, null, null, null, null, mc);
	}		
	
	public static void send(
			String from, String to, 
			String[] cc, 
			MailContent mc) throws MailException, MessagingException {
		send(from, to, cc, null, null, null, mc);
	}	
	
	public static void send(
			String from, String to, 
			String[] cc, String[] bcc, 
			MailContent mc) throws MailException, MessagingException {
		send(from, to, cc, bcc, null, null, mc);
	}
	
	public static void send(
			String from, String to, 
			String cc, String bcc, 
			MailContent mc) throws MailException, MessagingException {
		
		String[] mailCc = null;
		String[] mailBcc = null;
		if (!StringUtils.isBlank(cc)) {
			mailCc = cc.split(Constants.DEFAULT_SPLIT_DELIMITER);
		}
		if (!StringUtils.isBlank(bcc)) {
			mailBcc = bcc.split(Constants.DEFAULT_SPLIT_DELIMITER);
		}
		send(from, to, mailCc, mailBcc, mc);
	}
	
	public static void send(
			String from, String to, 
			String[] cc, String[] bcc, 
			String[] fileNames, File[] files,
			MailContent mc) throws MailException, MessagingException {
		
		if (mailSender==null) {
			throw new IllegalArgumentException("null mailSender!");
		}
		if (StringUtils.isBlank(from) || StringUtils.isBlank(to)) {
			throw new IllegalArgumentException("from and to is required!");
		}
		if (fileNames!=null && files!=null &&  (fileNames.length != files.length)) {
			throw new IllegalArgumentException("File parameter error!");
		}
		mailSender.send( getMimeMessage(from, to, cc, bcc, fileNames, files, mc) );
	}
	
	private static MimeMessage getMimeMessage(String from, String to, 
			String[] cc, String[] bcc, 
			String[] fileNames, File[] files,
			MailContent mc) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, Constants.BASE_ENCODING);
		message.getSession().setDebug( springMailSessionConfigProperties.enableDebug() );
		helper.setFrom(from);
		String[] tos = to.split(Constants.DEFAULT_SPLIT_DELIMITER);
		for (String t : tos) {
			t = StringUtils.deleteWhitespace(StringUtils.defaultString(t));
			if (StringUtils.defaultString(t).length() > 0) {
				helper.addTo(t);
			}
		}
		helper.setSubject(mc.getSubject());
		helper.setText(mc.getContent(), true);
		if (null!=cc && cc.length>0) {
			helper.setCc(cc);
		}
		if (null!=bcc && bcc.length>0) {
			helper.setBcc(bcc);
		}
		for (int i=0; fileNames!=null && i<fileNames.length; i++) {
			helper.addAttachment(fileNames[i], files[i]);
		}
		return message;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/PdfConvertUtils.java`

- Purpose: Utility; declares class PdfConvertUtils; has 1 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class PdfConvertUtils`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.pdfbox.Loader`, `org.apache.pdfbox.pdmodel.PDDocument`, `org.apache.pdfbox.rendering.ImageType`, `org.apache.pdfbox.rendering.PDFRenderer`, `org.apache.pdfbox.tools.imageio.ImageIOUtil`
- Main methods:
  - L60 `public List<File> toImageFiles(File pdfFile, int resolution)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\PdfConvertUtils.java`
- Size: 3116 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;

public class PdfConvertUtils {
	
	protected PdfConvertUtils() {
		throw new IllegalStateException("Utils class: PdfConvertUtils");
	}
	
	public static List<String> toImageUpload(File pdfFile, int resolution, 
			String system, String uploadType, boolean isFile) throws ServiceException, IOException {
		List<String> oids = new LinkedList<>();
		List<File> imageFiles = toImageFiles(pdfFile, resolution);
		for (File file : imageFiles) {
			oids.add(
					UploadSupportUtils.create(
							system, uploadType, isFile, file, file.getName())
			);
		}
		return oids;
	}
	
	public static List<File> toImageFiles(File pdfFile, int resolution) throws IOException {
		PDDocument document = Loader.loadPDF(pdfFile);	
		PDFRenderer pdfRenderer = new PDFRenderer(document);
		File tmpDir = new File(Constants.getWorkTmpDir() + File.separator + PdfConvertUtils.class.getSimpleName() 
				+ File.separator + System.currentTimeMillis() + File.separator);
		FileUtils.forceMkdir( tmpDir );
		List<File> files = new LinkedList<>();
		int len = String.valueOf(document.getDocumentCatalog().getPages().getCount()+1).length();
		for (int i=0; i<document.getDocumentCatalog().getPages().getCount(); i++) {
			String name = StringUtils.leftPad(String.valueOf(i+1), len, "0");
			BufferedImage bufImage = pdfRenderer.renderImageWithDPI(i, resolution, ImageType.RGB);
			File imageFile = new File( tmpDir.getPath() + File.separator + name + ".png" );
			FileOutputStream fos = new FileOutputStream(imageFile);
			ImageIOUtil.writeImage(bufImage, "png", fos, resolution);
			fos.flush();
			fos.close();
			files.add(imageFile);
		}
		document.close();
		return files;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/PdfCopyPageBuilder.java`

- Purpose: Utility; declares class PdfCopyPageBuilder; has 15 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class PdfCopyPageBuilder`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.core.model.UploadTypes`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.pdfbox.Loader`, `org.apache.pdfbox.pdmodel.PDDocument`, `org.apache.pdfbox.pdmodel.PDPage`, `org.apache.pdfbox.pdmodel.PDPageContentStream`, `org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode`, `org.apache.pdfbox.pdmodel.encryption.AccessPermission`, `org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy`, `org.apache.pdfbox.pdmodel.font.PDType0Font`, `org.apache.pdfbox.text.PDFTextStripper`, `org.apache.pdfbox.util.Matrix`
- Main methods:
  - L60 `public PdfCopyPageBuilder build()`
  - L64 `public PdfCopyPageBuilder setSourceReportData(byte[] content)`
  - L72 `public PdfCopyPageBuilder setSourcePdfFile(File file)`
  - L80 `public PdfCopyPageBuilder addFindWord(String word)`
  - L90 `public PdfCopyPageBuilder setReadPassword(String password)`
  - L95 `public PdfCopyPageBuilder setModeByFindFound(boolean mode)`
  - L100 `public PdfCopyPageBuilder setForcePutAllPage(boolean forcePutAllPage)`
  - L105 `public PdfCopyPageBuilder enableWatermark(String text, String fontPath)`
  - L114 `public PdfCopyPageBuilder setEncryption(String owner, String user)`
  - L120 `public String toUpload(String system)`
  - L124 `public String toUpload(String system, String uploadType)`
  - L129 `public byte[] getContent()`
  - L189 `private void addWatermark(PDDocument doc, PDPage page, PDType0Font font, String text)`
  - L207 `private PDDocument loadSourceDocument()`
  - L217 `private boolean shouldIncludePage(String text)`
- Main fields:
  - L49 `byte[] sourceReportData`
  - L50 `List<String> findWords`
  - L51 `String readPassword`
  - L52 `boolean modeByFindFound`
  - L53 `boolean forcePutAllPage`
  - L54 `boolean enableWatermark`
  - L55 `String watermarkText`
  - L56 `String fontPath`
  - L57 `String owner`
  - L58 `String userPass`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\PdfCopyPageBuilder.java`
- Size: 7345 bytes

#### Source

````java
/* 
 * Copyright 2012-2018 qifu, qifu2 of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.core.model.UploadTypes;
import org.qifu.util.SimpleUtils;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.util.Matrix;

public class PdfCopyPageBuilder {
	private byte[] sourceReportData = null;
	private List<String> findWords = new ArrayList<>();
	private String readPassword = "";
	private boolean modeByFindFound = true;
	private boolean forcePutAllPage = false;
	private boolean enableWatermark = false;
	private String watermarkText = "";
	private String fontPath = "fonts/fireflysung.ttf";
	private String owner = "owner";
	private String userPass = "user";

	public static PdfCopyPageBuilder build() {
		return new PdfCopyPageBuilder();
	}

	public PdfCopyPageBuilder setSourceReportData(byte[] content) {
		if (content == null) {
			throw new IllegalArgumentException("null data.");
		}
		this.sourceReportData = content;
		return this;
	}

	public PdfCopyPageBuilder setSourcePdfFile(File file) throws IOException {
		if (file == null || !file.exists() || !file.isFile()) {
			throw new IllegalArgumentException("file args error.");
		}
		this.sourceReportData = FileUtils.readFileToByteArray(file);
		return this;
	}

	public PdfCopyPageBuilder addFindWord(String word) {
		if (StringUtils.isBlank(word)) {
			return this;
		}
		if (!this.findWords.contains(word)) {
			this.findWords.add(word);
		}
		return this;
	}

	public PdfCopyPageBuilder setReadPassword(String password) {
		this.readPassword = password;
		return this;
	}

	public PdfCopyPageBuilder setModeByFindFound(boolean mode) {
		this.modeByFindFound = mode;
		return this;
	}

	public PdfCopyPageBuilder setForcePutAllPage(boolean forcePutAllPage) {
		this.forcePutAllPage = forcePutAllPage;
		return this;
	}

	public PdfCopyPageBuilder enableWatermark(String text, String fontPath) {
		this.enableWatermark = true;
		this.watermarkText = text;
		if (StringUtils.isNotBlank(fontPath)) {
			this.fontPath = fontPath;
		}
		return this;
	}

	public PdfCopyPageBuilder setEncryption(String owner, String user) {
		this.owner = owner;
		this.userPass = user;
		return this;
	}
	
	public String toUpload(String system) throws ServiceException, IOException {
		return this.toUpload(system, UploadTypes.IS_TEMP);
	}
	
	public String toUpload(String system, String uploadType) throws ServiceException, IOException {
		byte[] newPdfByte = this.getContent();
		return UploadSupportUtils.create(system, uploadType, false, newPdfByte, SimpleUtils.getUUIDStr() + ".pdf");
	}

	public byte[] getContent() throws IOException {
		try (PDDocument sourceDoc = loadSourceDocument();
				PDDocument resultDoc = new PDDocument();
				ByteArrayOutputStream os = new ByteArrayOutputStream()) {
			PDFTextStripper stripper = new PDFTextStripper();
			int totalPages = sourceDoc.getNumberOfPages();
			boolean hasPage = false;
			PDType0Font font = null;

			if (enableWatermark && StringUtils.isNotBlank(watermarkText)) {
				File fontFile = new File(fontPath);
				if (!fontFile.exists()) {
					throw new IOException("Font not found: " + fontPath);
				}
				font = PDType0Font.load(resultDoc, fontFile);
			}

			for (int i = 1; i <= totalPages; i++) {
				stripper.setStartPage(i);
				stripper.setEndPage(i);
				String text = stripper.getText(sourceDoc);
				if (!shouldIncludePage(text)) {
					continue;
				}

				// =========================
				// ✔ DEEP COPY PAGE (SAFE)
				// =========================
				PDPage newPage = resultDoc.importPage(sourceDoc.getPage(i - 1));
				resultDoc.addPage(newPage);
				hasPage = true;

				// =========================
				// ✔ WATERMARK
				// =========================
				if (enableWatermark && font != null) {
					addWatermark(resultDoc, newPage, font, watermarkText);
				}
			}

			if (!hasPage) {
				resultDoc.addPage(new PDPage());
			}
			
			// =========================
			// ✔ ENCRYPT
			// =========================
			AccessPermission ap = new AccessPermission();
			ap.setCanPrint(true);
			StandardProtectionPolicy policy = new StandardProtectionPolicy(owner, userPass, ap);
			policy.setEncryptionKeyLength(128);
			resultDoc.protect(policy);
			resultDoc.save(os);
			return os.toByteArray();
		}
	}

	// =========================
	// WATERMARK (PER PAGE SAFE)
	// =========================
	private void addWatermark(PDDocument doc, PDPage page, PDType0Font font, String text) throws IOException {
		float fontSize = 60f;
		float width = page.getMediaBox().getWidth();
		float height = page.getMediaBox().getHeight();
		float centerX = width / 2;
		float centerY = height / 2;
		float textWidth = font.getStringWidth(text) / 1000f * fontSize;
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, true, true)) {
			cs.setNonStrokingColor(Color.RED);
			cs.beginText();
			cs.setFont(font, fontSize);
			Matrix m = Matrix.getRotateInstance(Math.toRadians(45), centerX - textWidth / 2, centerY);
			cs.setTextMatrix(m);
			cs.showText(text);
			cs.endText();
		}
	}

	private PDDocument loadSourceDocument() throws IOException {
		File temp = File.createTempFile("pdfbox_", ".pdf");
		FileUtils.writeByteArrayToFile(temp, sourceReportData);
		if (StringUtils.isBlank(readPassword)) {
			return Loader.loadPDF(temp);
		} else {
			return Loader.loadPDF(temp, readPassword);
		}
	}

	private boolean shouldIncludePage(String text) {
		if (forcePutAllPage) {
			return true;
		}
		for (String word : findWords) {
			boolean found = text != null && text.contains(word);
			if ((modeByFindFound && found) || (!modeByFindFound && !found)) {
				return true;
			}
		}
		return false;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/ServiceScriptExpressionUtils.java`

- Purpose: Utility; declares class ServiceScriptExpressionUtils; has 8 detected methods; depends on 14 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class ServiceScriptExpressionUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.SortType`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbSysBeanHelp`, `org.qifu.core.entity.TbSysBeanHelpExpr`, `org.qifu.core.entity.TbSysBeanHelpExprMap`, `org.qifu.core.entity.TbSysExpression`, `org.qifu.core.service.ISysBeanHelpExprMapService`, `org.qifu.core.service.ISysBeanHelpExprService`, `org.qifu.core.service.ISysBeanHelpService`, `org.qifu.core.service.ISysExpressionService`, `org.qifu.util.ScriptExpressionUtils`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.aspectj.lang.ProceedingJoinPoint`
- Main methods:
  - L71 `public boolean needProcess(String beanId, String methodName, String system)`
  - L83 `public void processBefore(String beanId, Method method, String system, ProceedingJoinPoint pjp)`
  - L87 `public void processAfter(String beanId, Method method, String system, Object resultObj, ProceedingJoinPoint pjp)`
  - L91 `private TbSysBeanHelp loadSysBeanHelperData(String beanId, String methodName, String system)`
  - L100 `private List<TbSysBeanHelpExpr> loadSysBeanHelpExprsData(TbSysBeanHelp beanHelp)`
  - L112 `private List<TbSysBeanHelpExprMap> loadSysBeanHelpExprMapsData(TbSysBeanHelpExpr beanHelpExpr)`
  - L124 `private Map<String, Object> getParameters(List<TbSysBeanHelpExprMap> beanHelpExprMaps, Object resultObj, ProceedingJoinPoint pjp)`
  - L145 `private void process(String beanId, Method method, String system, Object resultObj, ProceedingJoinPoint pjp)`
- Main fields:
  - L49 `ISysBeanHelpService<TbSysBeanHelp, String> sysBeanHelpService`
  - L51 `ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService`
  - L53 `ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> sysBeanHelpExprMapService`
  - L55 `ISysExpressionService<TbSysExpression, String> sysExpressionService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\ServiceScriptExpressionUtils.java`
- Size: 6593 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.qifu.base.AppContext;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.SortType;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbSysBeanHelp;
import org.qifu.core.entity.TbSysBeanHelpExpr;
import org.qifu.core.entity.TbSysBeanHelpExprMap;
import org.qifu.core.entity.TbSysExpression;
import org.qifu.core.service.ISysBeanHelpExprMapService;
import org.qifu.core.service.ISysBeanHelpExprService;
import org.qifu.core.service.ISysBeanHelpService;
import org.qifu.core.service.ISysExpressionService;
import org.qifu.util.ScriptExpressionUtils;

public class ServiceScriptExpressionUtils {
	
	private static ISysBeanHelpService<TbSysBeanHelp, String> sysBeanHelpService;
	
	private static ISysBeanHelpExprService<TbSysBeanHelpExpr, String> sysBeanHelpExprService;
	
	private static ISysBeanHelpExprMapService<TbSysBeanHelpExprMap, String> sysBeanHelpExprMapService;
	
	private static ISysExpressionService<TbSysExpression, String> sysExpressionService;
	
	protected ServiceScriptExpressionUtils() {
		throw new IllegalStateException("Utils class: ServiceScriptExpressionUtils");
	}
	
	static {
		sysBeanHelpService = AppContext.getContext().getBean(ISysBeanHelpService.class);
		
		sysBeanHelpExprService = AppContext.getContext().getBean(ISysBeanHelpExprService.class);
		
		sysBeanHelpExprMapService = AppContext.getContext().getBean(ISysBeanHelpExprMapService.class);
		
		sysExpressionService = AppContext.getContext().getBean(ISysExpressionService.class);
	}
	
	public static boolean needProcess(String beanId, String methodName, String system) throws ServiceException {
		boolean f = false;
		TbSysBeanHelp beanHelp = new TbSysBeanHelp();
		beanHelp.setBeanId(beanId);
		beanHelp.setMethod(methodName);
		beanHelp.setSystem(system);		
		if (sysBeanHelpService.countByUK(beanHelp)>0) {
			f = true;
		}
		return f;
	}
	
	public static void processBefore(String beanId, Method method, String system, ProceedingJoinPoint pjp) throws ServiceException {
		process(beanId, method, system, null, pjp);
	}
	
	public static void processAfter(String beanId, Method method, String system, Object resultObj, ProceedingJoinPoint pjp) throws ServiceException {
		process(beanId, method, system, resultObj, pjp);
	}
	
	private static TbSysBeanHelp loadSysBeanHelperData(String beanId, String methodName, String system) throws ServiceException {
		TbSysBeanHelp beanHelp = new TbSysBeanHelp();
		beanHelp.setBeanId(beanId);
		beanHelp.setMethod(methodName);
		beanHelp.setSystem(system);
		beanHelp = sysBeanHelpService.selectByUniqueKey(beanHelp).getValueEmptyThrowMessage();
		return beanHelp;
	}
	
	private static List<TbSysBeanHelpExpr> loadSysBeanHelpExprsData(TbSysBeanHelp beanHelp) throws ServiceException {
		List<TbSysBeanHelpExpr> exprs = null;
		Map<String, Object> params = new HashMap<>();
		params.put("helpOid", beanHelp.getOid());
		exprs = sysBeanHelpExprService.selectListByParams(params, "EXPR_SEQ", SortType.ASC).getValue();
		if (exprs == null) {
			exprs = new ArrayList<>();
		}
		params.clear();
		return exprs;		
	}
	
	private static List<TbSysBeanHelpExprMap> loadSysBeanHelpExprMapsData(TbSysBeanHelpExpr beanHelpExpr) throws ServiceException {
		List<TbSysBeanHelpExprMap> exprMaps = null;
		Map<String, Object> params = new HashMap<>();
		params.put("helpExprOid", beanHelpExpr.getOid());
		exprMaps = sysBeanHelpExprMapService.selectListByParams(params).getValue();
		if (exprMaps == null) {
			exprMaps = new ArrayList<>();
		}
		params.clear();
		return exprMaps;		
	}
	
	private static Map<String, Object> getParameters(List<TbSysBeanHelpExprMap> beanHelpExprMaps, Object resultObj, ProceedingJoinPoint pjp) {
		Object[] args = pjp.getArgs();
		Map<String, Object> dataMap = new HashMap<>();
		for (TbSysBeanHelpExprMap map : beanHelpExprMaps) {
			Object value = null;
			if (YesNoKeyProvide.YES.equals(map.getMethodResultFlag())) {
				value = resultObj;
			} else {
				for (int i=0; args!=null && i<args.length; i++) {
					if (args[i] !=null && args[i].getClass() != null 
							&& args[i].getClass().getName().equals(map.getMethodParamClass()) 
							&& map.getMethodParamIndex() == i ) {
						value = args[i];
					}
				}
			}
			dataMap.put(map.getVarName(), value);
		}
		return dataMap;
	}	
	
	private static void process(String beanId, Method method, String system, Object resultObj, ProceedingJoinPoint pjp) throws ServiceException {
		TbSysBeanHelp beanHelp = loadSysBeanHelperData(beanId, method.getName(), system);
		if (!YesNoKeyProvide.YES.equals(beanHelp.getEnableFlag()) ) {
			return;
		}
		List<TbSysBeanHelpExpr> beanHelpExprs = loadSysBeanHelpExprsData(beanHelp);
		if (CollectionUtils.isEmpty(beanHelpExprs)) {
			return;
		}
		for (TbSysBeanHelpExpr helpExpr : beanHelpExprs) {
			TbSysExpression expression = new TbSysExpression();
			expression.setExprId(helpExpr.getExprId());
			DefaultResult<TbSysExpression> eResult = sysExpressionService.selectByUniqueKey(expression);
			if (eResult.getValue()==null) {
				continue;
			}
			expression = eResult.getValue();
			List<TbSysBeanHelpExprMap> exprMaps = loadSysBeanHelpExprMapsData(helpExpr);
			ScriptExpressionUtils.execute(
					expression.getType(), 
					expression.getContent(), 
					null, 
					getParameters(exprMaps, resultObj, pjp));					
		}
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/SystemExpressionJobUtils.java`

- Purpose: Utility; declares class SystemExpressionJobUtils; has 7 detected methods; depends on 15 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class SystemExpressionJobUtils`
- Key annotations: `SuppressWarnings`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.core.entity.TbSysExprJob`, `org.qifu.core.entity.TbSysExprJobLog`, `org.qifu.core.entity.TbSysExpression`, `org.qifu.core.model.ExpressionJobConstants`, `org.qifu.core.model.ExpressionJobObj`, `org.qifu.core.service.ISysExprJobService`, `org.qifu.core.service.ISysExpressionService`, `org.qifu.core.support.ExpressionJobExecuteCallable`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`, `org.joda.time.LocalDateTime`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L74 `private boolean isRunTime(TbSysExprJob exprJob, String dayOfWeek, String hour, String minute)`
  - L98 `private boolean isRunTime(TbSysExprJob exprJob, String dayOfWeek, String hour, String minute)`
  - L109 `public void initRunStatusFlag(String system)`
  - L128 `public TbSysExprJobLog executeJobForManual(String expressionJobOid)`
  - L142 `public ExpressionJobObj getExpressionJobForManualMode(String expressionJobOid)`
  - L157 `public void executeJobs()`
  - L170 `public List<ExpressionJobObj> getExpressionJobs()`
- Main fields:
  - L55 `Logger log`
  - L57 `ISysExprJobService<TbSysExprJob, String> sysExprJobService`
  - L58 `ISysExpressionService<TbSysExpression, String> sysExpressionService`
  - L59 `BaseInfoConfigProperties baseInfoConfigProperties`
  - L61 `String SYSTEM`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\SystemExpressionJobUtils.java`
- Size: 8823 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDateTime;
import org.qifu.base.AppContext;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.core.entity.TbSysExprJob;
import org.qifu.core.entity.TbSysExprJobLog;
import org.qifu.core.entity.TbSysExpression;
import org.qifu.core.model.ExpressionJobConstants;
import org.qifu.core.model.ExpressionJobObj;
import org.qifu.core.service.ISysExprJobService;
import org.qifu.core.service.ISysExpressionService;
import org.qifu.core.support.ExpressionJobExecuteCallable;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemExpressionJobUtils {
	protected static Logger log = LoggerFactory.getLogger(SystemExpressionJobUtils.class);
	
	private static ISysExprJobService<TbSysExprJob, String> sysExprJobService;
	private static ISysExpressionService<TbSysExpression, String> sysExpressionService;
	private static BaseInfoConfigProperties baseInfoConfigProperties;
	
	private static final String SYSTEM = "system";
	
	protected SystemExpressionJobUtils() {
		throw new IllegalStateException("Utils class: SystemExpressionJobUtils");
	}
	
	static {
		sysExprJobService = AppContext.getContext().getBean(ISysExprJobService.class);
		sysExpressionService = AppContext.getContext().getBean(ISysExpressionService.class);
		baseInfoConfigProperties = AppContext.getContext().getBean(BaseInfoConfigProperties.class);
	}
	
	/**
	private static boolean isRunTime(TbSysExprJob exprJob, String dayOfWeek, String hour, String minute) {
		
		// 查 DAY_OF_WEEK
		if (!ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunDayOfWeek()) 
				&& !dayOfWeek.equals(exprJob.getRunDayOfWeek())) {
			return false;
		}
		
		// 查 HOUR
		if (!ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunHour()) 
				&& !hour.equals(exprJob.getRunHour())) {
			return false;
		}	
		
		// 查MINUTE
		if (!ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunMinute()) 
				&& !minute.equals(exprJob.getRunMinute())) {
			return false;
		}
		
		return true;
	}
	*/
	
	private static boolean isRunTime(TbSysExprJob exprJob, String dayOfWeek, String hour, String minute) {
	    return (ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunDayOfWeek()) || 
	            dayOfWeek.equals(exprJob.getRunDayOfWeek())) 
	           && 
	           (ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunHour()) || 
	            hour.equals(exprJob.getRunHour()))
	           &&
	           (ExpressionJobConstants.DATEOFWEEK_HOUR_MINUTE_ALL.equals(exprJob.getRunMinute()) || 
	            minute.equals(exprJob.getRunMinute()));
	}	
	
	public static void initRunStatusFlag(String system) throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put(SYSTEM, system);
		paramMap.put("runStatus", ExpressionJobConstants.RUNSTATUS_PROCESS_NOW);
		List<TbSysExprJob> exprJobList = sysExprJobService.selectListByParams(paramMap).getValue();
		if (CollectionUtils.isEmpty(exprJobList)) {
			return;
		}
		Date udate = new Date();
		String uuserid = SYSTEM;
		for (TbSysExprJob exprJob : exprJobList) {
			log.warn( "ExpressionJob current RUN_STATUS is 'R' update to 'Y' , Id: {} , Name: {}", exprJob.getId(), exprJob.getName() );
			exprJob.setRunStatus(ExpressionJobConstants.RUNSTATUS_SUCCESS);
			exprJob.setUdate(udate);
			exprJob.setUuserid(uuserid);
			sysExprJobService.update(exprJob);
		}
	}
	
	public static TbSysExprJobLog executeJobForManual(String expressionJobOid) throws ServiceException {
		ExpressionJobObj jobObj = getExpressionJobForManualMode(expressionJobOid);
		ExecutorService exprJobPool = Executors.newFixedThreadPool( 1 );
		try {
			@SuppressWarnings("unused")
			Object s = exprJobPool.submit( new ExpressionJobExecuteCallable(jobObj) ).get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		exprJobPool.shutdown();	
		return jobObj.getSysExprJobLog();
	}
	
	public static ExpressionJobObj getExpressionJobForManualMode(String expressionJobOid) throws ServiceException {
		if (StringUtils.isBlank(expressionJobOid)) {
			throw new IllegalArgumentException("error, expressionJobId is blank!");
		}
		TbSysExprJob exprJob = sysExprJobService.selectByPrimaryKey(expressionJobOid).getValueEmptyThrowMessage();
		TbSysExpression expr = new TbSysExpression();
		expr.setExprId(exprJob.getExprId());
		expr = sysExpressionService.selectByUniqueKey(expr).getValueEmptyThrowMessage();
		ExpressionJobObj jobObj = new ExpressionJobObj();
		jobObj.setSysExprJob(exprJob);
		jobObj.setSysExprJobLog( new TbSysExprJobLog() );
		jobObj.setSysExpression(expr);
		return jobObj;
	}
	
	public static void executeJobs() throws ServiceException, InterruptedException, ExecutionException {
		List<ExpressionJobObj> jobObjList = getExpressionJobs();
		if (CollectionUtils.isEmpty(jobObjList)) {
			return;
		}
		ExecutorService exprJobPool = Executors.newFixedThreadPool( SimpleUtils.getAvailableProcessors(jobObjList.size()) );
		for (ExpressionJobObj jobObj : jobObjList) {
			@SuppressWarnings("unused")
			Object s = exprJobPool.submit( new ExpressionJobExecuteCallable(jobObj) ).get();
		}
		exprJobPool.shutdown();		
	}
	
	public static List<ExpressionJobObj> getExpressionJobs() throws ServiceException {
		int year = Integer.parseInt(SimpleUtils.getStrYMD(SimpleUtils.IS_YEAR));
		int month = Integer.parseInt(SimpleUtils.getStrYMD(SimpleUtils.IS_MONTH));
		String dayOfWeek = String.valueOf( SimpleUtils.getDayOfWeek(year, month) );
		String hour = String.valueOf( LocalDateTime.now().getHourOfDay() );
		String minute = String.valueOf( LocalDateTime.now().getMinuteOfHour() );		
		List<ExpressionJobObj> jobObjList = new ArrayList<>();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put(SYSTEM, baseInfoConfigProperties.getSystem());
		paramMap.put("active", YesNoKeyProvide.YES);
		List<TbSysExprJob> exprJobList = sysExprJobService.selectListByParams(paramMap).getValue();
		if (CollectionUtils.isEmpty(exprJobList)) {
			return jobObjList;
		}
		for (TbSysExprJob exprJob : exprJobList) {
			boolean c = false;
			if (ExpressionJobConstants.RUNSTATUS_PROCESS_NOW.equals(exprJob.getRunStatus())) {
				log.warn( "[Expression-Job] Please check it, process now, Id: {} , name: {}", exprJob.getExprId(), exprJob.getName() );				
				c = true;
			}
			if (!isRunTime(exprJob, dayOfWeek, hour, minute)) {
				c = true;
			}
			if (c) {
                continue;
            }
			ExpressionJobObj jobObj = new ExpressionJobObj();
			jobObj.setSysExprJob(exprJob);
			jobObj.setSysExprJobLog( new TbSysExprJobLog() );
			TbSysExpression expr = new TbSysExpression();
			expr.setExprId(exprJob.getExprId());
			DefaultResult<TbSysExpression> exprResult = sysExpressionService.selectByUniqueKey(expr);
			if (exprResult.getValue() == null) {
				log.error( "[Expression-Job] Id: {} , data not found.", exprJob.getExprId());				
				log.error( exprResult.getMessage() );
				throw new ServiceException(BaseSystemMessage.dataNoExist());
			} 
			expr = exprResult.getValue();
			jobObj.setSysExpression(expr);
			jobObjList.add(jobObj);			
		}
		return jobObjList;
	}		
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/SystemSettingConfigureUtils.java`

- Purpose: Utility; declares class SystemSettingConfigureUtils; has 10 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class SystemSettingConfigureUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbSysCode`, `org.qifu.core.service.ISysCodeService`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L48 `public TbSysCode getCode(String code)`
  - L63 `public void updateParam1(String code, String value)`
  - L79 `public TbSysCode getMailDefaultFrom()`
  - L83 `public String getMailDefaultFromValue()`
  - L88 `public void updateMailDefaultFromValue(String value)`
  - L92 `public TbSysCode getMailEnable()`
  - L96 `public String getMailEnableValue()`
  - L101 `public void updateMailEnableValue(String value)`
  - L105 `public TbSysCode getFirstLoadJavascript()`
  - L109 `public String getFirstLoadJavascriptValue()`
- Main fields:
  - L33 `String CODE_TYPE`
  - L34 `String MAIL_DEFAULT_FROM_MAIL_CODE`
  - L35 `String MAIL_ENABLE_CODE`
  - L36 `String FIRST_LOAD_JAVASCRIPT_CODE`
  - L38 `ISysCodeService<TbSysCode, String> sysCodeService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\SystemSettingConfigureUtils.java`
- Size: 3738 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.service.ISysCodeService;

public class SystemSettingConfigureUtils {
	
	private static final String CODE_TYPE = "CNF";
	private static final String MAIL_DEFAULT_FROM_MAIL_CODE = "CNF_CONF001";
	private static final String MAIL_ENABLE_CODE = "CNF_CONF002";
	private static final String FIRST_LOAD_JAVASCRIPT_CODE = "CNF_CONF003";
	
	private static ISysCodeService<TbSysCode, String> sysCodeService;
	
	protected SystemSettingConfigureUtils() {
		throw new IllegalStateException("Utils class: SystemSettingConfigureUtils");
	}
	
	static {
		sysCodeService = AppContext.getContext().getBean(ISysCodeService.class);
	}
	
	public static TbSysCode getCode(String code) {
		TbSysCode sysCode = new TbSysCode();
		sysCode.setType(CODE_TYPE);
		sysCode.setCode(code);
		try {
			DefaultResult<TbSysCode> result = sysCodeService.selectByUniqueKey(sysCode);
			if (result.getValue()!=null) {
				sysCode = result.getValue();
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} 
		return sysCode;
	}	
	
	public static void updateParam1(String code, String value) throws ServiceException {
		TbSysCode sysCode = new TbSysCode();
		sysCode.setType(CODE_TYPE);
		sysCode.setCode(code);
		DefaultResult<TbSysCode> result = sysCodeService.selectByUniqueKey(sysCode);
		if (result.getValue()==null) {
			throw new ServiceException(result.getMessage());
		}
		sysCode = result.getValue();
		sysCode.setParam1( value );
		result = sysCodeService.update(sysCode);
		if (result.getValue()==null) {
			throw new ServiceException(result.getMessage());
		}
	}	
	
	public static TbSysCode getMailDefaultFrom() {
		return getCode(MAIL_DEFAULT_FROM_MAIL_CODE);
	}
	
	public static String getMailDefaultFromValue() {
		TbSysCode sysCode = getMailDefaultFrom();
		return StringUtils.defaultString(sysCode.getParam1());
	}	
	
	public static void updateMailDefaultFromValue(String value) throws ServiceException {
		updateParam1(MAIL_DEFAULT_FROM_MAIL_CODE, value);
	}	
	
	public static TbSysCode getMailEnable() {
		return getCode(MAIL_ENABLE_CODE);
	}
	
	public static String getMailEnableValue() {
		TbSysCode sysCode = getMailEnable();
		return StringUtils.defaultString(sysCode.getParam1()).trim();
	}	
	
	public static void updateMailEnableValue(String value) throws ServiceException {
		updateParam1(MAIL_ENABLE_CODE, value);
	}
	
	public static TbSysCode getFirstLoadJavascript() {
		return getCode(FIRST_LOAD_JAVASCRIPT_CODE);
	}	
	
	public static String getFirstLoadJavascriptValue() {
		TbSysCode sysCode = getFirstLoadJavascript();
		return StringUtils.defaultString( sysCode.getParam1() );
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/TemplateUtils.java`

- Purpose: Utility; declares class TemplateUtils; has 7 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class TemplateUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.entity.TbSysTemplate`, `org.qifu.core.entity.TbSysTemplateParam`, `org.qifu.core.model.TemplateResultObj`, `org.qifu.core.service.ISysTemplateParamService`, `org.qifu.core.service.ISysTemplateService`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.commons.text.StringEscapeUtils`, `freemarker.cache.StringTemplateLoader`, `freemarker.template.Configuration`, `freemarker.template.Template`, `freemarker.template.TemplateException`, `ognl.Ognl`, `ognl.OgnlException`
- Main methods:
  - L68 `private TbSysTemplate loadSysTemplate(String templateId)`
  - L75 `private List<TbSysTemplateParam> loadSysTemplateParam(String templateId)`
  - L85 `private String processTemplate(String resource, Map<String, Object> params)`
  - L125 `public TemplateResultObj getResult(String templateId, Object dataObj)`
  - L139 `public String escapeHtml4TemplateHtmlContent(String strContent)`
  - L153 `public String getResourceSrc(ClassLoader classLoader, String metaInfFile)`
  - L173 `public String processTemplate(ClassLoader classLoader, String templateResource, Map<String, Object> parameter)`
- Main fields:
  - L54 `String IS_TITLE`
  - L55 `String IS_MESSAGE`
  - L56 `ISysTemplateService<TbSysTemplate, String> sysTemplateService`
  - L57 `ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\TemplateUtils.java`
- Size: 7137 bytes

#### Source

````java
/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.entity.TbSysTemplateParam;
import org.qifu.core.model.TemplateResultObj;
import org.qifu.core.service.ISysTemplateParamService;
import org.qifu.core.service.ISysTemplateService;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import ognl.Ognl;
import ognl.OgnlException;

public class TemplateUtils {
	private static final String IS_TITLE = "title";
	private static final String IS_MESSAGE = "message";
	private static ISysTemplateService<TbSysTemplate, String> sysTemplateService;
	private static ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService;
	
	protected TemplateUtils() {
		throw new IllegalStateException("Utils class: TemplateUtils");
	}
	
	static {
		sysTemplateService = AppContext.getContext().getBean(ISysTemplateService.class);
		sysTemplateParamService = AppContext.getContext().getBean(ISysTemplateParamService.class);
	}
	
	private static TbSysTemplate loadSysTemplate(String templateId) throws ServiceException {
		TbSysTemplate sysTemplate = new TbSysTemplate();
		sysTemplate.setTemplateId(templateId);
		sysTemplate = sysTemplateService.selectByUniqueKey(sysTemplate).getValueEmptyThrowMessage();	
		return sysTemplate;
	}
	
	private static List<TbSysTemplateParam> loadSysTemplateParam(String templateId) throws ServiceException {
		Map<String, Object> params = new HashMap<>();
		params.put("templateId", templateId);
		List<TbSysTemplateParam> searchList = sysTemplateParamService.selectListByParams(params).getValue();
		if (searchList==null) {
			searchList = new ArrayList<>();
		}
		return searchList;
	}
	
	private static String processTemplate(String resource, Map<String, Object> params) throws IOException, TemplateException {
		StringTemplateLoader templateLoader = new StringTemplateLoader();
		templateLoader.putTemplate("sysTemplate", resource);
		Configuration cfg = new Configuration( Configuration.getVersion() );
		cfg.setTemplateLoader(templateLoader);
		Template template = cfg.getTemplate("sysTemplate", Constants.BASE_ENCODING);
		Writer out = new StringWriter();
		template.process(params, out);
		return out.toString();
	}
	
	private static Map<String, Object> getTemplateParamMap(String type, List<TbSysTemplateParam> sysTemplateParamList, 
			Object dataObj) throws OgnlException {
		Map<String, Object> params = new HashMap<>();
		for (TbSysTemplateParam sysTemplateParam : sysTemplateParamList) {
			if (IS_TITLE.equals(type) ) {
				if ( YesNoKeyProvide.YES.equals(sysTemplateParam.getIsTitle()) ) {
					params.put(sysTemplateParam.getTemplateVar(), Ognl.getValue(sysTemplateParam.getObjectVar(), dataObj) );
				}
			} else { // message
				if ( !YesNoKeyProvide.YES.equals(sysTemplateParam.getIsTitle()) ) {
					params.put(sysTemplateParam.getTemplateVar(), Ognl.getValue(sysTemplateParam.getObjectVar(), dataObj) );
				}				
			}
		}
		return params;
	}
	
	/**
	 * 產生 template 結果
	 * Map 值放入 title 與 message
	 * 
	 * @param templateId	樣板id
	 * @param dataObj		資料來源
	 * @return
	 * @throws ServiceException
	 * @throws OgnlException 
	 * @throws TemplateException 
	 * @throws IOException 
	 */
	public static TemplateResultObj getResult(String templateId, Object dataObj) throws ServiceException, OgnlException, IOException, TemplateException {
		if (StringUtils.isBlank(templateId) || null==dataObj) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		TemplateResultObj resultObj = new TemplateResultObj();
		TbSysTemplate sysTemplate = loadSysTemplate(templateId);
		List<TbSysTemplateParam> sysTemplateParamList = loadSysTemplateParam(templateId);
		Map<String, Object> titleParams = getTemplateParamMap(IS_TITLE, sysTemplateParamList, dataObj);
		Map<String, Object> msgParams = getTemplateParamMap(IS_MESSAGE, sysTemplateParamList, dataObj);
		resultObj.setTitle( processTemplate(sysTemplate.getTitle(), titleParams) );
		resultObj.setContent( processTemplate(sysTemplate.getMessage(), msgParams) );
		return resultObj;
	}
	
	public static String escapeHtml4TemplateHtmlContent(String strContent) {
		if (StringUtils.isBlank(strContent)) {
			return "";
		}
		return StringUtils.replace(StringEscapeUtils.escapeHtml4(strContent), "\n", Constants.HTML_BR);
	}
	
	/**
	 * 單獨提供讀取出 META-INF/ 之下的 template 檔案內容
	 * 
	 * @param classLoader
	 * @param metaInfFile
	 * @return
	 */
	public static String getResourceSrc(ClassLoader classLoader, String metaInfFile) {
		String out = "";
		try {
			out = IOUtils.toString(classLoader.getResource(metaInfFile).openStream(), Constants.BASE_ENCODING);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return out;
	}	
	
	/**
	 * 單獨提供單處理 template 取出結果
	 * 
	 * @param name
	 * @param classLoader
	 * @param templateResource
	 * @param parameter
	 * @return
	 * @throws Exception
	 */
	public static String processTemplate(ClassLoader classLoader, String templateResource, Map<String, Object> parameter) throws IOException, TemplateException {
		StringTemplateLoader templateLoader = new StringTemplateLoader();
		templateLoader.putTemplate("resourceTemplate", getResourceSrc(classLoader, templateResource) );
		Configuration cfg = new Configuration( Configuration.getVersion() );
		cfg.setTemplateLoader(templateLoader);
		Template template = cfg.getTemplate("resourceTemplate", Constants.BASE_ENCODING);
		Writer out = new StringWriter();
		template.process(parameter, out);
		return out.toString();
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/UploadSupportUtils.java`

- Purpose: Utility; declares class UploadSupportUtils; has 22 detected methods; depends on 11 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class UploadSupportUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.BaseInfoConfigProperties`, `org.qifu.core.entity.TbSysUpload`, `org.qifu.core.model.UploadTypes`, `org.qifu.core.service.ISysUploadService`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.math.NumberUtils`, `org.joda.time.DateTime`, `org.joda.time.Duration`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Config keys referenced: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Main methods:
  - L88 `public long getUploadMaxSize()`
  - L92 `public String getViewMode(String fileShowName)`
  - L113 `public Object getTransformObjectData(String uploadOid, Class<?> classesToBeBound)`
  - L122 `public void cleanTempUpload()`
  - L127 `public void cleanTempUpload(String system)`
  - L175 `public void cleanTempUpload(String system)`
  - L210 `private boolean shouldProcessFile(TbSysUpload entity, DateTime currentDateTime)`
  - L237 `public String getSubDir()`
  - L241 `public String getUploadFileDir(String system, String type)`
  - L245 `public String getUploadFileDir(String system, String subDir, String type)`
  - L253 `public File mkdirUploadFileDir(String system, String type)`
  - L257 `public File mkdirUploadFileDir(String system, String subDir, String type)`
  - L267 `public String generateRealFileName(String showName)`
  - L281 `public String generateRealFileName(File file)`
  - L288 `public File getRealFile(String uploadOid)`
  - L315 `public byte[] getDataBytes(String uploadOid)`
  - L330 `public DefaultResult<Boolean> updateType(String oid, String type)`
  - L366 `public String create(String system, String type, boolean isFile, File file, String showName)`
  - L396 `public String create(String system, String type, boolean isFile, byte[] datas, String showName)`
  - L424 `public String getFileExtensionName(String fileFullName)`
  - L436 `public TbSysUpload findUpload(String uploadOid)`
  - L447 `public TbSysUpload findUploadNoByteContent(String uploadOid)`
- Main fields:
  - L59 `Logger logger`
  - L60 `String HELP_EXPRESSION_VARIABLE`
  - L62 `long uploadMaxSize`
  - L63 `Properties props`
  - L64 `String[] viewModeFileExtension`
  - L66 `BaseInfoConfigProperties baseInfoConfigProperties`
  - L68 `ISysUploadService<TbSysUpload, String> sysUploadService`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\UploadSupportUtils.java`
- Size: 18655 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.core.entity.TbSysUpload;
import org.qifu.core.model.UploadTypes;
import org.qifu.core.service.ISysUploadService;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UploadSupportUtils {
	protected static Logger logger = LoggerFactory.getLogger(UploadSupportUtils.class);
	public static final String HELP_EXPRESSION_VARIABLE = "datas";
	private static final long DEFAULT_UPLOAD_MAX_SIZE = 8388608; // default max 8MB 
	private static long uploadMaxSize = DEFAULT_UPLOAD_MAX_SIZE;
	private static Properties props = new Properties();
	private static String[] viewModeFileExtension = null;	
	
	private static BaseInfoConfigProperties baseInfoConfigProperties;
	
	private static ISysUploadService<TbSysUpload, String> sysUploadService;
	
	static {
		baseInfoConfigProperties = AppContext.getContext().getBean( BaseInfoConfigProperties.class );
		sysUploadService = AppContext.getContext().getBean( ISysUploadService.class );
		try {
			props.load(UploadSupportUtils.class.getClassLoader().getResource("upload-support-utils.properties").openStream());
			viewModeFileExtension = SimpleUtils.getStr(props.getProperty("FILE_EXTENSION")).trim().split(",");
			uploadMaxSize = NumberUtils.toLong(props.getProperty("UPLOAD_MAX_SIZE"), 0);
			if (uploadMaxSize < 1048576) { // 1MB binary byte = 1048576
				uploadMaxSize = 1048576;
			}
			if (uploadMaxSize > DEFAULT_UPLOAD_MAX_SIZE) {
				uploadMaxSize = DEFAULT_UPLOAD_MAX_SIZE;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static long getUploadMaxSize() {
		return uploadMaxSize;
	}
	
	public static String getViewMode(String fileShowName) {
		String viewMode = YesNoKeyProvide.NO;
		String fileExtensionName = StringUtils.defaultString( getFileExtensionName(fileShowName) ).trim().toLowerCase();
		for (int i=0; viewModeFileExtension!=null && i<viewModeFileExtension.length; i++) {
			if (viewModeFileExtension[i].toLowerCase().equals(fileExtensionName)) {
				viewMode = YesNoKeyProvide.YES;
			}
		}
		return viewMode;
	}
	
	/**
	 * 把 上傳(upload) 的XML檔轉成Object 
	 * 
	 * @param uploadOid
	 * @param classesToBeBound
	 * @return
	 * @throws ServiceException
	 * @throws IOException 
	 * @throws JAXBException 
	 */
	public Object getTransformObjectData(String uploadOid, Class<?> classesToBeBound) throws ServiceException, IOException, JAXBException {
		Object result = null;
		byte[] xmlBytes = getDataBytes(uploadOid);
		JAXBContext jaxbContext = JAXBContext.newInstance(classesToBeBound);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		result = jaxbUnmarshaller.unmarshal( new ByteArrayInputStream(xmlBytes) );		
		return result;
	}
	
	public static void cleanTempUpload() throws ServiceException {		
		cleanTempUpload( baseInfoConfigProperties.getSystem() );
	}
	
	/**
	public static void cleanTempUpload(String system) throws ServiceException {
		logger.info("clean upload({}) temp begin...", system);
		//sysUploadService.deleteTmpContentBySystem(system); // 2020-06-27 rem
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("system", system);
		paramMap.put("type", UploadTypes.IS_TEMP);
		//paramMap.put("isFile", YesNo.YES); // 2021-05-20 rem
		DefaultResult<List<TbSysUpload>> searchListResult = sysUploadService.selectListByParams(paramMap);	
		DateTime currentDateTime = new DateTime();
		for (int i=0; searchListResult.getValue() != null && i < searchListResult.getValue().size(); i++) {
			TbSysUpload entity = searchListResult.getValue().get(i);
			// --------------------------------------------------------------------
			// 2021-05-20 add
			if (entity.getCdate() == null) {
				logger.warn("upload temp file null create date time, cannot remove, upload oid: {}", entity.getOid());
				continue;
			}
			DateTime createDateTime = new DateTime(entity.getCdate());
			Duration duration = new Duration(createDateTime, currentDateTime);
			if (duration.getStandardHours() < 4) {
				logger.warn("upload temp file no over remove check time(hour-{}, min-{}), cannot remove, upload oid: {}", duration.getStandardHours(), duration.getStandardMinutes(), entity.getOid());
				continue;
			}
			if (!YesNoKeyProvide.YES.equals(entity.getIsFile())) {
				logger.warn("delete upload not real file type, upload oid : {} , show-name: {}", entity.getOid(), entity.getShowName());
				sysUploadService.delete(entity);
				continue;
			}
			// --------------------------------------------------------------------
			String dir = getUploadFileDir(entity.getSystem(), entity.getSubDir(), entity.getType());
			String fileFullPath = dir + File.separator + entity.getFileName();
			File file = new File(fileFullPath);
			if (!file.exists()) {
				logger.warn("upload temp file no exists, upload oid: {}", entity.getOid());
				continue;
			}
			try {
				logger.warn("delete : {}", file.getPath());
				FileUtils.forceDelete(file);
				sysUploadService.delete(entity);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		logger.info("end...");
	}	
	*/
	
	public static void cleanTempUpload(String system) throws ServiceException {
	    logger.info("clean upload({}) temp begin...", system);
	    Map<String, Object> paramMap = new HashMap<>();
	    paramMap.put("system", system);
	    paramMap.put("type", UploadTypes.IS_TEMP);
	    
	    DefaultResult<List<TbSysUpload>> searchListResult = sysUploadService.selectListByParams(paramMap);
	    DateTime currentDateTime = new DateTime();
	    
	    for (int i = 0; searchListResult.getValue() != null && i < searchListResult.getValue().size(); i++) {
	        TbSysUpload entity = searchListResult.getValue().get(i);
	        
	        // Combine all validation checks into a single if condition
	        if (shouldProcessFile(entity, currentDateTime)) {
	            String dir = getUploadFileDir(entity.getSystem(), entity.getSubDir(), entity.getType());
	            String fileFullPath = dir + File.separator + entity.getFileName();
	            File file = new File(fileFullPath);
	            
	            if (file.exists()) {
	                try {
	                    logger.warn("delete : {}", file.getPath());
	                    FileUtils.forceDelete(file);
	                    sysUploadService.delete(entity);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                logger.warn("upload temp file no exists, upload oid: {}", entity.getOid());
	            }
	        }
	    }
	    logger.info("end...");
	}

	// Helper method to consolidate validation logic
	private static boolean shouldProcessFile(TbSysUpload entity, DateTime currentDateTime) {
	    // Check if create date is null
	    if (entity.getCdate() == null) {
	        logger.warn("upload temp file null create date time, cannot remove, upload oid: {}", entity.getOid());
	        return false;
	    }

	    // Check duration
	    DateTime createDateTime = new DateTime(entity.getCdate());
	    Duration duration = new Duration(createDateTime, currentDateTime);
	    if (duration.getStandardHours() < 4) {
	        logger.warn("upload temp file no over remove check time(hour-{}, min-{}), cannot remove, upload oid: {}", 
	            duration.getStandardHours(), duration.getStandardMinutes(), entity.getOid());
	        return false;
	    }

	    // Handle non-file type uploads
	    if (!YesNoKeyProvide.YES.equals(entity.getIsFile())) {
	        logger.warn("delete upload not real file type, upload oid : {} , show-name: {}", 
	            entity.getOid(), entity.getShowName());
	        sysUploadService.delete(entity);
	        return false;
	    }

	    return true;
	}
	
	public static String getSubDir() {
		return SimpleUtils.getStrYMD(SimpleUtils.IS_YEAR);
	}
	
	public static String getUploadFileDir(String system, String type) {
		return getUploadFileDir(system, getSubDir(), type);
	}
	
	public static String getUploadFileDir(String system, String subDir, String type) {
		if (StringUtils.isBlank(system) || StringUtils.isBlank(subDir) || StringUtils.isBlank(type)) {
			throw new java.lang.IllegalArgumentException("system, sub-dir and type cann't blank!");
		}
		return baseInfoConfigProperties.getUploadDir() + Constants.FORWARD_SLASH + system + Constants.FORWARD_SLASH + type 
				+ Constants.FORWARD_SLASH + subDir + Constants.FORWARD_SLASH;
	}	
	
	public static File mkdirUploadFileDir(String system, String type) throws IOException {
		return mkdirUploadFileDir(system, getSubDir(), type);
	}
	
	public static File mkdirUploadFileDir(String system, String subDir, String type) throws IOException {
		String uploadDir = getUploadFileDir(system, subDir, type);
		File dir = new File(uploadDir);
		if (dir.exists() && dir.isDirectory()) {
			return dir;
		}
		FileUtils.forceMkdir(dir);
		return dir;
	}
	
	public static String generateRealFileName(String showName) {
		if (StringUtils.isBlank(showName)) {
			throw new java.lang.IllegalArgumentException("name is blank!");
		}
		String extension = getFileExtensionName(showName);
		if (StringUtils.isBlank(extension)) {
			return SimpleUtils.getUUIDStr();
		}
		if (extension.length()>13) { // uuid 加上 點 "." 後是 37 字元 , TB_SYS_UPLOAD.FILE_NAME 最大為 50 , 50-37 = 13
			extension = extension.substring(0, 13);
		}
		return SimpleUtils.getUUIDStr() + "." + extension;
	}	
	
	public static String generateRealFileName(File file) {
		if (file==null) {
			throw new java.lang.IllegalArgumentException("file is null!");
		}
		return generateRealFileName( file.getName() );
	}
	
	public static File getRealFile(String uploadOid) throws ServiceException, IOException {
		if (StringUtils.isBlank(uploadOid)) {
			throw new IllegalArgumentException(BaseSystemMessage.parameterBlank());
		}
		TbSysUpload uploadObj = findUpload(uploadOid);
		File packageFile = null;
		if (!YesNoKeyProvide.YES.equals(uploadObj.getIsFile())) {
			File dir = new File( Constants.getWorkTmpDir() + File.separator + UploadSupportUtils.class.getSimpleName() );
			if (!dir.exists() || !dir.isDirectory()) {
				FileUtils.forceMkdir(dir);
			}			
			String tmpFileName = dir.getPath() + File.separator + SimpleUtils.getUUIDStr() + "." + getFileExtensionName(uploadObj.getShowName());
			packageFile = new File( tmpFileName );
			try (OutputStream fos = new FileOutputStream(packageFile)) {
				IOUtils.write(uploadObj.getContent(), fos);		
				fos.flush();				
			}			
		} else {
			String uploadDir = getUploadFileDir(uploadObj.getSystem(), uploadObj.getSubDir(), uploadObj.getType());
			packageFile = new File( uploadDir + File.separator + uploadObj.getFileName() );			
		}		
		if (!packageFile.exists()) {
			throw new IOException("File is missing: " + uploadObj.getFileName() );
		}
		return packageFile;
	}
	
	public static byte[] getDataBytes(String uploadOid) throws ServiceException, IOException {
		if (StringUtils.isBlank(uploadOid)) {
			throw new IllegalArgumentException(BaseSystemMessage.parameterBlank());
		}
		byte[] datas = null;
		TbSysUpload uploadObj = findUpload(uploadOid);
		datas = uploadObj.getContent();
		if (YesNoKeyProvide.YES.equals(uploadObj.getIsFile())) {
			String uploadDir = getUploadFileDir(uploadObj.getSystem(), uploadObj.getSubDir(), uploadObj.getType());
			File file = new File( uploadDir + File.separator + uploadObj.getFileName() );
			datas = FileUtils.readFileToByteArray(file);
		}
		return datas;
	}
	
	public static DefaultResult<Boolean> updateType(String oid, String type) throws ServiceException, IOException {
		DefaultResult<TbSysUpload> uploadResult = sysUploadService.selectByPrimaryKeySimple(oid);
		if (uploadResult.getValue()==null) {
			throw new ServiceException(uploadResult.getMessage());
		}
		DefaultResult<Boolean> result = new DefaultResult<>();
		result.setValue( false );
		result.setMessage( BaseSystemMessage.updateFail() );
		TbSysUpload upload = uploadResult.getValue();
		if (!YesNoKeyProvide.YES.equals(upload.getIsFile())) {
			upload.setType(type);
			uploadResult = sysUploadService.update(upload);			
			if (uploadResult.getValue() != null) {
				result.setValue( true );
				result.setMessage( uploadResult.getMessage() );
			}
			return result;
		}
		
		// move file to new dir.
		String oldFullPath = getUploadFileDir(upload.getSystem(), upload.getSubDir(), upload.getType()) + upload.getFileName();
		String newFullPath = getUploadFileDir(upload.getSystem(), upload.getSubDir(), type) + upload.getFileName();
		File newFile = new File(newFullPath);
		if (newFile.isFile() && newFile.exists()) {
			throw new IllegalArgumentException("error. file exists, cannot operate!");
		}
		File oldFile = new File(oldFullPath);
		if (!oldFile.exists()) {
			throw new IllegalArgumentException("error. file no exists: " + oldFullPath);
		}
		FileUtils.moveFile(oldFile, newFile);
		upload.setType(type);
		sysUploadService.update(upload);
		return result;
	}
	
	public static String create(String system, String type, boolean isFile, File file, String showName) throws ServiceException, IOException {
		if (StringUtils.isBlank(type) || null == file || StringUtils.isBlank(showName)) {
			throw new IllegalArgumentException(BaseSystemMessage.parameterBlank());
		}				
		if (!file.exists()) {
			throw new IllegalArgumentException("file no exists!");
		}
		TbSysUpload upload = new TbSysUpload();		
		upload.setIsFile( ( isFile ? YesNoKeyProvide.YES : YesNoKeyProvide.NO ) );
		upload.setShowName(showName);
		upload.setSystem(system);
		upload.setType(type);
		upload.setSubDir( getSubDir() );		
		if (isFile) {
			String uploadDir = getUploadFileDir(system, type);
			String uploadFileName = generateRealFileName(file);
			mkdirUploadFileDir(system, type);
			FileUtils.copyFile(file, new File(uploadDir + File.separator + uploadFileName) );
			upload.setFileName( uploadFileName );			
		} else {
			upload.setContent( FileUtils.readFileToByteArray(file) );
			upload.setFileName( " " );			
		}		
		DefaultResult<TbSysUpload> result =  sysUploadService.insert(upload);
		if ( result.getValue() == null ) {
			throw new ServiceException( result.getMessage() );
		}		
		return result.getValue().getOid();
	}
	
	public static String create(String system, String type, boolean isFile, byte[] datas, String showName) throws ServiceException, IOException {
		if (StringUtils.isBlank(type) || null == datas || StringUtils.isBlank(showName)) {
			throw new IllegalArgumentException(BaseSystemMessage.parameterBlank());
		}				
		TbSysUpload upload = new TbSysUpload();		
		upload.setIsFile( ( isFile ? YesNoKeyProvide.YES : YesNoKeyProvide.NO ) );
		upload.setShowName(showName);
		upload.setSystem(system);
		upload.setType(type);
		upload.setSubDir( getSubDir() );		
		if (isFile) {
			String uploadDir = getUploadFileDir(system, type);
			String uploadFileName = generateRealFileName(showName);
			mkdirUploadFileDir(system, type);
			File file = new File( uploadDir + File.separator + uploadFileName );
			FileUtils.writeByteArrayToFile(file, datas); 
			upload.setFileName( uploadFileName );			
		} else {
			upload.setContent( datas );
			upload.setFileName( " " );			
		}		
		DefaultResult<TbSysUpload> result =  sysUploadService.insert(upload);
		if ( result.getValue() == null ) {
			throw new ServiceException( result.getMessage() );
		}		
		return result.getValue().getOid();
	}	
	
	public static String getFileExtensionName(String fileFullName) {
		if (StringUtils.isBlank(fileFullName)) {
			return "";
		}
		String extension = "";
		String[] tmp = fileFullName.split("[.]");
		for (int i=1; tmp!=null && i<tmp.length; i++) {
			extension = tmp[i];
		}
		return extension;
	}
	
	public static TbSysUpload findUpload(String uploadOid) throws ServiceException {
		if (StringUtils.isBlank(uploadOid)) {
			throw new IllegalArgumentException("Upload OID parameter is blank!");
		}		
		DefaultResult<TbSysUpload> result = sysUploadService.selectByPrimaryKey(uploadOid);
		if (result.getValue()==null) {
			throw new ServiceException(result.getMessage());
		}
		return result.getValue();
	}
	
	public static TbSysUpload findUploadNoByteContent(String uploadOid) throws ServiceException {
		if (StringUtils.isBlank(uploadOid)) {
			throw new IllegalArgumentException("Upload OID parameter is blank!");
		}		
		DefaultResult<TbSysUpload> result = sysUploadService.selectByPrimaryKeySimple(uploadOid);
		if (result.getValue()==null) {
			throw new ServiceException(result.getMessage());
		}
		return result.getValue();
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/util/UserUtils.java`

- Purpose: Utility; declares class UserUtils; has 12 detected methods; depends on 9 org.qifu local types
- Package: `org.qifu.core.util`
- Role: Utility
- Main types: `class UserUtils`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.model.BaseUserInfo`, `org.qifu.base.model.IUserInfoProvide`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.UserRoleAndPermission`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.util.UserLocalUtils`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L62 `public User setUserInfoForUserLocalUtils()`
  - L70 `public User setUserInfoForUserLocalUtils(String accountId)`
  - L77 `public User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds)`
  - L99 `public User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap)`
  - L112 `public User setUserInfoForUserLocalUtilsBackgroundMode()`
  - L116 `public void removeForUserLocalUtils()`
  - L120 `public User getCurrentUser()`
  - L143 `public boolean isAdmin()`
  - L153 `public boolean hasRole(String roleId)`
  - L168 `public boolean isPermitted(String perm)`
  - L174 `public boolean isPermitted(String perm, String permissionType)`
  - L188 `private boolean checkPermitted(User user, String perm, String permissionType)`
- Main fields:
  - L45 `List<UserRoleAndPermission> backgroundRoleList`
  - L46 `User backgroundUser`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\util\UserUtils.java`
- Size: 6553 bytes

#### Source

````java
/*
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * -----------------------------------------------------------------------
 *
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 *
 */
package org.qifu.core.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.model.IUserInfoProvide;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.util.UserLocalUtils;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
	
	private static final List<UserRoleAndPermission> backgroundRoleList = new ArrayList<>(); 
	private static final User backgroundUser;
	
	protected UserUtils() {
		throw new IllegalStateException("Utils class: UserUtils");
	}
	
	static {
		UserRoleAndPermission backgroundUserRole1 = new UserRoleAndPermission();
		backgroundUserRole1.setRole(Constants.SUPER_ROLE_ADMIN);
		UserRoleAndPermission backgroundUserRole2 = new UserRoleAndPermission();
		backgroundUserRole2.setRole(Constants.SUPER_ROLE_ALL);
		backgroundRoleList.add(backgroundUserRole1);
		backgroundRoleList.add(backgroundUserRole2);
		backgroundUser = new User(Constants.SYSTEM_BACKGROUND_USER, "", YesNoKeyProvide.YES, backgroundRoleList);
	}
	
	public static User setUserInfoForUserLocalUtils() {
		User user = getCurrentUser();
		if (user == null) {
			return null;
		}
		return setUserInfoForUserLocalUtils(user.getUsername());
	}
	
	public static User setUserInfoForUserLocalUtils(String accountId) {
		User userInfo = new User(accountId, "", YesNoKeyProvide.YES);
		userInfo.setUserId(accountId);
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}	
	
	public static User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds) {
		User userInfo = new User(accountId, "", YesNoKeyProvide.YES);
		userInfo.setUserId(accountId);
		
		if (CollectionUtils.isNotEmpty(roleIds)) {
			List<UserRoleAndPermission> roles = roleIds.stream()
					.filter(StringUtils::isNotBlank)
					.map(roleId -> {
						UserRoleAndPermission ur = new UserRoleAndPermission();
						ur.setRole(roleId);
						return ur;
					})
					.collect(Collectors.toList());
			userInfo.setRoles(roles);
		} else {
			userInfo.setRoles(new ArrayList<>());
		}
		
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}		
	
	public static User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap) {
		User u = setUserInfoForUserLocalUtils(accountId, roleIds);
		if (u.getRoles() != null && rolePermissionMap != null) {
			for (UserRoleAndPermission urap : u.getRoles()) {
				List<RolePermissionAttr> permList = rolePermissionMap.get(urap.getRole());
				if (permList != null) {
					urap.setRolePermission(permList);
				}
			}
		}
		return u;
	}	
	
	public static User setUserInfoForUserLocalUtilsBackgroundMode() {
		return setUserInfoForUserLocalUtils(Constants.SYSTEM_BACKGROUND_USER);
	}		
	
	public static void removeForUserLocalUtils() {
		UserLocalUtils.remove();
	}
	
	public static User getCurrentUser() {
		IUserInfoProvide localUserInfo = UserLocalUtils.getUserInfo();
		
		if (localUserInfo != null && Constants.SYSTEM_BACKGROUND_USER.equals(localUserInfo.getUserId())) {
			return backgroundUser;
		}
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.getPrincipal() instanceof User user) {
			return user;
		}		
		
		if (localUserInfo instanceof User user) {
			return user;
		}
		
		if (localUserInfo instanceof BaseUserInfo userInfo) {
			return new User(userInfo.getUserId(), "", YesNoKeyProvide.NO, new ArrayList<>());
		}
		
		return null;
	}
	
	public static boolean isAdmin() {
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return user.getRoles().stream()
				.anyMatch(ur -> Constants.SUPER_ROLE_ADMIN.equals(ur.getRole()) || 
						        Constants.SUPER_ROLE_ALL.equals(ur.getRole()));
	}
	
	public static boolean hasRole(String roleId) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(roleId)) {
			return false;
		}
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return user.getRoles().stream()
				.anyMatch(ur -> roleId.equals(ur.getRole()));
	}
	
	public static boolean isPermitted(String perm) {
		return isPermitted(perm, PermissionType.SERVICE.name()) 
				|| isPermitted(perm, PermissionType.CONTROLLER.name()) 
				|| isPermitted(perm, PermissionType.VIEW.name());
	}
	
	public static boolean isPermitted(String perm, String permissionType) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(perm)) {
			return false;
		}
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return checkPermitted(user, perm, permissionType);
	}
	
	private static boolean checkPermitted(User user, String perm, String permissionType) {
		return user.getRoles().stream()
				.filter(ur -> ur != null && CollectionUtils.isNotEmpty(ur.getRolePermission()))
				.flatMap(ur -> ur.getRolePermission().stream())
				.anyMatch(rp -> rp != null && 
						        permissionType.equals(rp.getType()) && 
						        perm.equals(rp.getPermission()));
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/vo/BoardDemo.java`

- Purpose: DTO/VO/model; declares class BoardDemo; has 6 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class BoardDemo implements java.io.Serializable`
- Main methods:
  - L10 `public String getUserId()`
  - L14 `public void setUserId(String userId)`
  - L18 `public Long getCountSize()`
  - L22 `public void setCountSize(Long countSize)`
  - L26 `public String getDate()`
  - L30 `public void setDate(String date)`
- Main fields:
  - L4 `long serialVersionUID`
  - L6 `String userId`
  - L7 `Long countSize`
  - L8 `String date`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\BoardDemo.java`
- Size: 638 bytes

#### Source

````java
package org.qifu.core.vo;

public class BoardDemo implements java.io.Serializable {
	private static final long serialVersionUID = 7212364997556842953L;
	
	private String userId = "";
	private Long countSize = 0L;
	private String date = "";
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Long getCountSize() {
		return countSize;
	}
	
	public void setCountSize(Long countSize) {
		this.countSize = countSize;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/vo/MqttBrokerVO.java`

- Purpose: DTO/VO/model; declares class MqttBrokerVO, class MqttClientVO; has 16 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class MqttBrokerVO implements Serializable`; `class MqttClientVO implements Serializable`
- Main methods:
  - L15 `public String getHost()`
  - L18 `public void setHost(String host)`
  - L21 `public String getPort()`
  - L24 `public void setPort(String port)`
  - L27 `public boolean isEnable()`
  - L30 `public void setEnable(boolean enable)`
  - L33 `public int getClientSize()`
  - L36 `public void setClientSize(int clientSize)`
  - L39 `public List<MqttClientVO> getClients()`
  - L42 `public void setClients(List<MqttClientVO> clients)`
  - L52 `public String getClientId()`
  - L55 `public void setClientId(String clientId)`
  - L58 `public String getAddress()`
  - L61 `public void setAddress(String address)`
  - L64 `public int getPort()`
  - L67 `public void setPort(int port)`
- Main fields:
  - L7 `long serialVersionUID`
  - L9 `String host`
  - L10 `String port`
  - L11 `boolean enable`
  - L12 `int clientSize`
  - L13 `List<MqttClientVO> clients`
  - L47 `long serialVersionUID`
  - L48 `String clientId`
  - L49 `String address`
  - L50 `int port`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\MqttBrokerVO.java`
- Size: 1579 bytes

#### Source

````java
package org.qifu.core.vo;

import java.io.Serializable;
import java.util.List;

public class MqttBrokerVO implements Serializable {
	private static final long serialVersionUID = -1429812734123L;
	
	private String host;
	private String port;
	private boolean enable;
	private int clientSize;
	private List<MqttClientVO> clients;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public int getClientSize() {
		return clientSize;
	}
	public void setClientSize(int clientSize) {
		this.clientSize = clientSize;
	}
	public List<MqttClientVO> getClients() {
		return clients;
	}
	public void setClients(List<MqttClientVO> clients) {
		this.clients = clients;
	}
	
	public static class MqttClientVO implements Serializable {
		private static final long serialVersionUID = -2429812734123L;
		private String clientId;
		private String address;
		private int port;
		
		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
	}
}
````

### `backend/core/src/main/java/org/qifu/core/vo/MqttMessageVO.java`

- Purpose: DTO/VO/model; declares class MqttMessageVO; has 6 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class MqttMessageVO implements Serializable`
- Main methods:
  - L11 `public String getTopic()`
  - L14 `public void setTopic(String topic)`
  - L17 `public String getPayload()`
  - L20 `public void setPayload(String payload)`
  - L23 `public String getTime()`
  - L26 `public void setTime(String time)`
- Main fields:
  - L6 `long serialVersionUID`
  - L7 `String topic`
  - L8 `String payload`
  - L9 `String time`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\MqttMessageVO.java`
- Size: 609 bytes

#### Source

````java
package org.qifu.core.vo;

import java.io.Serializable;

public class MqttMessageVO implements Serializable {
	private static final long serialVersionUID = 42812734126L;
	private String topic;
	private String payload;
	private String time;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
````

### `backend/core/src/main/java/org/qifu/core/vo/MqttTopicVO.java`

- Purpose: DTO/VO/model; declares class MqttTopicVO; has 7 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class MqttTopicVO implements Serializable`
- Main methods:
  - L10 `public String getTopicMsg()`
  - L13 `public String getTopic()`
  - L16 `public void setTopic(String topic)`
  - L19 `public int getSubscriberCount()`
  - L22 `public void setSubscriberCount(int subscriberCount)`
  - L25 `public String getLastMessageTime()`
  - L28 `public void setLastMessageTime(String lastMessageTime)`
- Main fields:
  - L6 `long serialVersionUID`
  - L7 `String topic`
  - L8 `int subscriberCount`
  - L9 `String lastMessageTime`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\MqttTopicVO.java`
- Size: 782 bytes

#### Source

````java
package org.qifu.core.vo;

import java.io.Serializable;

public class MqttTopicVO implements Serializable {
	private static final long serialVersionUID = 42812734125L;
	private String topic;
	private int subscriberCount;
	private String lastMessageTime;
	public String getTopicMsg() {
		return topic;
	}	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getSubscriberCount() {
		return subscriberCount;
	}
	public void setSubscriberCount(int subscriberCount) {
		this.subscriberCount = subscriberCount;
	}
	public String getLastMessageTime() {
		return lastMessageTime;
	}
	public void setLastMessageTime(String lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}
}
````

### `backend/core/src/main/java/org/qifu/core/vo/ProgramAndMenuResult.java`

- Purpose: DTO/VO/model; declares class ProgramAndMenuResult; has 4 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class ProgramAndMenuResult implements java.io.Serializable`
- Local dependencies: `org.qifu.core.entity.TbSysProg`
- Main methods:
  - L15 `public List<Map<String, Object>> getMenuList()`
  - L19 `public void setMenuList(List<Map<String, Object>> menuList)`
  - L23 `public List<TbSysProg> getProgramList()`
  - L27 `public void setProgramList(List<TbSysProg> programList)`
- Main fields:
  - L9 `long serialVersionUID`
  - L11 `transient List<Map<String, Object>> menuList`
  - L13 `List<TbSysProg> programList`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\ProgramAndMenuResult.java`
- Size: 730 bytes

#### Source

````java
package org.qifu.core.vo;

import java.util.List;
import java.util.Map;

import org.qifu.core.entity.TbSysProg;

public class ProgramAndMenuResult implements java.io.Serializable {
	private static final long serialVersionUID = -8214299999117601069L;
	
	private transient List<Map<String, Object>> menuList = null;
	
	private List<TbSysProg> programList = null;

	public List<Map<String, Object>> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Map<String, Object>> menuList) {
		this.menuList = menuList;
	}

	public List<TbSysProg> getProgramList() {
		return programList;
	}

	public void setProgramList(List<TbSysProg> programList) {
		this.programList = programList;
	}
	
}
````

### `backend/core/src/main/java/org/qifu/core/vo/SysMenuVO.java`

- Purpose: DTO/VO/model; declares class SysMenuVO; has 20 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class SysMenuVO extends BaseValueObj implements java.io.Serializable`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.model.BaseValueObj`
- Main methods:
  - L69 `public String getOid()`
  - L73 `public void setOid(String oid)`
  - L77 `public String getProgId()`
  - L81 `public void setProgId(String progId)`
  - L85 `public String getParentOid()`
  - L89 `public void setParentOid(String parentOid)`
  - L93 `public String getEnableFlag()`
  - L97 `public void setEnableFlag(String enableFlag)`
  - L104 `public String getName()`
  - L108 `public void setName(String name)`
  - L112 `public String getUrl()`
  - L116 `public void setUrl(String url)`
  - L120 `public String getProgSystem()`
  - L124 `public void setProgSystem(String progSystem)`
  - L128 `public String getItemType()`
  - L132 `public void setItemType(String itemType)`
  - L136 `public String getIcon()`
  - L140 `public void setIcon(String icon)`
  - L144 `public String getFontIconClassId()`
  - L148 `public void setFontIconClassId(String fontIconClassId)`
- Main fields:
  - L27 `long serialVersionUID`
  - L28 `String oid`
  - L29 `String progId`
  - L30 `String parentOid`
  - L31 `String enableFlag`
  - L35 `String name`
  - L36 `String url`
  - L37 `String progSystem`
  - L38 `String itemType`
  - L39 `String icon`
  - L40 `String fontIconClassId`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\vo\SysMenuVO.java`
- Size: 3733 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.core.vo;

import org.qifu.base.model.BaseValueObj;

public class SysMenuVO extends BaseValueObj implements java.io.Serializable {
	private static final long serialVersionUID = -8753926516772899633L;
	private String oid;
	private String progId;
	private String parentOid;
	private String enableFlag;
	
	// ----------------------------------------------------------------------------
	// inner join 要用的
	private String name;
	private String url;
	private String progSystem;
	private String itemType;
	private String icon;	
	private String fontIconClassId;
	// ----------------------------------------------------------------------------
	
	public SysMenuVO() {
		
	}
	
	public SysMenuVO(String oid, String progId, String parentOid, String enableFlag) {
		this.oid = oid;
		this.progId = progId;
		this.parentOid = parentOid;
		this.enableFlag = enableFlag;
	}
	
	public SysMenuVO(String oid, String progId, String parentOid, String enableFlag, 
			String name, String url, String progSystem, String itemType, String icon, String fontIconClassId) {
		this.oid = oid;
		this.progId = progId;
		this.parentOid = parentOid;
		this.enableFlag = enableFlag;
		this.name = name;
		this.url = url;
		this.progSystem = progSystem;
		this.itemType = itemType;
		this.icon = icon;
		this.fontIconClassId = fontIconClassId;
	}
	
	@Override
	public String getOid() {
		return this.oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}	

	public String getProgId() {
		return progId;
	}

	public void setProgId(String progId) {
		this.progId = progId;
	}

	public String getParentOid() {
		return parentOid;
	}

	public void setParentOid(String parentOid) {
		this.parentOid = parentOid;
	}

	public String getEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	
	// ----------------------------------------------------------------------------
	// inner join 要用的	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProgSystem() {
		return progSystem;
	}

	public void setProgSystem(String progSystem) {
		this.progSystem = progSystem;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getFontIconClassId() {
		return fontIconClassId;
	}

	public void setFontIconClassId(String fontIconClassId) {
		this.fontIconClassId = fontIconClassId;
	}	
	
	// ----------------------------------------------------------------------------
	
}
````

### `backend/core/src/main/java/org/qifu/core/webservice/interceptor/SoapForceDoclitBareInInterceptor.java`

- Purpose: Java class; declares class SoapForceDoclitBareInInterceptor; has 1 detected methods
- Package: `org.qifu.core.webservice.interceptor`
- Role: Java class
- Main types: `class SoapForceDoclitBareInInterceptor extends AbstractPhaseInterceptor<Message>`
- Key annotations: `Override`
- Third-party dependencies: `org.apache.cxf.interceptor.Fault`, `org.apache.cxf.message.Exchange`, `org.apache.cxf.message.Message`, `org.apache.cxf.phase.AbstractPhaseInterceptor`, `org.apache.cxf.phase.Phase`, `org.apache.cxf.service.model.ServiceInfo`
- Main methods:
  - L17 `public void handleMessage(Message message)`
- Full path: `C:\home\qifu4\backend\core\src\main\java\org\qifu\core\webservice\interceptor\SoapForceDoclitBareInInterceptor.java`
- Size: 743 bytes

#### Source

````java
package org.qifu.core.webservice.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.model.ServiceInfo;

public class SoapForceDoclitBareInInterceptor extends AbstractPhaseInterceptor<Message> {

	public SoapForceDoclitBareInInterceptor() {
		super(Phase.POST_PROTOCOL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		Exchange exchange = message.getExchange();
		for (ServiceInfo si : exchange.getService().getServiceInfos()) {
			si.setProperty("soap.force.doclit.bare", true);
		}
	}

}
````

## Properties Files Detailed Analysis

### `backend/core/.gradle/8.9/dependencies-accessors/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\core\.gradle\8.9\dependencies-accessors\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/core/.gradle/8.9/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\core\.gradle\8.9\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/core/.gradle/buildOutputCleanup/cache.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `gradle`
- Keys: `gradle.version`
- Full path: `C:\home\qifu4\backend\core\.gradle\buildOutputCleanup\cache.properties`
- Size: 51 bytes

````properties
#Fri Apr 24 07:40:05 CST 2026
gradle.version=8.9
````

### `backend/core/.gradle/vcs-1/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\core\.gradle\vcs-1\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/core/bin/main/template-code-use.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `CODE`
- Keys: `CODE`
- Full path: `C:\home\qifu4\backend\core\bin\main\template-code-use.properties`
- Size: 156 bytes

````properties
# put template code value in "CORE" , when SystemTemplateLogicServiceImpl@delete will check CODE cannot do delete it.
CODE=TPLMSG0001,TPLMSG0002,TPLMSG0003
````

### `backend/core/bin/main/upload-support-utils.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 2
- Key prefixes: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Keys: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Full path: `C:\home\qifu4\backend\core\bin\main\upload-support-utils.properties`
- Size: 73 bytes

````properties
FILE_EXTENSION=pdf,png,jpg,jpeg,bmp,gif,tiff,tif
UPLOAD_MAX_SIZE=5242880
````

### `backend/core/src/main/resources/template-code-use.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `CODE`
- Keys: `CODE`
- Full path: `C:\home\qifu4\backend\core\src\main\resources\template-code-use.properties`
- Size: 156 bytes

````properties
# put template code value in "CORE" , when SystemTemplateLogicServiceImpl@delete will check CODE cannot do delete it.
CODE=TPLMSG0001,TPLMSG0002,TPLMSG0003
````

### `backend/core/src/main/resources/upload-support-utils.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 2
- Key prefixes: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Keys: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Full path: `C:\home\qifu4\backend\core\src\main\resources\upload-support-utils.properties`
- Size: 73 bytes

````properties
FILE_EXTENSION=pdf,png,jpg,jpeg,bmp,gif,tiff,tif
UPLOAD_MAX_SIZE=5242880
````

### `backend/core/target/classes/META-INF/maven/org.qifu/core-std/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 5
- Key prefixes: `artifactId`, `groupId`, `m2e`, `version`
- Keys: `artifactId`, `groupId`, `m2e.projectLocation`, `m2e.projectName`, `version`
- Full path: `C:\home\qifu4\backend\core\target\classes\META-INF\maven\org.qifu\core-std\pom.properties`
- Size: 218 bytes

````properties
#Generated by Maven Integration for Eclipse
#Fri Jun 19 22:04:24 CST 2026
artifactId=core-std
groupId=org.qifu
m2e.projectLocation=C\:\\home\\qifu4\\backend\\core
m2e.projectName=core-std
version=0.0.5-SNAPSHOT
````

### `backend/core/target/classes/template-code-use.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `CODE`
- Keys: `CODE`
- Full path: `C:\home\qifu4\backend\core\target\classes\template-code-use.properties`
- Size: 156 bytes

````properties
# put template code value in "CORE" , when SystemTemplateLogicServiceImpl@delete will check CODE cannot do delete it.
CODE=TPLMSG0001,TPLMSG0002,TPLMSG0003
````

### `backend/core/target/classes/upload-support-utils.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 2
- Key prefixes: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Keys: `FILE_EXTENSION`, `UPLOAD_MAX_SIZE`
- Full path: `C:\home\qifu4\backend\core\target\classes\upload-support-utils.properties`
- Size: 73 bytes

````properties
FILE_EXTENSION=pdf,png,jpg,jpeg,bmp,gif,tiff,tif
UPLOAD_MAX_SIZE=5242880
````

### `backend/core/target/maven-archiver/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 3
- Key prefixes: `artifactId`, `groupId`, `version`
- Keys: `artifactId`, `groupId`, `version`
- Full path: `C:\home\qifu4\backend\core\target\maven-archiver\pom.properties`
- Size: 63 bytes

````properties
artifactId=core-std
groupId=org.qifu
version=0.0.5-SNAPSHOT
````

## JSON Files Detailed Analysis

### `backend/core/bin/main/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\core\bin\main\excludePathPatterns.json`
- Size: 120 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**"
	]
}
````

### `backend/core/src/main/resources/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\core\src\main\resources\excludePathPatterns.json`
- Size: 120 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**"
	]
}
````

### `backend/core/target/classes/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\core\target\classes\excludePathPatterns.json`
- Size: 120 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**"
	]
}
````

