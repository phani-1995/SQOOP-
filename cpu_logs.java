// ORM class for table 'cpu_logs'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed May 06 11:18:22 IST 2020
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class cpu_logs extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("user_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpu_logs.this.user_name = (String)value;
      }
    });
    setters.put("idle_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpu_logs.this.idle_time = (java.sql.Time)value;
      }
    });
    setters.put("working_hours", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpu_logs.this.working_hours = (java.sql.Time)value;
      }
    });
    setters.put("start_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpu_logs.this.start_time = (java.sql.Time)value;
      }
    });
    setters.put("end_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpu_logs.this.end_time = (java.sql.Time)value;
      }
    });
  }
  public cpu_logs() {
    init0();
  }
  private String user_name;
  public String get_user_name() {
    return user_name;
  }
  public void set_user_name(String user_name) {
    this.user_name = user_name;
  }
  public cpu_logs with_user_name(String user_name) {
    this.user_name = user_name;
    return this;
  }
  private java.sql.Time idle_time;
  public java.sql.Time get_idle_time() {
    return idle_time;
  }
  public void set_idle_time(java.sql.Time idle_time) {
    this.idle_time = idle_time;
  }
  public cpu_logs with_idle_time(java.sql.Time idle_time) {
    this.idle_time = idle_time;
    return this;
  }
  private java.sql.Time working_hours;
  public java.sql.Time get_working_hours() {
    return working_hours;
  }
  public void set_working_hours(java.sql.Time working_hours) {
    this.working_hours = working_hours;
  }
  public cpu_logs with_working_hours(java.sql.Time working_hours) {
    this.working_hours = working_hours;
    return this;
  }
  private java.sql.Time start_time;
  public java.sql.Time get_start_time() {
    return start_time;
  }
  public void set_start_time(java.sql.Time start_time) {
    this.start_time = start_time;
  }
  public cpu_logs with_start_time(java.sql.Time start_time) {
    this.start_time = start_time;
    return this;
  }
  private java.sql.Time end_time;
  public java.sql.Time get_end_time() {
    return end_time;
  }
  public void set_end_time(java.sql.Time end_time) {
    this.end_time = end_time;
  }
  public cpu_logs with_end_time(java.sql.Time end_time) {
    this.end_time = end_time;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cpu_logs)) {
      return false;
    }
    cpu_logs that = (cpu_logs) o;
    boolean equal = true;
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.idle_time == null ? that.idle_time == null : this.idle_time.equals(that.idle_time));
    equal = equal && (this.working_hours == null ? that.working_hours == null : this.working_hours.equals(that.working_hours));
    equal = equal && (this.start_time == null ? that.start_time == null : this.start_time.equals(that.start_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cpu_logs)) {
      return false;
    }
    cpu_logs that = (cpu_logs) o;
    boolean equal = true;
    equal = equal && (this.user_name == null ? that.user_name == null : this.user_name.equals(that.user_name));
    equal = equal && (this.idle_time == null ? that.idle_time == null : this.idle_time.equals(that.idle_time));
    equal = equal && (this.working_hours == null ? that.working_hours == null : this.working_hours.equals(that.working_hours));
    equal = equal && (this.start_time == null ? that.start_time == null : this.start_time.equals(that.start_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.user_name = JdbcWritableBridge.readString(1, __dbResults);
    this.idle_time = JdbcWritableBridge.readTime(2, __dbResults);
    this.working_hours = JdbcWritableBridge.readTime(3, __dbResults);
    this.start_time = JdbcWritableBridge.readTime(4, __dbResults);
    this.end_time = JdbcWritableBridge.readTime(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.user_name = JdbcWritableBridge.readString(1, __dbResults);
    this.idle_time = JdbcWritableBridge.readTime(2, __dbResults);
    this.working_hours = JdbcWritableBridge.readTime(3, __dbResults);
    this.start_time = JdbcWritableBridge.readTime(4, __dbResults);
    this.end_time = JdbcWritableBridge.readTime(5, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(user_name, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(idle_time, 2 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(working_hours, 3 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(start_time, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(end_time, 5 + __off, 92, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(user_name, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(idle_time, 2 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(working_hours, 3 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(start_time, 4 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeTime(end_time, 5 + __off, 92, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.user_name = null;
    } else {
    this.user_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.idle_time = null;
    } else {
    this.idle_time = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.working_hours = null;
    } else {
    this.working_hours = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.start_time = null;
    } else {
    this.start_time = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.end_time = null;
    } else {
    this.end_time = new Time(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.idle_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.idle_time.getTime());
    }
    if (null == this.working_hours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.working_hours.getTime());
    }
    if (null == this.start_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time.getTime());
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.user_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_name);
    }
    if (null == this.idle_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.idle_time.getTime());
    }
    if (null == this.working_hours) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.working_hours.getTime());
    }
    if (null == this.start_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time.getTime());
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time.getTime());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"null":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idle_time==null?"null":"" + idle_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(working_hours==null?"null":"" + working_hours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time==null?"null":"" + start_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(user_name==null?"null":user_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idle_time==null?"null":"" + idle_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(working_hours==null?"null":"" + working_hours, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time==null?"null":"" + start_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idle_time = null; } else {
      this.idle_time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.working_hours = null; } else {
      this.working_hours = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time = null; } else {
      this.start_time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = java.sql.Time.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_name = null; } else {
      this.user_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idle_time = null; } else {
      this.idle_time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.working_hours = null; } else {
      this.working_hours = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time = null; } else {
      this.start_time = java.sql.Time.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = java.sql.Time.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    cpu_logs o = (cpu_logs) super.clone();
    o.idle_time = (o.idle_time != null) ? (java.sql.Time) o.idle_time.clone() : null;
    o.working_hours = (o.working_hours != null) ? (java.sql.Time) o.working_hours.clone() : null;
    o.start_time = (o.start_time != null) ? (java.sql.Time) o.start_time.clone() : null;
    o.end_time = (o.end_time != null) ? (java.sql.Time) o.end_time.clone() : null;
    return o;
  }

  public void clone0(cpu_logs o) throws CloneNotSupportedException {
    o.idle_time = (o.idle_time != null) ? (java.sql.Time) o.idle_time.clone() : null;
    o.working_hours = (o.working_hours != null) ? (java.sql.Time) o.working_hours.clone() : null;
    o.start_time = (o.start_time != null) ? (java.sql.Time) o.start_time.clone() : null;
    o.end_time = (o.end_time != null) ? (java.sql.Time) o.end_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("idle_time", this.idle_time);
    __sqoop$field_map.put("working_hours", this.working_hours);
    __sqoop$field_map.put("start_time", this.start_time);
    __sqoop$field_map.put("end_time", this.end_time);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("user_name", this.user_name);
    __sqoop$field_map.put("idle_time", this.idle_time);
    __sqoop$field_map.put("working_hours", this.working_hours);
    __sqoop$field_map.put("start_time", this.start_time);
    __sqoop$field_map.put("end_time", this.end_time);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
