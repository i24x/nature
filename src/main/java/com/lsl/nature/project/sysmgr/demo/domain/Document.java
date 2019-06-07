package com.lsl.nature.project.sysmgr.demo.domain;

import com.lsl.nature.common.db.annotation.DBColumn;
import com.lsl.nature.common.es.annotation.ESField;
import com.lsl.nature.common.es.annotation.FieldType;
import priv.cy.common.es.annotation.FieldType;
import priv.cy.common.db.annotation.DBColumn;
import priv.cy.common.es.annotation.ESField;
import priv.cy.project.common.domain.BaseEntity;
import lombok.Data;

@Data
public class Document {

    @DBColumn("keywords")
    @ESField(type= FieldType.KEYWORD)
    private String keywords;

    @DBColumn("hy_url")
    @ESField(type= FieldType.TEXT)
    private String url;

    @DBColumn("comment")
    @ESField(type= FieldType.TEXT)
    private BaseEntity text;

}