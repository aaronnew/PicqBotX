package cc.moecraft.icq;

import cc.moecraft.logger.environments.ColorSupportLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import static cc.moecraft.logger.environments.ColorSupportLevel.FORCED;

/**
 * The class {@code PicqConfig} stores the configuration for
 * {@code PicqBotX} in an object oriented way.
 * <p>
 * Construct an object with the toBuilder() method:
 * {@code new PicqConfig().toBuilder().build();}
 * ( https://www.baeldung.com/lombok-builder-default-value )
 * <p>
 * Class created by the HyDEV Team on 2019-03-21!
 *
 * @author HyDEV Team (https://github.com/HyDevelop)
 * @author Hykilpikonna (https://github.com/hykilpikonna)
 * @author Vanilla (https://github.com/VergeDX)
 * @since 2019-03-21 18:40
 */
@Data
@Accessors(chain = true)
@RequiredArgsConstructor
public class PicqConfig
{
    /** 接收端口 */
    private final int socketPort;

    /** 是否输出Debug消息 */
    private boolean debug = false;

    /** 是否跳过酷Q版本验证 (不推荐) */
    private boolean noVerify = false;

    /** 是否启用异步 */
    private boolean useAsync = false;

    /** 是否启用维护模式 */
    private boolean maintenanceMode = false;

    /** 维护模式回复 (设为空就不会回复了) */
    private String maintenanceResponse = "- 机器人正在维护 -";

    /** 是否开启多账号优化 */
    private boolean multiAccountOptimizations = true;

    /** 是否暂停事件 */
    private boolean eventPaused = false;

    /** 是否暂停HTTP接收 */
    private boolean httpPaused = false;

    /** X-Signature SHA1 验证秘钥 (设置为空就是不用秘钥w) */
    private String secret = "";

    /** Access Token 访问令牌 (设置为空就是不用令牌) */
    private String accessToken = "";

    /** 是否启用限速调用API ( https://cqhttp.cc/docs/4.8/#/API?id=限速调用 ) */
    private boolean apiRateLimited = false;

    /** 限速调用的速度, 单位: ms */
    private int apiRateLimitInterval = 500;

    /** 是否异步调用API */
    private boolean apiAsync = false;

    // 一次配置项 | Unchangeable config fields
    // 这里的配置init之后就不能变了w

    /** Logger颜色支持级别 */
    private ColorSupportLevel colorSupportLevel = FORCED;

    /** Logger日志路径 */
    private String logPath = "logs";

    /** Logger日志文件名 */
    private String logFileName = "PicqBotX-Log";
}
