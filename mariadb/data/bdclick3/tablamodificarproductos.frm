TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`costo` AS `costo`,`bdclick3`.`bdproductos`.`L1` AS `L1`,(`bdclick3`.`bdproductos`.`L1` - `bdclick3`.`bdproductos`.`costo`) AS `U1`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L1` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R1`,`bdclick3`.`bdproductos`.`L2` AS `L2`,(`bdclick3`.`bdproductos`.`L2` - `bdclick3`.`bdproductos`.`costo`) AS `U2`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L2` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R2`,`bdclick3`.`bdproductos`.`L3` AS `L3`,(`bdclick3`.`bdproductos`.`L3` - `bdclick3`.`bdproductos`.`costo`) AS `U3`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L3` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R3`,`bdclick3`.`bdproductos`.`L4` AS `L4`,(`bdclick3`.`bdproductos`.`L4` - `bdclick3`.`bdproductos`.`costo`) AS `U4`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L4` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor` from `bdclick3`.`bdproductos`)
md5=33a3243af8ea54eddef8522c3f69e928
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:54
create-version=2
source=(select `bdproductos`.`idSistema` AS `idSistema`,`bdproductos`.`Codigo` AS `Codigo`,`bdproductos`.`Descripcion` AS `Descripcion`,`bdproductos`.`costo` AS `costo`,`bdproductos`.`L1` AS `L1`,(`bdproductos`.`L1` - `bdproductos`.`costo`) AS `U1`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L1` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R1`,`bdproductos`.`L2` AS `L2`,(`bdproductos`.`L2` - `bdproductos`.`costo`) AS `U2`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L2` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R2`,`bdproductos`.`L3` AS `L3`,(`bdproductos`.`L3` - `bdproductos`.`costo`) AS `U3`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L3` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R3`,`bdproductos`.`L4` AS `L4`,(`bdproductos`.`L4` - `bdproductos`.`costo`) AS `U4`,if((`bdproductos`.`costo` = 0),100,round((((`bdproductos`.`L4` - `bdproductos`.`costo`) / `bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdproductos`.`grupo` AS `Grupo`,`bdproductos`.`Proveedor` AS `Proveedor` from `bdproductos`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`idSistema` AS `idSistema`,`bdclick3`.`bdproductos`.`Codigo` AS `Codigo`,`bdclick3`.`bdproductos`.`Descripcion` AS `Descripcion`,`bdclick3`.`bdproductos`.`costo` AS `costo`,`bdclick3`.`bdproductos`.`L1` AS `L1`,(`bdclick3`.`bdproductos`.`L1` - `bdclick3`.`bdproductos`.`costo`) AS `U1`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L1` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R1`,`bdclick3`.`bdproductos`.`L2` AS `L2`,(`bdclick3`.`bdproductos`.`L2` - `bdclick3`.`bdproductos`.`costo`) AS `U2`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L2` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R2`,`bdclick3`.`bdproductos`.`L3` AS `L3`,(`bdclick3`.`bdproductos`.`L3` - `bdclick3`.`bdproductos`.`costo`) AS `U3`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L3` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R3`,`bdclick3`.`bdproductos`.`L4` AS `L4`,(`bdclick3`.`bdproductos`.`L4` - `bdclick3`.`bdproductos`.`costo`) AS `U4`,if((`bdclick3`.`bdproductos`.`costo` = 0),100,round((((`bdclick3`.`bdproductos`.`L4` - `bdclick3`.`bdproductos`.`costo`) / `bdclick3`.`bdproductos`.`costo`) * 100),2)) AS `R4`,1 AS `seleccionar`,`bdclick3`.`bdproductos`.`grupo` AS `Grupo`,`bdclick3`.`bdproductos`.`Proveedor` AS `Proveedor` from `bdclick3`.`bdproductos`)
mariadb-version=100135