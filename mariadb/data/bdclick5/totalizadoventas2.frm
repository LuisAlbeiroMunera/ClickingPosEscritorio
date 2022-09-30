TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega2`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdclick5`.`bdproductosbodega2`.`idSistema`
md5=7adb89a423f51dee24a746cf9f7b9d52
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega2` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega2`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-2\') group by `bdclick5`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
