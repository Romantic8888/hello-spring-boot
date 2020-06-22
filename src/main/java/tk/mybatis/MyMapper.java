package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author ls
 * @Date 2020/06/12 16:34:46
 * @Description
 * 自己的Mapper
 * 特别注意，该接口不能被Spring扫描到，否则报错,所以要不能放在SpringBoot启动类的同级或者子集包下。
 * @Version 1.0
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
