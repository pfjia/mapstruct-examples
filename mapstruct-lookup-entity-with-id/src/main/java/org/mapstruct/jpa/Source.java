package org.mapstruct.jpa;

/**
 *
 * <p/>
 *
 * @author <a href="mailto:miaoshuo.jpf@alibaba-inc.com">miaoshuo.jpf</a>
 * @version 1.0.0
 * @since 2021-04-13
 * @date 2021/04/13
 */
public class Source {
    private Boolean isRejected;

    public Boolean getRejected() {
        return isRejected;
    }

    public void setRejected(Boolean rejected) {
        isRejected = rejected;
    }
}
