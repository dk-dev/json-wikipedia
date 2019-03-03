/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package it.cnr.isti.hpc.wikipedia.article;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Link extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8838088169692285409L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Link\",\"namespace\":\"it.cnr.isti.hpc.wikipedia\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"anchor\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"start\",\"type\":\"int\",\"doc\":\"where the anchor starts in the text\"},{\"name\":\"end\",\"type\":\"int\",\"doc\":\"where the anchor ends in the text\"},{\"name\":\"paragraphId\",\"type\":[\"null\",\"int\"],\"doc\":\"if it occurs in a paragraph, the item in the list\",\"default\":null},{\"name\":\"listId\",\"type\":[\"null\",\"int\"],\"doc\":\" if it occurs in a list, the ordinal of the list among all the lists\",\"default\":null},{\"name\":\"listItem\",\"type\":[\"null\",\"int\"],\"doc\":\"if it occurs in a  list, the item in the list\",\"default\":null},{\"name\":\"tableId\",\"type\":[\"null\",\"int\"],\"doc\":\"if it occurs in a table, the ordinal of the table among all the tables\",\"default\":null},{\"name\":\"rowId\",\"type\":[\"null\",\"int\"],\"doc\":\"if it occurs in a table, the ordinal of the row\",\"default\":null},{\"name\":\"columnId\",\"type\":[\"null\",\"int\"],\"doc\":\"if it occurs in a table, the ordinal of the column\",\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"LinkType\",\"symbols\":[\"BODY\",\"TABLE\",\"LIST\",\"IMAGE\",\"UNKNOWN\",\"CATEGORY\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public java.lang.String anchor;
  /** where the anchor starts in the text */
  @Deprecated public int start;
  /** where the anchor ends in the text */
  @Deprecated public int end;
  /** if it occurs in a paragraph, the item in the list */
  @Deprecated public java.lang.Integer paragraphId;
  /**  if it occurs in a list, the ordinal of the list among all the lists */
  @Deprecated public java.lang.Integer listId;
  /** if it occurs in a  list, the item in the list */
  @Deprecated public java.lang.Integer listItem;
  /** if it occurs in a table, the ordinal of the table among all the tables */
  @Deprecated public java.lang.Integer tableId;
  /** if it occurs in a table, the ordinal of the row */
  @Deprecated public java.lang.Integer rowId;
  /** if it occurs in a table, the ordinal of the column */
  @Deprecated public java.lang.Integer columnId;
  @Deprecated public LinkType type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Link() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param anchor The new value for anchor
   * @param start where the anchor starts in the text
   * @param end where the anchor ends in the text
   * @param paragraphId if it occurs in a paragraph, the item in the list
   * @param listId  if it occurs in a list, the ordinal of the list among all the lists
   * @param listItem if it occurs in a  list, the item in the list
   * @param tableId if it occurs in a table, the ordinal of the table among all the tables
   * @param rowId if it occurs in a table, the ordinal of the row
   * @param columnId if it occurs in a table, the ordinal of the column
   * @param type The new value for type
   */
  public Link(java.lang.String id, java.lang.String anchor, java.lang.Integer start, java.lang.Integer end, java.lang.Integer paragraphId, java.lang.Integer listId, java.lang.Integer listItem, java.lang.Integer tableId, java.lang.Integer rowId, java.lang.Integer columnId, LinkType type) {
    this.id = id;
    this.anchor = anchor;
    this.start = start;
    this.end = end;
    this.paragraphId = paragraphId;
    this.listId = listId;
    this.listItem = listItem;
    this.tableId = tableId;
    this.rowId = rowId;
    this.columnId = columnId;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return anchor;
    case 2: return start;
    case 3: return end;
    case 4: return paragraphId;
    case 5: return listId;
    case 6: return listItem;
    case 7: return tableId;
    case 8: return rowId;
    case 9: return columnId;
    case 10: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: anchor = (java.lang.String)value$; break;
    case 2: start = (java.lang.Integer)value$; break;
    case 3: end = (java.lang.Integer)value$; break;
    case 4: paragraphId = (java.lang.Integer)value$; break;
    case 5: listId = (java.lang.Integer)value$; break;
    case 6: listItem = (java.lang.Integer)value$; break;
    case 7: tableId = (java.lang.Integer)value$; break;
    case 8: rowId = (java.lang.Integer)value$; break;
    case 9: columnId = (java.lang.Integer)value$; break;
    case 10: type = (LinkType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'anchor' field.
   * @return The value of the 'anchor' field.
   */
  public java.lang.String getAnchor() {
    return anchor;
  }

  /**
   * Sets the value of the 'anchor' field.
   * @param value the value to set.
   */
  public void setAnchor(java.lang.String value) {
    this.anchor = value;
  }

  /**
   * Gets the value of the 'start' field.
   * @return where the anchor starts in the text
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * where the anchor starts in the text
   * @param value the value to set.
   */
  public void setStart(java.lang.Integer value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   * @return where the anchor ends in the text
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * where the anchor ends in the text
   * @param value the value to set.
   */
  public void setEnd(java.lang.Integer value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'paragraphId' field.
   * @return if it occurs in a paragraph, the item in the list
   */
  public java.lang.Integer getParagraphId() {
    return paragraphId;
  }

  /**
   * Sets the value of the 'paragraphId' field.
   * if it occurs in a paragraph, the item in the list
   * @param value the value to set.
   */
  public void setParagraphId(java.lang.Integer value) {
    this.paragraphId = value;
  }

  /**
   * Gets the value of the 'listId' field.
   * @return  if it occurs in a list, the ordinal of the list among all the lists
   */
  public java.lang.Integer getListId() {
    return listId;
  }

  /**
   * Sets the value of the 'listId' field.
   *  if it occurs in a list, the ordinal of the list among all the lists
   * @param value the value to set.
   */
  public void setListId(java.lang.Integer value) {
    this.listId = value;
  }

  /**
   * Gets the value of the 'listItem' field.
   * @return if it occurs in a  list, the item in the list
   */
  public java.lang.Integer getListItem() {
    return listItem;
  }

  /**
   * Sets the value of the 'listItem' field.
   * if it occurs in a  list, the item in the list
   * @param value the value to set.
   */
  public void setListItem(java.lang.Integer value) {
    this.listItem = value;
  }

  /**
   * Gets the value of the 'tableId' field.
   * @return if it occurs in a table, the ordinal of the table among all the tables
   */
  public java.lang.Integer getTableId() {
    return tableId;
  }

  /**
   * Sets the value of the 'tableId' field.
   * if it occurs in a table, the ordinal of the table among all the tables
   * @param value the value to set.
   */
  public void setTableId(java.lang.Integer value) {
    this.tableId = value;
  }

  /**
   * Gets the value of the 'rowId' field.
   * @return if it occurs in a table, the ordinal of the row
   */
  public java.lang.Integer getRowId() {
    return rowId;
  }

  /**
   * Sets the value of the 'rowId' field.
   * if it occurs in a table, the ordinal of the row
   * @param value the value to set.
   */
  public void setRowId(java.lang.Integer value) {
    this.rowId = value;
  }

  /**
   * Gets the value of the 'columnId' field.
   * @return if it occurs in a table, the ordinal of the column
   */
  public java.lang.Integer getColumnId() {
    return columnId;
  }

  /**
   * Sets the value of the 'columnId' field.
   * if it occurs in a table, the ordinal of the column
   * @param value the value to set.
   */
  public void setColumnId(java.lang.Integer value) {
    this.columnId = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public LinkType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(LinkType value) {
    this.type = value;
  }

  /**
   * Creates a new Link RecordBuilder.
   * @return A new Link RecordBuilder
   */
  public static Link.Builder newBuilder() {
    return new Link.Builder();
  }

  /**
   * Creates a new Link RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Link RecordBuilder
   */
  public static Link.Builder newBuilder(Link.Builder other) {
    return new Link.Builder(other);
  }

  /**
   * Creates a new Link RecordBuilder by copying an existing Link instance.
   * @param other The existing instance to copy.
   * @return A new Link RecordBuilder
   */
  public static Link.Builder newBuilder(Link other) {
    return new Link.Builder(other);
  }

  /**
   * RecordBuilder for Link instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Link>
    implements org.apache.avro.data.RecordBuilder<Link> {

    private java.lang.String id;
    private java.lang.String anchor;
    /** where the anchor starts in the text */
    private int start;
    /** where the anchor ends in the text */
    private int end;
    /** if it occurs in a paragraph, the item in the list */
    private java.lang.Integer paragraphId;
    /**  if it occurs in a list, the ordinal of the list among all the lists */
    private java.lang.Integer listId;
    /** if it occurs in a  list, the item in the list */
    private java.lang.Integer listItem;
    /** if it occurs in a table, the ordinal of the table among all the tables */
    private java.lang.Integer tableId;
    /** if it occurs in a table, the ordinal of the row */
    private java.lang.Integer rowId;
    /** if it occurs in a table, the ordinal of the column */
    private java.lang.Integer columnId;
    private LinkType type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Link.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.anchor)) {
        this.anchor = data().deepCopy(fields()[1].schema(), other.anchor);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.paragraphId)) {
        this.paragraphId = data().deepCopy(fields()[4].schema(), other.paragraphId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.listId)) {
        this.listId = data().deepCopy(fields()[5].schema(), other.listId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.listItem)) {
        this.listItem = data().deepCopy(fields()[6].schema(), other.listItem);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.tableId)) {
        this.tableId = data().deepCopy(fields()[7].schema(), other.tableId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.rowId)) {
        this.rowId = data().deepCopy(fields()[8].schema(), other.rowId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.columnId)) {
        this.columnId = data().deepCopy(fields()[9].schema(), other.columnId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.type)) {
        this.type = data().deepCopy(fields()[10].schema(), other.type);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Link instance
     * @param other The existing instance to copy.
     */
    private Builder(Link other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.anchor)) {
        this.anchor = data().deepCopy(fields()[1].schema(), other.anchor);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start)) {
        this.start = data().deepCopy(fields()[2].schema(), other.start);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end)) {
        this.end = data().deepCopy(fields()[3].schema(), other.end);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.paragraphId)) {
        this.paragraphId = data().deepCopy(fields()[4].schema(), other.paragraphId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.listId)) {
        this.listId = data().deepCopy(fields()[5].schema(), other.listId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.listItem)) {
        this.listItem = data().deepCopy(fields()[6].schema(), other.listItem);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.tableId)) {
        this.tableId = data().deepCopy(fields()[7].schema(), other.tableId);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.rowId)) {
        this.rowId = data().deepCopy(fields()[8].schema(), other.rowId);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.columnId)) {
        this.columnId = data().deepCopy(fields()[9].schema(), other.columnId);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.type)) {
        this.type = data().deepCopy(fields()[10].schema(), other.type);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Link.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Link.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'anchor' field.
      * @return The value.
      */
    public java.lang.String getAnchor() {
      return anchor;
    }

    /**
      * Sets the value of the 'anchor' field.
      * @param value The value of 'anchor'.
      * @return This builder.
      */
    public Link.Builder setAnchor(java.lang.String value) {
      validate(fields()[1], value);
      this.anchor = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'anchor' field has been set.
      * @return True if the 'anchor' field has been set, false otherwise.
      */
    public boolean hasAnchor() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'anchor' field.
      * @return This builder.
      */
    public Link.Builder clearAnchor() {
      anchor = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'start' field.
      * where the anchor starts in the text
      * @return The value.
      */
    public java.lang.Integer getStart() {
      return start;
    }

    /**
      * Sets the value of the 'start' field.
      * where the anchor starts in the text
      * @param value The value of 'start'.
      * @return This builder.
      */
    public Link.Builder setStart(int value) {
      validate(fields()[2], value);
      this.start = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'start' field has been set.
      * where the anchor starts in the text
      * @return True if the 'start' field has been set, false otherwise.
      */
    public boolean hasStart() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'start' field.
      * where the anchor starts in the text
      * @return This builder.
      */
    public Link.Builder clearStart() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'end' field.
      * where the anchor ends in the text
      * @return The value.
      */
    public java.lang.Integer getEnd() {
      return end;
    }

    /**
      * Sets the value of the 'end' field.
      * where the anchor ends in the text
      * @param value The value of 'end'.
      * @return This builder.
      */
    public Link.Builder setEnd(int value) {
      validate(fields()[3], value);
      this.end = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'end' field has been set.
      * where the anchor ends in the text
      * @return True if the 'end' field has been set, false otherwise.
      */
    public boolean hasEnd() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'end' field.
      * where the anchor ends in the text
      * @return This builder.
      */
    public Link.Builder clearEnd() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'paragraphId' field.
      * if it occurs in a paragraph, the item in the list
      * @return The value.
      */
    public java.lang.Integer getParagraphId() {
      return paragraphId;
    }

    /**
      * Sets the value of the 'paragraphId' field.
      * if it occurs in a paragraph, the item in the list
      * @param value The value of 'paragraphId'.
      * @return This builder.
      */
    public Link.Builder setParagraphId(java.lang.Integer value) {
      validate(fields()[4], value);
      this.paragraphId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'paragraphId' field has been set.
      * if it occurs in a paragraph, the item in the list
      * @return True if the 'paragraphId' field has been set, false otherwise.
      */
    public boolean hasParagraphId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'paragraphId' field.
      * if it occurs in a paragraph, the item in the list
      * @return This builder.
      */
    public Link.Builder clearParagraphId() {
      paragraphId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'listId' field.
      *  if it occurs in a list, the ordinal of the list among all the lists
      * @return The value.
      */
    public java.lang.Integer getListId() {
      return listId;
    }

    /**
      * Sets the value of the 'listId' field.
      *  if it occurs in a list, the ordinal of the list among all the lists
      * @param value The value of 'listId'.
      * @return This builder.
      */
    public Link.Builder setListId(java.lang.Integer value) {
      validate(fields()[5], value);
      this.listId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'listId' field has been set.
      *  if it occurs in a list, the ordinal of the list among all the lists
      * @return True if the 'listId' field has been set, false otherwise.
      */
    public boolean hasListId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'listId' field.
      *  if it occurs in a list, the ordinal of the list among all the lists
      * @return This builder.
      */
    public Link.Builder clearListId() {
      listId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'listItem' field.
      * if it occurs in a  list, the item in the list
      * @return The value.
      */
    public java.lang.Integer getListItem() {
      return listItem;
    }

    /**
      * Sets the value of the 'listItem' field.
      * if it occurs in a  list, the item in the list
      * @param value The value of 'listItem'.
      * @return This builder.
      */
    public Link.Builder setListItem(java.lang.Integer value) {
      validate(fields()[6], value);
      this.listItem = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'listItem' field has been set.
      * if it occurs in a  list, the item in the list
      * @return True if the 'listItem' field has been set, false otherwise.
      */
    public boolean hasListItem() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'listItem' field.
      * if it occurs in a  list, the item in the list
      * @return This builder.
      */
    public Link.Builder clearListItem() {
      listItem = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'tableId' field.
      * if it occurs in a table, the ordinal of the table among all the tables
      * @return The value.
      */
    public java.lang.Integer getTableId() {
      return tableId;
    }

    /**
      * Sets the value of the 'tableId' field.
      * if it occurs in a table, the ordinal of the table among all the tables
      * @param value The value of 'tableId'.
      * @return This builder.
      */
    public Link.Builder setTableId(java.lang.Integer value) {
      validate(fields()[7], value);
      this.tableId = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'tableId' field has been set.
      * if it occurs in a table, the ordinal of the table among all the tables
      * @return True if the 'tableId' field has been set, false otherwise.
      */
    public boolean hasTableId() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'tableId' field.
      * if it occurs in a table, the ordinal of the table among all the tables
      * @return This builder.
      */
    public Link.Builder clearTableId() {
      tableId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'rowId' field.
      * if it occurs in a table, the ordinal of the row
      * @return The value.
      */
    public java.lang.Integer getRowId() {
      return rowId;
    }

    /**
      * Sets the value of the 'rowId' field.
      * if it occurs in a table, the ordinal of the row
      * @param value The value of 'rowId'.
      * @return This builder.
      */
    public Link.Builder setRowId(java.lang.Integer value) {
      validate(fields()[8], value);
      this.rowId = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'rowId' field has been set.
      * if it occurs in a table, the ordinal of the row
      * @return True if the 'rowId' field has been set, false otherwise.
      */
    public boolean hasRowId() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'rowId' field.
      * if it occurs in a table, the ordinal of the row
      * @return This builder.
      */
    public Link.Builder clearRowId() {
      rowId = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'columnId' field.
      * if it occurs in a table, the ordinal of the column
      * @return The value.
      */
    public java.lang.Integer getColumnId() {
      return columnId;
    }

    /**
      * Sets the value of the 'columnId' field.
      * if it occurs in a table, the ordinal of the column
      * @param value The value of 'columnId'.
      * @return This builder.
      */
    public Link.Builder setColumnId(java.lang.Integer value) {
      validate(fields()[9], value);
      this.columnId = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'columnId' field has been set.
      * if it occurs in a table, the ordinal of the column
      * @return True if the 'columnId' field has been set, false otherwise.
      */
    public boolean hasColumnId() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'columnId' field.
      * if it occurs in a table, the ordinal of the column
      * @return This builder.
      */
    public Link.Builder clearColumnId() {
      columnId = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public LinkType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public Link.Builder setType(LinkType value) {
      validate(fields()[10], value);
      this.type = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public Link.Builder clearType() {
      type = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public Link build() {
      try {
        Link record = new Link();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.anchor = fieldSetFlags()[1] ? this.anchor : (java.lang.String) defaultValue(fields()[1]);
        record.start = fieldSetFlags()[2] ? this.start : (java.lang.Integer) defaultValue(fields()[2]);
        record.end = fieldSetFlags()[3] ? this.end : (java.lang.Integer) defaultValue(fields()[3]);
        record.paragraphId = fieldSetFlags()[4] ? this.paragraphId : (java.lang.Integer) defaultValue(fields()[4]);
        record.listId = fieldSetFlags()[5] ? this.listId : (java.lang.Integer) defaultValue(fields()[5]);
        record.listItem = fieldSetFlags()[6] ? this.listItem : (java.lang.Integer) defaultValue(fields()[6]);
        record.tableId = fieldSetFlags()[7] ? this.tableId : (java.lang.Integer) defaultValue(fields()[7]);
        record.rowId = fieldSetFlags()[8] ? this.rowId : (java.lang.Integer) defaultValue(fields()[8]);
        record.columnId = fieldSetFlags()[9] ? this.columnId : (java.lang.Integer) defaultValue(fields()[9]);
        record.type = fieldSetFlags()[10] ? this.type : (LinkType) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
