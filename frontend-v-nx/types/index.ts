export interface Permission {
  permission: string;
  permType: 'VIEW' | 'CONTROLLER' | 'SERVICE';
}

export interface Role {
  role: string;
  rolePermission: Permission[];
}

export interface User {
  id: string;
  login: 'Y' | 'N' | '';
  admin: 'Y' | 'N';
  accessToken: string;
  refreshToken: string;
  roleList: Role[];
  permList: any[];
}

export interface MenuItem {
  id: string;
  name: string;
  icon: string;
  url: string;
  items: MenuItem[];
}

export interface Program {
  progId: string;
  name: string;
  url: string;
  itemType?: string;
}

export interface BaseState {
  user: User;
  menuList: MenuItem[];
  progList: Program[];
}
