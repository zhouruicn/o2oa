/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.report.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.report.core.entity.Report_S_Setting.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:41:25 CST 2018")
public class Report_S_Setting_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Report_S_Setting,String> configCode;
    public static volatile SingularAttribute<Report_S_Setting,String> configName;
    public static volatile SingularAttribute<Report_S_Setting,String> configValue;
    public static volatile SingularAttribute<Report_S_Setting,String> description;
    public static volatile SingularAttribute<Report_S_Setting,String> id;
    public static volatile SingularAttribute<Report_S_Setting,Boolean> isLob;
    public static volatile SingularAttribute<Report_S_Setting,Boolean> isMultiple;
    public static volatile SingularAttribute<Report_S_Setting,Integer> orderNumber;
    public static volatile SingularAttribute<Report_S_Setting,String> selectContent;
    public static volatile SingularAttribute<Report_S_Setting,String> valueType;
}
