package com.web.jpa.onetoone;

import com.web.jpa.onetoone.Wife;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-16T21:42:01")
@StaticMetamodel(Husband.class)
public class Husband_ { 

    public static volatile SingularAttribute<Husband, Wife> wife;
    public static volatile SingularAttribute<Husband, String> name;
    public static volatile SingularAttribute<Husband, Long> id;

}