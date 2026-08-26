/*
 * Copyright 2026 杭州开云集致科技有限公司
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clougence.clouddm.platform.dal.model.approval;

import lombok.Getter;
import lombok.Setter;

/**
 * 工单按数据源(数据库)汇总的统计行。
 * 由 DmApprovalMapper.statTicketByDs 返回，一条 = 一张工单（绑定数据源 + 状态 + 库信息）。
 * 汇总（按数据源/库分组、统计数量）在服务层完成。
 *
 * @author zhangfan
 */
@Getter
@Setter
public class DmTicketStatRow {

    /** 绑定的数据源 ID（dm_approval.bind_ds_id） */
    private Long   bindDsId;

    /** 工单状态（dm_approval.ticket_status） */
    private String status;

    /** 库层级路径 JSON（dm_approval.levels，如 ["schema"] 或 ["catalog","schema"]），库名取最后一个元素 */
    private String levels;

    /** 目标资源路径（dm_approval.target_info，如 /实例ID/库名），库名取最后一个 / 之后 */
    private String targetInfo;

}
