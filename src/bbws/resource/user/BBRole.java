/*
    Blackboard WebServices Serializable Objects
    Copyright (C) 2011-2013 Andrew Martin, Newcastle University

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbws.resource.user;

//javax
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BBRole
{
    private String roleId;
    private String roleName;

    public BBRole(){}
//    public BBRole(PortalRole pr)
//    {
//	this.roleId = pr.getRoleID();
//	this.roleName = pr.getRoleName();
//    }
//    public BBRole(SystemRole sr)
//    {
//	this.roleId = sr.getIdentifier();
//	this.roleName = sr.getName();
//    }
//    public BBRole(CourseMembership cm)
//    {
//	this.roleName = cm.getRole().toFieldName();
//    }

    public String getRoleId()
    {
	return this.roleId;
    }

    public void setRoleId(String roleId)
    {
	this.roleId = roleId;
    }

    public String getRoleName()
    {
	return this.roleName;
    }

    public void setRoleName(String roleName)
    {
	this.roleName = roleName;
    }
}
