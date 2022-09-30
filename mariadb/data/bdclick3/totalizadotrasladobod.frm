TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`trasladobod`.`cantidad`),\'0\',`bdclick3`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`trasladobod` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`trasladobod`.`producto`))) group by `bdclick3`.`bdproductos`.`idSistema`
md5=4bc96539af0576e7da2330f3681a8c5c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`trasladobod`.`cantidad`),\'0\',`bdclick3`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`trasladobod` on((`bdclick3`.`bdproductos`.`idSistema` = `bdclick3`.`trasladobod`.`producto`))) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
