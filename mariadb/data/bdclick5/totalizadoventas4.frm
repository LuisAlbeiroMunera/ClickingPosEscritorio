TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
md5=fb81829e2e0c4acfb0ebba278a2c0519
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdfactura`.`cantidad`),\'0\',`bdclick5`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega4` left join `bdclick5`.`bdfactura` on((`bdclick5`.`bdfactura`.`producto` = `bdclick5`.`bdproductosbodega4`.`idSistema`))) where (`bdclick5`.`bdfactura`.`bodega` = \'BODEGA-4\') group by `bdclick5`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
