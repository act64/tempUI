package com.leistudy.uitest.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jinzifu on 16/1/13.
 */
public class WeekySugarData implements Serializable {

    /**
     * dayDataList : [{"header":{"returnVisit":false,"today":false,"weekdayTitle":"一","dateTitle":"18","dateTS":1453046400000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"PAST"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"PAST"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"PAST"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"PAST"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"PAST"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"PAST"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"PAST"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"PAST"}]},{"header":{"returnVisit":false,"today":true,"weekdayTitle":"二","dateTitle":"19","dateTS":1453132800000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"PAST"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"PAST"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"PAST"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"PAST"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"CURRENT"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":false,"today":false,"weekdayTitle":"三","dateTitle":"20","dateTS":1453219200000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":false,"today":false,"weekdayTitle":"四","dateTitle":"21","dateTS":1453305600000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":false,"today":false,"weekdayTitle":"五","dateTitle":"22","dateTS":1453392000000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":false,"today":false,"weekdayTitle":"六","dateTitle":"23","dateTS":1453478400000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":false,"today":false,"weekdayTitle":"日","dateTitle":"24","dateTS":1453564800000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]},{"header":{"returnVisit":true,"today":false,"weekdayTitle":"复诊前日","dateTitle":"2.22","dateTS":1456070400000},"cells":[{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"FUTURE"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"FUTURE"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"FUTURE"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"FUTURE"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"FUTURE"}]}]
     * planTitle : 强化治疗方案
     * planDescInfo : 方案说明方案说明方案说明方案说明方案说明
     * title : 本周
     * mondayTS : 1453089600000
     * planDescTitle : 方案说明
     * thisWeek : true
     */

    private String planTitle;
    private String planDescInfo;
    private String title;
    private long mondayTS;
    private String planDescTitle;
    private boolean thisWeek;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * header : {"returnVisit":false,"today":false,"weekdayTitle":"一","dateTitle":"18","dateTS":1453046400000}
     * cells : [{"period":"MIDNIGHT","qualifiedAndValue":{"qualified":"QUALIFIED","value":5.6},"recommended":false,"timeState":"PAST"},{"period":"PRE_BREAKFAST","qualifiedAndValue":null,"recommended":true,"timeState":"PAST"},{"period":"POST_BREAKFAST","qualifiedAndValue":{"qualified":"LOW","value":3},"recommended":true,"timeState":"PAST"},{"period":"PRE_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":false,"timeState":"PAST"},{"period":"POST_LAUNCH","qualifiedAndValue":{"qualified":"HIGH","value":10},"recommended":true,"timeState":"PAST"},{"period":"PRE_SUPPER","qualifiedAndValue":null,"recommended":true,"timeState":"PAST"},{"period":"POST_SUPPER","qualifiedAndValue":null,"recommended":false,"timeState":"PAST"},{"period":"PRE_SLEEP","qualifiedAndValue":null,"recommended":false,"timeState":"PAST"}]
     */

    private List<DayDataListEntity> dayDataList;

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public void setPlanDescInfo(String planDescInfo) {
        this.planDescInfo = planDescInfo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMondayTS(long mondayTS) {
        this.mondayTS = mondayTS;
    }

    public void setPlanDescTitle(String planDescTitle) {
        this.planDescTitle = planDescTitle;
    }

    public void setThisWeek(boolean thisWeek) {
        this.thisWeek = thisWeek;
    }

    public void setDayDataList(List<DayDataListEntity> dayDataList) {
        this.dayDataList = dayDataList;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public String getPlanDescInfo() {
        return planDescInfo;
    }

    public String getTitle() {
        return title;
    }

    public long getMondayTS() {
        return mondayTS;
    }

    public String getPlanDescTitle() {
        return planDescTitle;
    }

    public boolean isThisWeek() {
        return thisWeek;
    }

    public List<DayDataListEntity> getDayDataList() {
        return dayDataList;
    }

    public static class DayDataListEntity {
        /**
         * returnVisit : false
         * today : false
         * weekdayTitle : 一
         * dateTitle : 18
         * dateTS : 1453046400000
         */

        private HeaderEntity header;
        /**
         * period : MIDNIGHT
         * qualifiedAndValue : {"qualified":"QUALIFIED","value":5.6}
         * recommended : false
         * timeState : PAST
         */

        private List<CellsEntity> cells;

        public void setHeader(HeaderEntity header) {
            this.header = header;
        }

        public void setCells(List<CellsEntity> cells) {
            this.cells = cells;
        }

        public HeaderEntity getHeader() {
            return header;
        }

        public List<CellsEntity> getCells() {
            return cells;
        }

        public static class HeaderEntity {
            private boolean returnVisit;
            private boolean today;
            private String weekdayTitle;
            private String dateTitle;
            private long dateTS;

            public void setReturnVisit(boolean returnVisit) {
                this.returnVisit = returnVisit;
            }

            public void setToday(boolean today) {
                this.today = today;
            }

            public void setWeekdayTitle(String weekdayTitle) {
                this.weekdayTitle = weekdayTitle;
            }

            public void setDateTitle(String dateTitle) {
                this.dateTitle = dateTitle;
            }

            public void setDateTS(long dateTS) {
                this.dateTS = dateTS;
            }

            public boolean isReturnVisit() {
                return returnVisit;
            }

            public boolean isToday() {
                return today;
            }

            public String getWeekdayTitle() {
                return weekdayTitle;
            }

            public String getDateTitle() {
                return dateTitle;
            }

            public long getDateTS() {
                return dateTS;
            }
        }

        public static class CellsEntity {
            private String period;
            /**
             * qualified : QUALIFIED
             * value : 5.6
             */

            private QualifiedAndValueEntity qualifiedAndValue;
            private boolean recommended;
            private String timeState;
            private String comment;

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public void setQualifiedAndValue(QualifiedAndValueEntity qualifiedAndValue) {
                this.qualifiedAndValue = qualifiedAndValue;
            }

            public void setRecommended(boolean recommended) {
                this.recommended = recommended;
            }

            public void setTimeState(String timeState) {
                this.timeState = timeState;
            }

            public String getPeriod() {
                return period;
            }

            public QualifiedAndValueEntity getQualifiedAndValue() {
                return qualifiedAndValue;
            }

            public boolean isRecommended() {
                return recommended;
            }

            public String getTimeState() {
                return timeState;
            }

            public static class QualifiedAndValueEntity {
                private String qualified;
                private float value;

                public void setQualified(String qualified) {
                    this.qualified = qualified;
                }

                public void setValue(float value) {
                    this.value = value;
                }

                public String getQualified() {
                    return qualified;
                }

                public float getValue() {
                    return value;
                }
            }
        }
    }
}
