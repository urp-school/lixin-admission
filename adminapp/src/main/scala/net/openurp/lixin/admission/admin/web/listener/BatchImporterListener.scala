/*
 * OpenURP, Agile University Resource Planning Solution.
 *
 * Copyright © 2005, The OpenURP Software.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.openurp.lixin.admission.admin.web.listener

import org.beangle.data.dao.EntityDao
import org.beangle.data.transfer.AbstractTransferListener
import org.beangle.data.transfer.TransferResult

/**
 * @author zhouqi 2018年1月31日
 *
 */
class BatchImporterListener(entityDao: EntityDao) extends AbstractTransferListener {

  override def onItemStart(tr: TransferResult): Unit = {
    val name = transfer.curData("name")
    println(name)
  }
}